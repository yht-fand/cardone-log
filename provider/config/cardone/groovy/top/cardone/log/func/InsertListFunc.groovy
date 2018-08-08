package top.cardone.log.func

import org.apache.commons.collections.MapUtils
import org.assertj.core.util.Sets
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

        List<IndexQuery> queries = []

        Set<String> indexNames = Sets.newHashSet()

        for (Object object : objects) {
            IndexQuery indexQuery = new IndexQuery()

            indexQuery.setId(UUID.randomUUID().toString())
            indexQuery.setObject(object)
            indexQuery.setIndexName("operate-log-" + MapUtils.getString((Map) object, "objectTypeCode", "default"))
            indexQuery.setType("default")

            queries.add(indexQuery)

            indexNames.add(indexQuery.getIndexName())

            if (queries.size() >= 50) {
                for (def indexName : indexNames) {
                    if (!elasticsearchTemplate.indexExists(indexName)) {
                        elasticsearchTemplate.createIndex(indexName)
                    }
                }

                elasticsearchTemplate.bulkIndex(queries)

                queries.clear()
            }
        }

        if (queries.size() > 0) {
            for (def indexName : indexNames) {
                if (!elasticsearchTemplate.indexExists(indexName)) {
                    elasticsearchTemplate.createIndex(indexName)
                }
            }

            elasticsearchTemplate.bulkIndex(queries)
        }

        new Integer[0]
    }
}