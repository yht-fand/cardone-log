package top.cardone.log.func;

import com.google.common.collect.Maps;
import lombok.Getter;
import org.apache.commons.collections.MapUtils;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;
import org.aspectj.lang.ProceedingJoinPoint;
import top.cardone.context.ApplicationContextHolder;
import top.cardone.core.util.func.Func3;
import top.cardone.log.service.OperateLogService;

import java.util.Map;

/**
 * Created by Administrator on 2016/10/16.
 */
public class InsertOperateLogFunc implements Func3<Object, ProceedingJoinPoint, Map<String, Object>, Map<String, Object>> {
	/**
	 * 消息
	 */
	@Getter
	private ThreadLocal<String> message = new ThreadLocal<String>() {
		@Override
		protected String initialValue() {
			return StringUtils.EMPTY;
		}
	};

	/**
	 * 消息
	 */
	@Getter
	private ThreadLocal<String> typeCode = new ThreadLocal<String>() {
		@Override
		protected String initialValue() {
			return StringUtils.EMPTY;
		}
	};

	@Override
	public Object func(ProceedingJoinPoint proceedingJoinPoint, Map<String, Object> configMap, Map<String, Object> contextMap) {
		String typeCode = StringUtils.defaultString(MapUtils.getString(configMap, "typeCode"), this.typeCode.get());
		String message = StringUtils.defaultString(MapUtils.getString(configMap, "message"), this.message.get());

		Map<String, Object> insert = Maps.newHashMap();

		insert.put("typeCode", typeCode);
		insert.put("message", message);

		ApplicationContextHolder.getBean(OperateLogService.class).insert(insert);

		return null;
	}
}