package top.cardone.log.func.operateLog.webapi.v1;

import com.google.common.collect.Maps;
import org.springframework.stereotype.Component;
import top.cardone.log.dto.OperateLogDto;
import top.cardone.log.service.OperateLogService;
import top.cardone.context.ApplicationContextHolder;
import top.cardone.core.util.func.Func1;

import java.util.Map;

/**
 * 操作日志 - 查询
 */
@Component("/web-api/v1/configuration/operateLog/r0004.json")
public class R0004Func implements Func1<Object, Map<String, Object>> {
    @Override
    public Object func(Map<String, Object> map) {
        OperateLogDto operateLogDto = ApplicationContextHolder.getBean(OperateLogService.class).findOne(OperateLogDto.class, map);

        return this.toMap(operateLogDto);
    }

    private Map<String, Object> toMap(OperateLogDto operateLogDto) {
        Map<String, Object> map = Maps.newHashMap();

        map.put("createdByCode", operateLogDto.getCreatedByCode());
        map.put("createdDate", operateLogDto.getCreatedDate());
        map.put("departmentCode", operateLogDto.getDepartmentCode());
        map.put("message", operateLogDto.getMessage());
        map.put("operateLogCode", operateLogDto.getOperateLogCode());
        map.put("operateLogId", operateLogDto.getOperateLogId());
        map.put("orgCode", operateLogDto.getOrgCode());
        map.put("siteCode", operateLogDto.getSiteCode());
        map.put("systemInfoCode", operateLogDto.getSystemInfoCode());
        map.put("typeCode", operateLogDto.getTypeCode());

        return map;
    }
}