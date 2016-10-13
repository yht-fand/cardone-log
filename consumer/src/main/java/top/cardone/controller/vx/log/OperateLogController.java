package top.cardone.controller.vx.log;

import top.cardone.log.service.OperateLogService;
import com.google.common.collect.Maps;
import com.google.common.collect.Table;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import top.cardone.cache.Cache;
import top.cardone.context.ApplicationContextHolder;
import top.cardone.context.util.TableUtils;
import top.cardone.data.support.PageSupport;
import top.cardone.web.support.FuncBindSupport;
import top.cardone.web.support.WebSupport;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

/**
 * Created by yht
 */
@Log4j2
@Controller("top.cardone.controller.vx.log.OperateLogController")
@RequestMapping("/vx/log/operateLog")
public class OperateLogController {
	/**
	 * /c0001.json begin
	 **xx/
	@Value("${app.root}/config/api/vx/log/operateLog/c0001.input.json")
	private String c0001InputJson;

	private void validateC0001Json(Map<String, Object> inputMap) {
	}

    @RequestMapping("/c0001.json")
    @ResponseBody
	public Object c0001Json(HttpServletRequest request) {
		Map<String, Object> inputMap = ApplicationContextHolder.getBean(WebSupport.class).getObject(Map.class, request, c0001InputJson, !log.isDebugEnabled());

		validateC0001Json(inputMap);

		Object returnData = ApplicationContextHolder.getBean(OperateLogService.class).insertByNotExistsCache(inputMap);

        return ApplicationContextHolder.getBean(FuncBindSupport.class).func(request, returnData == null ? Maps.newHashMap() : returnData, !log.isDebugEnabled());
    }
    /** /c0001.json end **/

	/**
	 * /c0002.json begin
	 **xx/
	@Value("${app.root}/config/api/vx/log/operateLog/c0002.input.json")
	private String c0002InputJson;

    private void validateC0002Json(Map<String, Object> inputMap) {
    }

    @RequestMapping("/c0002.json")
    @ResponseBody
	public Object c0002Json(HttpServletRequest request) {
		Map<String, Object> inputMap = ApplicationContextHolder.getBean(WebSupport.class).getObject(Map.class, request, c0002InputJson, !log.isDebugEnabled());

		validateC0002Json(inputMap);

		Object returnData = ApplicationContextHolder.getBean(OperateLogService.class).insertByNotExistsCache(inputMap);

        return ApplicationContextHolder.getBean(FuncBindSupport.class).func(request, returnData == null ? Maps.newHashMap() : returnData, !log.isDebugEnabled());
    }
    /** /c0002.json end **/

	/**
	 * /c0003.json begin
	 **xx/
	@Value("${app.root}/config/api/vx/log/operateLog/c0003.input.json")
	private String c0003InputJson;

    private void validateC0003Json(Map<String, Object> inputMap) {
    }

    @RequestMapping("/c0003.json")
	@ResponseBody
	public Object c0003Json(HttpServletRequest request) {
		Map<String, Object> inputMap = ApplicationContextHolder.getBean(WebSupport.class).getObject(Map.class, request, c0003InputJson, !log.isDebugEnabled());

		validateC0003Json(inputMap);

		Object returnData = ApplicationContextHolder.getBean(OperateLogService.class).insertByNotExistsCache(inputMap);

        return ApplicationContextHolder.getBean(FuncBindSupport.class).func(request, returnData == null ? Maps.newHashMap() : returnData, !log.isDebugEnabled());
	}
	/** /c0003.json end **/

	/**
	 * /c0004.json begin
	 **xx/
	@Value("${app.root}/config/api/vx/log/operateLog/c0004.input.json")
	private String c0004InputJson;

    private void validateC0004Json(Map<String, Object> inputMap) {
    }

    @RequestMapping("/c0004.json")
	@ResponseBody
	public Object c0004Json(HttpServletRequest request) {
		Map<String, Object> inputMap = ApplicationContextHolder.getBean(WebSupport.class).getObject(Map.class, request, c0004InputJson, !log.isDebugEnabled());

		validateC0004Json(inputMap);

		Object returnData = ApplicationContextHolder.getBean(OperateLogService.class).insertByNotExistsCache(inputMap);

        return ApplicationContextHolder.getBean(FuncBindSupport.class).func(request, returnData == null ? Maps.newHashMap() : returnData, !log.isDebugEnabled());
	}
	/** /c0004.json end **/

