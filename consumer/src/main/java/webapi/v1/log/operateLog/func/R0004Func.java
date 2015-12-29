package webapi.v1.log.operateLog.func;

import org.springframework.stereotype.Component;
import top.cardone.core.util.func.Func1;

import top.cardone.log.dto.OperateLogDto;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

import java.util.List;
import java.util.Map;

/**
 * 操作日志 - 查询
 */
@Component("/web-api/v1/log/operateLog/r0004.json")
public class R0004Func implements Func1<Map<String, Object>, Map<String, Object>> {
    @Override
    public Map<String, Object> func(Map<String, Object> map) {
        return null;
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
