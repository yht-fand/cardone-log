package top.cardone.log.func

import org.apache.commons.collections.MapUtils
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate
import org.springframework.data.elasticsearch.core.query.IndexQuery
import top.cardone.context.ApplicationContextHolder
import top.cardone.core.util.func.Func1

class InsertListFunc implements Func1<Object, List<Object>> {
    @Override
    Object func(List<Object> objects) {
        def elasticsearchTemplate = ApplicationContextHolder.getBean(ElasticsearchTemplate.class)

        if (elasticsearchTemplate == null) {
            new Integer[0]
        }

        if (!elasticsearchTemplate.indexExists("operate-log")) {
            elasticsearchTemplate.createIndex("operate-log")
        }

        List<IndexQuery> queries = []

        for (Object object : objects) {
            IndexQuery indexQuery = new IndexQuery()

            indexQuery.setId(UUID.randomUUID().toString())
            indexQuery.setObject(object)
            indexQuery.setIndexName("operate-log")
            indexQuery.setType(MapUtils.getString((Map) object, "objectTypeCode", "default"))

            queries.add(indexQuery)

            if (queries.size() >= 50) {
                elasticsearchTemplate.bulkIndex(queries)

                queries.clear()
            }
        }

        if (queries.size() > 0) {
            elasticsearchTemplate.bulkIndex(queries)
        }

        new Integer[0]
    }
}