	/**
	 * /d0001.json begin
	 **xx/
	@Value("${app.root}/config/api/vx/log/operateLog/d0001.input.json")
	private String d0001InputJson;

    private void validateD0001Json(Map<String, Object> inputMap) {
    }

    @RequestMapping("/d0001.json")
	@ResponseBody
	public Object d0001Json(HttpServletRequest request) {
		Map<String, Object> inputMap = ApplicationContextHolder.getBean(WebSupport.class).getObject(Map.class, request, d0001InputJson, !log.isDebugEnabled());

		validateD0001Json(inputMap);

		Object returnData = ApplicationContextHolder.getBean(OperateLogService.class).deleteByIdsCache(inputMap);

        return ApplicationContextHolder.getBean(FuncBindSupport.class).func(request, returnData == null ? Maps.newHashMap() : returnData, !log.isDebugEnabled());
	}
	/** /d0001.json end **/

	/**
	 * /d0002.json begin
	 **xx/
	@Value("${app.root}/config/api/vx/log/operateLog/d0002.input.json")
	private String d0002InputJson;

	private void validateD0002Json(Map<String, Object> inputMap) {
	}

	@RequestMapping("/d0002.json")
	@ResponseBody
	public Object d0002Json(HttpServletRequest request) {
		Map<String, Object> inputMap = ApplicationContextHolder.getBean(WebSupport.class).getObject(Map.class, request, d0002InputJson, !log.isDebugEnabled());

		validateD0002Json(inputMap);

		Object returnData = ApplicationContextHolder.getBean(OperateLogService.class).deleteByIdsCache(inputMap);

        return ApplicationContextHolder.getBean(FuncBindSupport.class).func(request, returnData == null ? Maps.newHashMap() : returnData, !log.isDebugEnabled());
	}
	/** /d0002.json end **/

	/**
	 * /d0003.json begin
	 **xx/
	@Value("${app.root}/config/api/vx/log/operateLog/d0003.input.json")
	private String d0003InputJson;

	private void validateD0003Json(Map<String, Object> inputMap) {
	}

	@RequestMapping("/d0003.json")
	@ResponseBody
	public Object d0003Json(HttpServletRequest request) {
		Map<String, Object> inputMap = ApplicationContextHolder.getBean(WebSupport.class).getObject(Map.class, request, d0003InputJson, !log.isDebugEnabled());

		validateD0003Json(inputMap);

		Object returnData = ApplicationContextHolder.getBean(OperateLogService.class).deleteByIdsCache(inputMap);

        return ApplicationContextHolder.getBean(FuncBindSupport.class).func(request, returnData == null ? Maps.newHashMap() : returnData, !log.isDebugEnabled());
	}
	/** /d0003.json end **/

	/**
	 * /d0004.json begin
	 **xx/
	@Value("${app.root}/config/api/vx/log/operateLog/d0004.input.json")
	private String d0004InputJson;

	private void validateD0004Json(Map<String, Object> inputMap) {
	}

	@RequestMapping("/d0004.json")
	@ResponseBody
	public Object d0004Json(HttpServletRequest request) {
		Map<String, Object> inputMap = ApplicationContextHolder.getBean(WebSupport.class).getObject(Map.class, request, d0004InputJson, !log.isDebugEnabled());

		validateD0004Json(inputMap);

		Object returnData = ApplicationContextHolder.getBean(OperateLogService.class).deleteByIdsCache(inputMap);

        return ApplicationContextHolder.getBean(FuncBindSupport.class).func(request, returnData == null ? Maps.newHashMap() : returnData, !log.isDebugEnabled());
	}
	/** /d0004.json end **/

