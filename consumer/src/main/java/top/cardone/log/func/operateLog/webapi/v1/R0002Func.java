package top.cardone.log.func.operateLog.webapi.v1;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import org.springframework.stereotype.Component;
import top.cardone.log.dto.OperateLogDto;
import top.cardone.log.service.OperateLogService;
import top.cardone.context.ApplicationContextHolder;
import top.cardone.core.util.func.Func1;

import java.util.List;
import java.util.Map;

/**
 * 操作日志 - 查询列表
 */
@Component("/web-api/v1/configuration/operateLog/r0002.json")
public class R0002Func implements Func1<Object, Map<String, Object>> {
    @Override
    public Object func(Map<String, Object> map) {
        List<OperateLogDto> operateLogDtoList = ApplicationContextHolder.getBean(OperateLogService.class).findList(OperateLogDto.class, map);

        return this.toMapList(operateLogDtoList);
    }

    private List<Map<String, Object>> toMapList(List<OperateLogDto> operateLogDtoList) {
        List<Map<String, Object>> mapList = Lists.newArrayList();

        for (OperateLogDto operateLogDto : operateLogDtoList) {
            mapList.add(this.toMap(operateLogDto));
        }

        return mapList;
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
        map.put("typeCode", operateLogDto.getTypeCode());

        return map;
    }
}