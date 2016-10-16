package top.cardone.log.func;

import lombok.Getter;
import org.apache.commons.lang3.StringUtils;
import org.aspectj.lang.ProceedingJoinPoint;
import top.cardone.core.util.func.Func3;

import java.util.Map;

/**
 * Created by Administrator on 2016/10/16.
 */
public class InsertLogFunc implements Func3<Object, ProceedingJoinPoint, Map<String, Object>, Map<String, Object>> {
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

	@Override
	public Object func(ProceedingJoinPoint proceedingJoinPoint, Map<String, Object> map, Map<String, Object> map2) {
		return null;
	}
}