	/**
	 * /m0001.json begin
	 **xx/
	@Value("${app.root}/config/api/vx/log/operateLog/m0001.input.json")
	private String m0001InputJson;

	private void validateM0001Json(Map<String, Object> inputMap) {
	}

	@RequestMapping("/m0001.json")
	@ResponseBody
	public Object m0001Json(HttpServletRequest request) {
		Map<String, Object> inputMap = ApplicationContextHolder.getBean(WebSupport.class).getObject(Map.class, request, m0001InputJson, !log.isDebugEnabled());

		validateM0001Json(inputMap);

		Object returnData = ApplicationContextHolder.getBean(OperateLogService.class).findOne(inputMap);

        return ApplicationContextHolder.getBean(FuncBindSupport.class).func(request, returnData == null ? Maps.newHashMap() : returnData, !log.isDebugEnabled());
	}
	/** /m0001.json end **/

	/**
	 * /m0002.json begin
	 **xx/
	@Value("${app.root}/config/api/vx/log/operateLog/m0002.input.json")
	private String m0002InputJson;

	private void validateM0002Json(Map<String, Object> inputMap) {
	}

	@RequestMapping("/m0002.json")
	@ResponseBody
	public Object m0002Json(HttpServletRequest request) {
		Map<String, Object> inputMap = ApplicationContextHolder.getBean(WebSupport.class).getObject(Map.class, request, m0002InputJson, !log.isDebugEnabled());

		validateM0002Json(inputMap);

		Object returnData = ApplicationContextHolder.getBean(OperateLogService.class).findOne(inputMap);

        return ApplicationContextHolder.getBean(FuncBindSupport.class).func(request, returnData == null ? Maps.newHashMap() : returnData, !log.isDebugEnabled());
	}
	/** /m0002.json end **/

	/**
	 * /m0003.json begin
	 **xx/
	@Value("${app.root}/config/api/vx/log/operateLog/m0003.input.json")
	private String m0003InputJson;

	private void validateM0003Json(Map<String, Object> inputMap) {
	}

	@RequestMapping("/m0003.json")
	@ResponseBody
	public Object m0003Json(HttpServletRequest request) {
		Map<String, Object> inputMap = ApplicationContextHolder.getBean(WebSupport.class).getObject(Map.class, request, m0003InputJson, !log.isDebugEnabled());

		validateM0003Json(inputMap);

		Object returnData = ApplicationContextHolder.getBean(OperateLogService.class).findOne(inputMap);

        return ApplicationContextHolder.getBean(FuncBindSupport.class).func(request, returnData == null ? Maps.newHashMap() : returnData, !log.isDebugEnabled());
	}
	/** /m0003.json end **/

	/**
	 * /m0004.json begin
	 **xx/
	@Value("${app.root}/config/api/vx/log/operateLog/m0004.input.json")
	private String m0004InputJson;

	private void validateM0004Json(Map<String, Object> inputMap) {
	}

	@RequestMapping("/m0004.json")
	@ResponseBody
	public Object m0004Json(HttpServletRequest request) {
		Map<String, Object> inputMap = ApplicationContextHolder.getBean(WebSupport.class).getObject(Map.class, request, m0004InputJson, !log.isDebugEnabled());

		validateM0004Json(inputMap);

		Object returnData = ApplicationContextHolder.getBean(OperateLogService.class).findOne(inputMap);

        return ApplicationContextHolder.getBean(FuncBindSupport.class).func(request, returnData == null ? Maps.newHashMap() : returnData, !log.isDebugEnabled());
	}
	/** /m0004.json end **/

