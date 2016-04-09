package top.cardone.log.service;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import top.cardone.cache.Caches;
import top.cardone.data.service.PageService;

import java.util.List;
import java.util.Map;

/**
 * 操作日志服务
 *
 * @author yao hai tao
 */
public interface OperateLogService extends PageService {
	/**
     * @see top.cardone.log.service.OperateLogService#page
     */
    @Cacheable(value = "top.cardone.log.service.OperateLogService", key = Caches.KEY_1)
    Page<Map<String, Object>> pageCache(Object page);

	/**
     * @see top.cardone.log.service.OperateLogService#page
     */
    @Cacheable(value = "top.cardone.log.service.OperateLogService", key = Caches.KEY_2)
    <P> Page<P> pageCache(Class<P> mappedClass, Object page);

	/**
     * @see top.cardone.log.service.OperateLogService#findList
     */
    @Cacheable(value = "top.cardone.log.service.OperateLogService", key = Caches.KEY_2)
    <P> List<P> findListCache(Class<P> mappedClass, Object findList);

	/**
     * @see top.cardone.log.service.OperateLogService#findOne
     */
    @Cacheable(value = "top.cardone.log.service.OperateLogService", key = Caches.KEY_2)
    <P> P findOneCache(Class<P> mappedClass, Object findOne);

	/**
     * @see top.cardone.log.service.OperateLogService#readList
     */
    @Cacheable(value = "top.cardone.log.service.OperateLogService", key = Caches.KEY_2)
    <R> List<R> readListCache(Class<R> requiredType, Object readList);

	/**
     * @see top.cardone.log.service.OperateLogService#readOne
     */
    @Cacheable(value = "top.cardone.log.service.OperateLogService", key = Caches.KEY_2)
    <R> R readOneCache(Class<R> requiredType, Object readOne);

	/**
     * @see top.cardone.log.service.OperateLogService#delete
     */
    @CacheEvict(value = "top.cardone.log.service.OperateLogService", allEntries = true)
    int deleteCache(Object delete);

	/**
     * @see top.cardone.log.service.OperateLogService#deleteAll
     */
    @CacheEvict(value = "top.cardone.log.service.OperateLogService", allEntries = true)
    int deleteAllCache();

	/**
     * @see top.cardone.log.service.OperateLogService#deleteByIds
     */
    @CacheEvict(value = "top.cardone.log.service.OperateLogService", allEntries = true)
    int deleteByIdsCache(Object ids);

	/**
     * @see top.cardone.log.service.OperateLogService#deleteList
     */
    @CacheEvict(value = "top.cardone.log.service.OperateLogService", allEntries = true)
    int[] deleteListCache(List<Object> deleteList);

	/**
     * @see top.cardone.log.service.OperateLogService#findList
     */
    @Cacheable(value = "top.cardone.log.service.OperateLogService", key = Caches.KEY_1)
    List<Map<String, Object>> findListCache(Object findList);

	/**
     * @see top.cardone.log.service.OperateLogService#findOne
     */
    @Cacheable(value = "top.cardone.log.service.OperateLogService", key = Caches.KEY_1)
    Map<String, Object> findOneCache(Object findOne);

	/**
     * @see top.cardone.log.service.OperateLogService#insert
     */
    @CacheEvict(value = "top.cardone.log.service.OperateLogService", allEntries = true)
    int insertCache(Object insert);

	/**
     * @see top.cardone.log.service.OperateLogService#insertByNotExists
     */
    @CacheEvict(value = "top.cardone.log.service.OperateLogService", allEntries = true)
    int insertByNotExistsCache(Object insert);

	/**
     * @see top.cardone.log.service.OperateLogService#insertList
     */
    @CacheEvict(value = "top.cardone.log.service.OperateLogService", allEntries = true)
    int[] insertListCache(List<Object> insertList);

	/**
     * @see top.cardone.log.service.OperateLogService#insertListByNotExists
     */
    @CacheEvict(value = "top.cardone.log.service.OperateLogService", allEntries = true)
    int[] insertListByNotExistsCache(List<Object> insertList);

	/**
     * @see top.cardone.log.service.OperateLogService#readList
     */
    @Cacheable(value = "top.cardone.log.service.OperateLogService", key = Caches.KEY_1)
    List<Object> readListCache(Object readList);

	/**
     * @see top.cardone.log.service.OperateLogService#readOne
     */
    @Cacheable(value = "top.cardone.log.service.OperateLogService", key = Caches.KEY_1)
    Object readOneCache(Object readOne);

	/**
     * @see top.cardone.log.service.OperateLogService#save
     */
    @CacheEvict(value = "top.cardone.log.service.OperateLogService", allEntries = true)
    Integer saveCache(Object save);

	/**
     * @see top.cardone.log.service.OperateLogService#update
     */
    @CacheEvict(value = "top.cardone.log.service.OperateLogService", allEntries = true)
    int updateCache(Object update);

	/**
     * @see top.cardone.log.service.OperateLogService#updateList
     */
    @CacheEvict(value = "top.cardone.log.service.OperateLogService", allEntries = true)
    int[] updateListCache(List<Object> updateList);

    /**
     * 发送测试信息
     */
    void sendTestInfo();

    /**
     * 记录测试信息
     * @param testInfo
     */
    void recordTestInfo(String testInfo);

    /**
     * 记录测试信息
     */
    void recordTestInfos();
}