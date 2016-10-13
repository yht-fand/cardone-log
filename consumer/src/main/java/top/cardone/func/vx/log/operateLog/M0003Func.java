package top.cardone.func.vx.log.operateLog;

import top.cardone.log.service.OperateLogService;
import com.google.common.collect.Table;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import top.cardone.cache.Cache;
import top.cardone.context.ApplicationContextHolder;
import top.cardone.context.util.MapUtils;
import top.cardone.context.util.TableUtils;
import top.cardone.core.util.func.Func1;

import java.util.Map;

/**
 * 操作日志 - 复合
 */
@Log4j2
@Component("/vx/log/operateLog/m0003.json")
public class M0003Func implements Func1<Object, Map<String, Object>> {
    @Value("${app.root}/config/api/vx/log/operateLog/m0004.input.json")
    private String inputJson;

    @Value("${app.root}/config/api/vx/log/operateLog/m0004.output.json")
    private String outputJson;

    private void validate(Map<String, Object> inputMap) {
    }

    @Override
    public Object func(Map<String, Object> inputMap) {
        Table<String, String, String> inputTable;

        if (log.isDebugEnabled()) {
            inputTable = TableUtils.newTable(inputJson);
        } else {
            inputTable = ApplicationContextHolder.getBean(Cache.class).get("inputTable", inputJson, () -> TableUtils.newTable(inputJson));
        }

        Map<String, Object> newInputMap = top.cardone.context.util.MapUtils.newHashMap(inputMap, inputTable);

        validate(newInputMap);

        Map<String, Object> outputMap = ApplicationContextHolder.getBean(OperateLogService.class).findOne(newInputMap);

        Table<String, String, String> outputTable;

        if (log.isDebugEnabled()) {
            outputTable = TableUtils.newTable(outputJson);
        } else {
            outputTable = ApplicationContextHolder.getBean(Cache.class).get("outputTable", outputJson, () -> TableUtils.newTable(outputJson));
        }

        return MapUtils.newHashMap(outputMap, outputTable);
    }
}