	/**
	 * /r0001.json begin
	 **xx/
	@Value("${app.root}/config/api/vx/log/operateLog/r0001.input.json")
	private String r0001InputJson;

	@Value("${app.root}/config/api/vx/log/operateLog/r0001.output.json")
	private String r0001OutputJson;

	private void validateR0001Json(Map<String, Object> inputMap) {
	}

	@RequestMapping("/r0001.json")
	@ResponseBody
	public Object r0001Json(HttpServletRequest request) {
		Map<String, Object> inputMap = ApplicationContextHolder.getBean(WebSupport.class).getObject(Map.class, request, r0001InputJson, !log.isDebugEnabled());

		validateR0001Json(inputMap);

		Page<Map<String, Object>> page = ApplicationContextHolder.getBean(OperateLogService.class).page(inputMap);

		Table<String, String, String> outputTable;

		if (log.isDebugEnabled()) {
			outputTable = TableUtils.newTable(r0001OutputJson);
		} else {
			outputTable = ApplicationContextHolder.getBean(Cache.class).get("outputTable", r0001OutputJson, () -> TableUtils.newTable(r0001OutputJson));
		}

		List<Map<String, Object>> newContent = top.cardone.context.util.ListUtils.newArrayList(page.getContent(), outputTable);

		Object returnData = ApplicationContextHolder.getBean(PageSupport.class).newMap(newContent, inputMap, page.getTotalElements());

        return ApplicationContextHolder.getBean(FuncBindSupport.class).func(request, returnData == null ? Maps.newHashMap() : returnData, !log.isDebugEnabled());
	}
	/** /r0001.json end **/

	/**
	 * /r0002.json begin
	 **xx/
	@Value("${app.root}/config/api/vx/log/operateLog/r0002.input.json")
	private String r0002InputJson;

	@Value("${app.root}/config/api/vx/log/operateLog/r0002.output.json")
	private String r0002OutputJson;

	private void validateR0002Json(Map<String, Object> inputMap) {
	}

	@RequestMapping("/r0002.json")
	@ResponseBody
	public Object r0002Json(HttpServletRequest request) {
		Map<String, Object> inputMap = ApplicationContextHolder.getBean(WebSupport.class).getObject(Map.class, request, r0002InputJson, !log.isDebugEnabled());

		validateR0002Json(inputMap);

		Page<Map<String, Object>> page = ApplicationContextHolder.getBean(OperateLogService.class).page(inputMap);

		Table<String, String, String> outputTable;

		if (log.isDebugEnabled()) {
			outputTable = TableUtils.newTable(r0002OutputJson);
		} else {
			outputTable = ApplicationContextHolder.getBean(Cache.class).get("outputTable", r0002OutputJson, () -> TableUtils.newTable(r0002OutputJson));
		}

		List<Map<String, Object>> newContent = top.cardone.context.util.ListUtils.newArrayList(page.getContent(), outputTable);

		Object returnData = ApplicationContextHolder.getBean(PageSupport.class).newMap(newContent, inputMap, page.getTotalElements());

		return ApplicationContextHolder.getBean(FuncBindSupport.class).func(request, returnData == null ? Maps.newHashMap() : returnData, !log.isDebugEnabled());
	}
	/** /r0002.json end **/

	/**
	 * /r0003.json begin
	 **xx/
	@Value("${app.root}/config/api/vx/log/operateLog/r0003.input.json")
	private String r0003InputJson;

	@Value("${app.root}/config/api/vx/log/operateLog/r0003.output.json")
	private String r0003OutputJson;

	private void validateR0003Json(Map<String, Object> inputMap) {
	}

	@RequestMapping("/r0003.json")
	@ResponseBody
	public Object r0003Json(HttpServletRequest request) {
		Map<String, Object> inputMap = ApplicationContextHolder.getBean(WebSupport.class).getObject(Map.class, request, r0003InputJson, !log.isDebugEnabled());

		validateR0003Json(inputMap);

		Page<Map<String, Object>> page = ApplicationContextHolder.getBean(OperateLogService.class).page(inputMap);

		Table<String, String, String> outputTable;

		if (log.isDebugEnabled()) {
			outputTable = TableUtils.newTable(r0003OutputJson);
		} else {
			outputTable = ApplicationContextHolder.getBean(Cache.class).get("outputTable", r0003OutputJson, () -> TableUtils.newTable(r0003OutputJson));
		}

		List<Map<String, Object>> newContent = top.cardone.context.util.ListUtils.newArrayList(page.getContent(), outputTable);

		Object returnData = ApplicationContextHolder.getBean(PageSupport.class).newMap(newContent, inputMap, page.getTotalElements());

		return ApplicationContextHolder.getBean(FuncBindSupport.class).func(request, returnData == null ? Maps.newHashMap() : returnData, !log.isDebugEnabled());
	}
	/** /r0003.json end **/

	/**
	 * /r0004.json begin
	 **xx/
	@Value("${app.root}/config/api/vx/log/operateLog/r0004.input.json")
	private String r0004InputJson;

	@Value("${app.root}/config/api/vx/log/operateLog/r0004.output.json")
	private String r0004OutputJson;

	private void validateR0004Json(Map<String, Object> inputMap) {
	}

	@RequestMapping("/r0004.json")
	@ResponseBody
	public Object r0004Json(HttpServletRequest request) {
		Map<String, Object> inputMap = ApplicationContextHolder.getBean(WebSupport.class).getObject(Map.class, request, r0004InputJson, !log.isDebugEnabled());

		validateR0004Json(inputMap);

		Page<Map<String, Object>> page = ApplicationContextHolder.getBean(OperateLogService.class).page(inputMap);

		Table<String, String, String> outputTable;

		if (log.isDebugEnabled()) {
			outputTable = TableUtils.newTable(r0004OutputJson);
		} else {
			outputTable = ApplicationContextHolder.getBean(Cache.class).get("outputTable", r0004OutputJson, () -> TableUtils.newTable(r0004OutputJson));
		}

		List<Map<String, Object>> newContent = top.cardone.context.util.ListUtils.newArrayList(page.getContent(), outputTable);

		Object returnData = ApplicationContextHolder.getBean(PageSupport.class).newMap(newContent, inputMap, page.getTotalElements());

		return ApplicationContextHolder.getBean(FuncBindSupport.class).func(request, returnData == null ? Maps.newHashMap() : returnData, !log.isDebugEnabled());
	}
	/** /r0004.json end **/

	/**
	 * /u0001.json begin
	 **xx/
	@Value("${app.root}/config/api/vx/log/operateLog/u0001.input.json")
	private String u0001InputJson;

	private void validateU0001Json(Map<String, Object> inputMap) {
	}

	@RequestMapping("/u0001.json")
	@ResponseBody
	public Object u0001Json(HttpServletRequest request) {
		Map<String, Object> inputMap = ApplicationContextHolder.getBean(WebSupport.class).getObject(Map.class, request, u0001InputJson, !log.isDebugEnabled());

		validateU0001Json(inputMap);

		Object returnData = ApplicationContextHolder.getBean(OperateLogService.class).updateCache(inputMap);

		return ApplicationContextHolder.getBean(FuncBindSupport.class).func(request, returnData == null ? Maps.newHashMap() : returnData, !log.isDebugEnabled());
	}
	/** /u0001.json end **/

	/**
	 * /u0002.json begin
	 **xx/
	@Value("${app.root}/config/api/vx/log/operateLog/u0002.input.json")
	private String u0002InputJson;

	private void validateU0002Json(Map<String, Object> inputMap) {
	}

	@RequestMapping("/u0002.json")
	@ResponseBody
	public Object u0002Json(HttpServletRequest request) {
		Map<String, Object> inputMap = ApplicationContextHolder.getBean(WebSupport.class).getObject(Map.class, request, u0002InputJson, !log.isDebugEnabled());

		validateU0002Json(inputMap);

		Object returnData = ApplicationContextHolder.getBean(OperateLogService.class).updateCache(inputMap);

		return ApplicationContextHolder.getBean(FuncBindSupport.class).func(request, returnData == null ? Maps.newHashMap() : returnData, !log.isDebugEnabled());
	}
	/** /u0002.json end **/

	/**
	 * /u0003.json begin
	 **xx/
	@Value("${app.root}/config/api/vx/log/operateLog/u0003.input.json")
	private String u0003InputJson;

	private void validateU0003Json(Map<String, Object> inputMap) {
	}

	@RequestMapping("/u0003.json")
	@ResponseBody
	public Object u0003Json(HttpServletRequest request) {
		Map<String, Object> inputMap = ApplicationContextHolder.getBean(WebSupport.class).getObject(Map.class, request, u0003InputJson, !log.isDebugEnabled());

		validateU0003Json(inputMap);

		Object returnData = ApplicationContextHolder.getBean(OperateLogService.class).updateCache(inputMap);

		return ApplicationContextHolder.getBean(FuncBindSupport.class).func(request, returnData == null ? Maps.newHashMap() : returnData, !log.isDebugEnabled());
	}
	/** /u0003.json end **/

	/**
	 * /u0004.json begin
	 **xx/
	@Value("${app.root}/config/api/vx/log/operateLog/u0004.input.json")
	private String u0004InputJson;

	private void validateU0004Json(Map<String, Object> inputMap) {
	}

	@RequestMapping("/u0004.json")
	@ResponseBody
	public Object u0004Json(HttpServletRequest request) {
		Map<String, Object> inputMap = ApplicationContextHolder.getBean(WebSupport.class).getObject(Map.class, request, u0004InputJson, !log.isDebugEnabled());

		validateU0004Json(inputMap);

		Object returnData = ApplicationContextHolder.getBean(OperateLogService.class).updateCache(inputMap);

		return ApplicationContextHolder.getBean(FuncBindSupport.class).func(request, returnData == null ? Maps.newHashMap() : returnData, !log.isDebugEnabled());
	}

	/**
	 * /u0004.json end
	 **/

	/**
	 * /addModal.json begin
	 **xx/
	@RequestMapping("/addModal.json")
	@ResponseBody
	public Object addModalJson(HttpServletRequest request) {
		Map<String, Object> returnData = null;

		return ApplicationContextHolder.getBean(FuncBindSupport.class).func(request, returnData == null ? Maps.newHashMap() : returnData, !log.isDebugEnabled());
	}
	/** /addModal.json end **/

	/**
	 * /modifyModal.json begin
	 **xx/
	@Value("${app.root}/config/api/vx/log/operateLog/modifyModal.input.json")
	private String modifyModalInputJson;

	@Value("${app.root}/config/api/vx/log/operateLog/modifyModal.output.json")
	private String modifyModalOutputJson;

	private void validateModifyModalJson(Map<String, Object> inputMap) {
	}

	@RequestMapping("/modifyModal.json")
	@ResponseBody
	public Object modifyModalJson(HttpServletRequest request) {
		Map<String, Object> inputMap = ApplicationContextHolder.getBean(WebSupport.class).getObject(Map.class, request, modifyModalInputJson, !log.isDebugEnabled());

		validateModifyModalJson(inputMap);

		Map<String, Object> returnData = ApplicationContextHolder.getBean(OperateLogService.class).findOneByOperateLogId(inputMap);

		Table<String, String, String> outputTable;

		if (log.isDebugEnabled()) {
			outputTable = TableUtils.newTable(modifyModalOutputJson);
		} else {
			outputTable = ApplicationContextHolder.getBean(Cache.class).get("outputTable", modifyModalOutputJson, () -> TableUtils.newTable(modifyModalOutputJson));
		}

		Map<String, Object> newReturnData = top.cardone.context.util.MapUtils.newHashMap(returnData, outputTable);

		return ApplicationContextHolder.getBean(FuncBindSupport.class).func(request, newReturnData);
	}
	/** /modifyModal.json end **/

	/**
	 * /index.json begin
	 **xx/
	@RequestMapping("/index.json")
	@ResponseBody
	public Object indexJson(HttpServletRequest request) {
		Map<String, Object> returnData = null;

        return ApplicationContextHolder.getBean(FuncBindSupport.class).func(request, returnData == null ? Maps.newHashMap() : returnData, !log.isDebugEnabled());
    }
    /** /index.json end **/
}
