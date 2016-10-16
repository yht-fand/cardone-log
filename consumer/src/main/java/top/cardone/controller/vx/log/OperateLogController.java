package top.cardone.controller.vx.log;

import com.google.common.collect.Maps;
import top.cardone.log.service.OperateLogService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import top.cardone.context.ApplicationContextHolder;
import top.cardone.context.util.MapUtils;
import top.cardone.core.CodeException;
import top.cardone.data.support.PageSupport;
import top.cardone.validator.Validator;
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
	@Value("${app.root}/config/api/vx/log/operateLog/c0001.input.preValidate.json")
	private String c0001InputPreValidateJson;
	
	@Value("${app.root}/config/api/vx/log/operateLog/c0001.input.json")
	private String c0001InputJson;
	
	@Value("${app.root}/config/api/vx/log/operateLog/c0001.input.postValidate.json")
	private String c0001InputPostValidateJson;

    @RequestMapping("/c0001.json")
    @ResponseBody
	public Object c0001Json(HttpServletRequest request) {
	    Map<String, Object> inputMap = ApplicationContextHolder.getBean(WebSupport.class).getObject(request, new String[]{c0001InputPreValidateJson, c0001InputJson, c0001InputPostValidateJson}, !log.isDebugEnabled());

		Object returnData = ApplicationContextHolder.getBean(OperateLogService.class).insertByNotExistsCache(inputMap);

        return ApplicationContextHolder.getBean(FuncBindSupport.class).func(request, returnData, !log.isDebugEnabled());
    }
    /** /c0001.json end **/

	/**
	 * /c0002.json begin
	 **xx/
	@Value("${app.root}/config/api/vx/log/operateLog/c0002.input.preValidate.json")
	private String c0002InputPreValidateJson;
	
	@Value("${app.root}/config/api/vx/log/operateLog/c0002.input.json")
	private String c0002InputJson;
	
	@Value("${app.root}/config/api/vx/log/operateLog/c0002.input.postValidate.json")
	private String c0002InputPostValidateJson;

    @RequestMapping("/c0002.json")
    @ResponseBody
	public Object c0002Json(HttpServletRequest request) {
	    Map<String, Object> inputMap = ApplicationContextHolder.getBean(WebSupport.class).getObject(request, new String[]{c0002InputPreValidateJson, c0002InputJson, c0002InputPostValidateJson}, !log.isDebugEnabled());
		
		Object returnData = ApplicationContextHolder.getBean(OperateLogService.class).insertByNotExistsCache(inputMap);

        return ApplicationContextHolder.getBean(FuncBindSupport.class).func(request, returnData, !log.isDebugEnabled());
    }
    /** /c0002.json end **/

	/**
	 * /c0003.json begin
	 **xx/
	@Value("${app.root}/config/api/vx/log/operateLog/c0003.input.preValidate.json")
	private String c0003InputPreValidateJson;
	
	@Value("${app.root}/config/api/vx/log/operateLog/c0003.input.json")
	private String c0003InputJson;
	
	@Value("${app.root}/config/api/vx/log/operateLog/c0003.input.postValidate.json")
	private String c0003InputPostValidateJson;

    @RequestMapping("/c0003.json")
    @ResponseBody
	public Object c0003Json(HttpServletRequest request) {
	    Map<String, Object> inputMap = ApplicationContextHolder.getBean(WebSupport.class).getObject(request, new String[]{c0003InputPreValidateJson, c0003InputJson, c0003InputPostValidateJson}, !log.isDebugEnabled());
		
		Object returnData = ApplicationContextHolder.getBean(OperateLogService.class).insertByNotExistsCache(inputMap);

        return ApplicationContextHolder.getBean(FuncBindSupport.class).func(request, returnData, !log.isDebugEnabled());
    }
    /** /c0003.json end **/

	/**
	 * /c0004.json begin
	 **xx/
	@Value("${app.root}/config/api/vx/log/operateLog/c0004.input.preValidate.json")
	private String c0004InputPreValidateJson;
	
	@Value("${app.root}/config/api/vx/log/operateLog/c0004.input.json")
	private String c0004InputJson;
	
	@Value("${app.root}/config/api/vx/log/operateLog/c0004.input.postValidate.json")
	private String c0004InputPostValidateJson;

    @RequestMapping("/c0004.json")
    @ResponseBody
	public Object c0004Json(HttpServletRequest request) {
	    Map<String, Object> inputMap = ApplicationContextHolder.getBean(WebSupport.class).getObject(request, new String[]{c0004InputPreValidateJson, c0004InputJson, c0004InputPostValidateJson}, !log.isDebugEnabled());
		
		Object returnData = ApplicationContextHolder.getBean(OperateLogService.class).insertByNotExistsCache(inputMap);

        return ApplicationContextHolder.getBean(FuncBindSupport.class).func(request, returnData, !log.isDebugEnabled());
    }
    /** /c0004.json end **/

	/**
	 * /d0001.json begin
	 **xx/
	@Value("${app.root}/config/api/vx/log/operateLog/d0001.input.preValidate.json")
	private String d0001InputPreValidateJson;
	
	@Value("${app.root}/config/api/vx/log/operateLog/d0001.input.json")
	private String d0001InputJson;
	
	@Value("${app.root}/config/api/vx/log/operateLog/d0001.input.postValidate.json")
	private String d0001InputPostValidateJson;

    @RequestMapping("/d0001.json")
    @ResponseBody
	public Object d0001Json(HttpServletRequest request) {
	    Map<String, Object> inputMap = ApplicationContextHolder.getBean(WebSupport.class).getObject(request, new String[]{d0001InputPreValidateJson, d0001InputJson, d0001InputPostValidateJson}, !log.isDebugEnabled());

		Object returnData = ApplicationContextHolder.getBean(OperateLogService.class).deleteByIdsCache(inputMap);

        return ApplicationContextHolder.getBean(FuncBindSupport.class).func(request, returnData, !log.isDebugEnabled());
	}
	/** /d0001.json end **/

	/**
	 * /d0002.json begin
	 **xx/
	@Value("${app.root}/config/api/vx/log/operateLog/d0002.input.preValidate.json")
	private String d0002InputPreValidateJson;
	
	@Value("${app.root}/config/api/vx/log/operateLog/d0002.input.json")
	private String d0002InputJson;
	
	@Value("${app.root}/config/api/vx/log/operateLog/d0002.input.postValidate.json")
	private String d0002InputPostValidateJson;

    @RequestMapping("/d0002.json")
    @ResponseBody
	public Object d0002Json(HttpServletRequest request) {
	    Map<String, Object> inputMap = ApplicationContextHolder.getBean(WebSupport.class).getObject(request, new String[]{d0002InputPreValidateJson, d0002InputJson, d0002InputPostValidateJson}, !log.isDebugEnabled());

		Object returnData = ApplicationContextHolder.getBean(OperateLogService.class).deleteByIdsCache(inputMap);

        return ApplicationContextHolder.getBean(FuncBindSupport.class).func(request, returnData, !log.isDebugEnabled());
	}
	/** /d0002.json end **/

	/**
	 * /d0003.json begin
	 **xx/
	@Value("${app.root}/config/api/vx/log/operateLog/d0003.input.preValidate.json")
	private String d0003InputPreValidateJson;
	
	@Value("${app.root}/config/api/vx/log/operateLog/d0003.input.json")
	private String d0003InputJson;
	
	@Value("${app.root}/config/api/vx/log/operateLog/d0003.input.postValidate.json")
	private String d0003InputPostValidateJson;

    @RequestMapping("/d0003.json")
    @ResponseBody
	public Object d0003Json(HttpServletRequest request) {
	    Map<String, Object> inputMap = ApplicationContextHolder.getBean(WebSupport.class).getObject(request, new String[]{d0003InputPreValidateJson, d0003InputJson, d0003InputPostValidateJson}, !log.isDebugEnabled());

		Object returnData = ApplicationContextHolder.getBean(OperateLogService.class).deleteByIdsCache(inputMap);

        return ApplicationContextHolder.getBean(FuncBindSupport.class).func(request, returnData, !log.isDebugEnabled());
	}
	/** /d0003.json end **/

	/**
	 * /d0004.json begin
	 **xx/
	@Value("${app.root}/config/api/vx/log/operateLog/d0004.input.preValidate.json")
	private String d0004InputPreValidateJson;
	
	@Value("${app.root}/config/api/vx/log/operateLog/d0004.input.json")
	private String d0004InputJson;
	
	@Value("${app.root}/config/api/vx/log/operateLog/d0004.input.postValidate.json")
	private String d0004InputPostValidateJson;

    @RequestMapping("/d0004.json")
    @ResponseBody
	public Object d0004Json(HttpServletRequest request) {
	    Map<String, Object> inputMap = ApplicationContextHolder.getBean(WebSupport.class).getObject(request, new String[]{d0004InputPreValidateJson, d0004InputJson, d0004InputPostValidateJson}, !log.isDebugEnabled());

		Object returnData = ApplicationContextHolder.getBean(OperateLogService.class).deleteByIdsCache(inputMap);

        return ApplicationContextHolder.getBean(FuncBindSupport.class).func(request, returnData, !log.isDebugEnabled());
	}
	/** /d0004.json end **/

	/**
	 * /m0001.json begin
	 **xx/
	@Value("${app.root}/config/api/vx/log/operateLog/m0001.input.preValidate.json")
	private String m0001InputPreValidateJson;
	
	@Value("${app.root}/config/api/vx/log/operateLog/m0001.input.json")
	private String m0001InputJson;
	
	@Value("${app.root}/config/api/vx/log/operateLog/m0001.input.postValidate.json")
	private String m0001InputPostValidateJson;
	
	@Value("${app.root}/config/api/vx/log/operateLog/m0001.output.json")
	private String m0001OutputJson;

    @RequestMapping("/m0001.json")
    @ResponseBody
	public Object m0001Json(HttpServletRequest request) {
	    Map<String, Object> inputMap = ApplicationContextHolder.getBean(WebSupport.class).getObject(request, new String[]{m0001InputPreValidateJson, m0001InputJson, m0001InputPostValidateJson}, !log.isDebugEnabled());

		Map<String, Object> returnData = ApplicationContextHolder.getBean(OperateLogService.class).findOne(inputMap);

		Map<String, Object> newReturnData = top.cardone.context.util.MapUtils.newHashMap(returnData, top.cardone.context.util.MapUtils.newMap(m0001OutputJson, !log.isDebugEnabled()));

		return ApplicationContextHolder.getBean(FuncBindSupport.class).func(request, newReturnData, !log.isDebugEnabled());
	}
	/** /m0001.json end **/

	/**
	 * /m0002.json begin
	 **xx/
	@Value("${app.root}/config/api/vx/log/operateLog/m0002.input.preValidate.json")
	private String m0002InputPreValidateJson;
	
	@Value("${app.root}/config/api/vx/log/operateLog/m0002.input.json")
	private String m0002InputJson;
	
	@Value("${app.root}/config/api/vx/log/operateLog/m0002.input.postValidate.json")
	private String m0002InputPostValidateJson;
	
	@Value("${app.root}/config/api/vx/log/operateLog/m0002.output.json")
	private String m0002OutputJson;

    @RequestMapping("/m0002.json")
    @ResponseBody
	public Object m0002Json(HttpServletRequest request) {
	    Map<String, Object> inputMap = ApplicationContextHolder.getBean(WebSupport.class).getObject(request, new String[]{m0002InputPreValidateJson, m0002InputJson, m0002InputPostValidateJson}, !log.isDebugEnabled());

		Map<String, Object> returnData = ApplicationContextHolder.getBean(OperateLogService.class).findOne(inputMap);

		Map<String, Object> newReturnData = top.cardone.context.util.MapUtils.newHashMap(returnData, top.cardone.context.util.MapUtils.newMap(m0002OutputJson, !log.isDebugEnabled()));

		return ApplicationContextHolder.getBean(FuncBindSupport.class).func(request, newReturnData, !log.isDebugEnabled());
	}
	/** /m0002.json end **/

	/**
	 * /m0003.json begin
	 **xx/
	@Value("${app.root}/config/api/vx/log/operateLog/m0003.input.preValidate.json")
	private String m0003InputPreValidateJson;
	
	@Value("${app.root}/config/api/vx/log/operateLog/m0003.input.json")
	private String m0003InputJson;
	
	@Value("${app.root}/config/api/vx/log/operateLog/m0003.input.postValidate.json")
	private String m0003InputPostValidateJson;
	
	@Value("${app.root}/config/api/vx/log/operateLog/m0003.output.json")
	private String m0003OutputJson;

    @RequestMapping("/m0003.json")
    @ResponseBody
	public Object m0003Json(HttpServletRequest request) {
	    Map<String, Object> inputMap = ApplicationContextHolder.getBean(WebSupport.class).getObject(request, new String[]{m0003InputPreValidateJson, m0003InputJson, m0003InputPostValidateJson}, !log.isDebugEnabled());

		Map<String, Object> returnData = ApplicationContextHolder.getBean(OperateLogService.class).findOne(inputMap);

		Map<String, Object> newReturnData = top.cardone.context.util.MapUtils.newHashMap(returnData, top.cardone.context.util.MapUtils.newMap(m0003OutputJson, !log.isDebugEnabled()));

		return ApplicationContextHolder.getBean(FuncBindSupport.class).func(request, newReturnData, !log.isDebugEnabled());
	}
	/** /m0003.json end **/

	/**
	 * /m0004.json begin
	 **xx/
	@Value("${app.root}/config/api/vx/log/operateLog/m0004.input.preValidate.json")
	private String m0004InputPreValidateJson;
	
	@Value("${app.root}/config/api/vx/log/operateLog/m0004.input.json")
	private String m0004InputJson;
	
	@Value("${app.root}/config/api/vx/log/operateLog/m0004.input.postValidate.json")
	private String m0004InputPostValidateJson;
	
	@Value("${app.root}/config/api/vx/log/operateLog/m0004.output.json")
	private String m0004OutputJson;

    @RequestMapping("/m0004.json")
    @ResponseBody
	public Object m0004Json(HttpServletRequest request) {
	    Map<String, Object> inputMap = ApplicationContextHolder.getBean(WebSupport.class).getObject(request, new String[]{m0004InputPreValidateJson, m0004InputJson, m0004InputPostValidateJson}, !log.isDebugEnabled());

		Map<String, Object> returnData = ApplicationContextHolder.getBean(OperateLogService.class).findOne(inputMap);

		Map<String, Object> newReturnData = top.cardone.context.util.MapUtils.newHashMap(returnData, top.cardone.context.util.MapUtils.newMap(m0004OutputJson, !log.isDebugEnabled()));

		return ApplicationContextHolder.getBean(FuncBindSupport.class).func(request, newReturnData, !log.isDebugEnabled());
	}
	/** /m0004.json end **/

	/**
	 * /r0001.json begin
	 **xx/
	@Value("${app.root}/config/api/vx/log/operateLog/r0001.input.preValidate.json")
	private String r0001InputPreValidateJson;
	
	@Value("${app.root}/config/api/vx/log/operateLog/r0001.input.json")
	private String r0001InputJson;
	
	@Value("${app.root}/config/api/vx/log/operateLog/r0001.input.postValidate.json")
	private String r0001InputPostValidateJson;
	
	@Value("${app.root}/config/api/vx/log/operateLog/r0001.output.json")
	private String r0001OutputJson;

    @RequestMapping("/r0001.json")
    @ResponseBody
	public Object r0001Json(HttpServletRequest request) {
	    Map<String, Object> inputMap = ApplicationContextHolder.getBean(WebSupport.class).getObject(request, new String[]{r0001InputPreValidateJson, r0001InputJson, r0001InputPostValidateJson}, !log.isDebugEnabled());
		
		Page<Map<String, Object>> page = ApplicationContextHolder.getBean(OperateLogService.class).page(inputMap);

		List<Map<String, Object>> newContent = top.cardone.context.util.ListUtils.newArrayList(page.getContent(), top.cardone.context.util.MapUtils.newMap(r0001OutputJson, !log.isDebugEnabled()));

		Object returnData = ApplicationContextHolder.getBean(PageSupport.class).newMap(newContent, inputMap, page.getTotalElements());

        return ApplicationContextHolder.getBean(FuncBindSupport.class).func(request, returnData, !log.isDebugEnabled());
	}
	/** /r0001.json end **/

	/**
	 * /r0002.json begin
	 **xx/
	@Value("${app.root}/config/api/vx/log/operateLog/r0002.input.preValidate.json")
	private String r0002InputPreValidateJson;
	
	@Value("${app.root}/config/api/vx/log/operateLog/r0002.input.json")
	private String r0002InputJson;
	
	@Value("${app.root}/config/api/vx/log/operateLog/r0002.input.postValidate.json")
	private String r0002InputPostValidateJson;
	
	@Value("${app.root}/config/api/vx/log/operateLog/r0002.output.json")
	private String r0002OutputJson;

    @RequestMapping("/r0002.json")
    @ResponseBody
	public Object r0002Json(HttpServletRequest request) {
	    Map<String, Object> inputMap = ApplicationContextHolder.getBean(WebSupport.class).getObject(request, new String[]{r0002InputPreValidateJson, r0002InputJson, r0002InputPostValidateJson}, !log.isDebugEnabled());
		
		Page<Map<String, Object>> page = ApplicationContextHolder.getBean(OperateLogService.class).page(inputMap);

		List<Map<String, Object>> newContent = top.cardone.context.util.ListUtils.newArrayList(page.getContent(), top.cardone.context.util.MapUtils.newMap(r0002OutputJson, !log.isDebugEnabled()));

		Object returnData = ApplicationContextHolder.getBean(PageSupport.class).newMap(newContent, inputMap, page.getTotalElements());

        return ApplicationContextHolder.getBean(FuncBindSupport.class).func(request, returnData, !log.isDebugEnabled());
	}
	/** /r0002.json end **/

	/**
	 * /r0003.json begin
	 **xx/
	@Value("${app.root}/config/api/vx/log/operateLog/r0003.input.preValidate.json")
	private String r0003InputPreValidateJson;
	
	@Value("${app.root}/config/api/vx/log/operateLog/r0003.input.json")
	private String r0003InputJson;
	
	@Value("${app.root}/config/api/vx/log/operateLog/r0003.input.postValidate.json")
	private String r0003InputPostValidateJson;
	
	@Value("${app.root}/config/api/vx/log/operateLog/r0003.output.json")
	private String r0003OutputJson;

    @RequestMapping("/r0003.json")
    @ResponseBody
	public Object r0003Json(HttpServletRequest request) {
	    Map<String, Object> inputMap = ApplicationContextHolder.getBean(WebSupport.class).getObject(request, new String[]{r0003InputPreValidateJson, r0003InputJson, r0003InputPostValidateJson}, !log.isDebugEnabled());
				
		Page<Map<String, Object>> page = ApplicationContextHolder.getBean(OperateLogService.class).page(inputMap);

		List<Map<String, Object>> newContent = top.cardone.context.util.ListUtils.newArrayList(page.getContent(), top.cardone.context.util.MapUtils.newMap(r0003OutputJson, !log.isDebugEnabled()));

		Object returnData = ApplicationContextHolder.getBean(PageSupport.class).newMap(newContent, inputMap, page.getTotalElements());

        return ApplicationContextHolder.getBean(FuncBindSupport.class).func(request, returnData, !log.isDebugEnabled());
	}
	/** /r0003.json end **/

	/**
	 * /r0004.json begin
	 **xx/
	@Value("${app.root}/config/api/vx/log/operateLog/r0004.input.preValidate.json")
	private String r0004InputPreValidateJson;
	
	@Value("${app.root}/config/api/vx/log/operateLog/r0004.input.json")
	private String r0004InputJson;
	
	@Value("${app.root}/config/api/vx/log/operateLog/r0004.input.postValidate.json")
	private String r0004InputPostValidateJson;
	
	@Value("${app.root}/config/api/vx/log/operateLog/r0004.output.json")
	private String r0004OutputJson;

    @RequestMapping("/r0004.json")
    @ResponseBody
	public Object r0004Json(HttpServletRequest request) {
	    Map<String, Object> inputMap = ApplicationContextHolder.getBean(WebSupport.class).getObject(request, new String[]{r0004InputPreValidateJson, r0004InputJson, r0004InputPostValidateJson}, !log.isDebugEnabled());
		
		Page<Map<String, Object>> page = ApplicationContextHolder.getBean(OperateLogService.class).page(inputMap);

		List<Map<String, Object>> newContent = top.cardone.context.util.ListUtils.newArrayList(page.getContent(), top.cardone.context.util.MapUtils.newMap(r0004OutputJson, !log.isDebugEnabled()));

		Object returnData = ApplicationContextHolder.getBean(PageSupport.class).newMap(newContent, inputMap, page.getTotalElements());

        return ApplicationContextHolder.getBean(FuncBindSupport.class).func(request, returnData, !log.isDebugEnabled());
	}
	/** /r0004.json end **/

	/**
	 * /u0001.json begin
	 **xx/
	@Value("${app.root}/config/api/vx/log/operateLog/u0001.input.preValidate.json")
	private String u0001InputPreValidateJson;
	
	@Value("${app.root}/config/api/vx/log/operateLog/u0001.input.json")
	private String u0001InputJson;
	
	@Value("${app.root}/config/api/vx/log/operateLog/u0001.input.postValidate.json")
	private String u0001InputPostValidateJson;

    @RequestMapping("/u0001.json")
    @ResponseBody
	public Object u0001Json(HttpServletRequest request) {
	    Map<String, Object> inputMap = ApplicationContextHolder.getBean(WebSupport.class).getObject(request, new String[]{u0001InputPreValidateJson, u0001InputJson, u0001InputPostValidateJson}, !log.isDebugEnabled());
		
		Object returnData = ApplicationContextHolder.getBean(OperateLogService.class).updateCache(inputMap);

		return ApplicationContextHolder.getBean(FuncBindSupport.class).func(request, returnData, !log.isDebugEnabled());
	}
	/** /u0001.json end **/

	/**
	 * /u0002.json begin
	 **xx/
	@Value("${app.root}/config/api/vx/log/operateLog/u0002.input.preValidate.json")
	private String u0002InputPreValidateJson;
	
	@Value("${app.root}/config/api/vx/log/operateLog/u0002.input.json")
	private String u0002InputJson;
	
	@Value("${app.root}/config/api/vx/log/operateLog/u0002.input.postValidate.json")
	private String u0002InputPostValidateJson;

    @RequestMapping("/u0002.json")
    @ResponseBody
	public Object u0002Json(HttpServletRequest request) {
	    Map<String, Object> inputMap = ApplicationContextHolder.getBean(WebSupport.class).getObject(request, new String[]{u0002InputPreValidateJson, u0002InputJson, u0002InputPostValidateJson}, !log.isDebugEnabled());
		
		Object returnData = ApplicationContextHolder.getBean(OperateLogService.class).updateCache(inputMap);

		return ApplicationContextHolder.getBean(FuncBindSupport.class).func(request, returnData, !log.isDebugEnabled());
	}
	/** /u0002.json end **/

	/**
	 * /u0003.json begin
	 **xx/
	@Value("${app.root}/config/api/vx/log/operateLog/u0003.input.preValidate.json")
	private String u0003InputPreValidateJson;
	
	@Value("${app.root}/config/api/vx/log/operateLog/u0003.input.json")
	private String u0003InputJson;
	
	@Value("${app.root}/config/api/vx/log/operateLog/u0003.input.postValidate.json")
	private String u0003InputPostValidateJson;

    @RequestMapping("/u0003.json")
    @ResponseBody
	public Object u0003Json(HttpServletRequest request) {
	    Map<String, Object> inputMap = ApplicationContextHolder.getBean(WebSupport.class).getObject(request, new String[]{u0003InputPreValidateJson, u0003InputJson, u0003InputPostValidateJson}, !log.isDebugEnabled());
		
		Object returnData = ApplicationContextHolder.getBean(OperateLogService.class).updateCache(inputMap);

		return ApplicationContextHolder.getBean(FuncBindSupport.class).func(request, returnData, !log.isDebugEnabled());
	}
	/** /u0003.json end **/

	/**
	 * /u0004.json begin
	 **xx/
	@Value("${app.root}/config/api/vx/log/operateLog/u0004.input.preValidate.json")
	private String u0004InputPreValidateJson;
	
	@Value("${app.root}/config/api/vx/log/operateLog/u0004.input.json")
	private String u0004InputJson;
	
	@Value("${app.root}/config/api/vx/log/operateLog/u0004.input.postValidate.json")
	private String u0004InputPostValidateJson;

    @RequestMapping("/u0004.json")
    @ResponseBody
	public Object u0004Json(HttpServletRequest request) {
	    Map<String, Object> inputMap = ApplicationContextHolder.getBean(WebSupport.class).getObject(request, new String[]{u0004InputPreValidateJson, u0004InputJson, u0004InputPostValidateJson}, !log.isDebugEnabled());
		
		Object returnData = ApplicationContextHolder.getBean(OperateLogService.class).updateCache(inputMap);

		return ApplicationContextHolder.getBean(FuncBindSupport.class).func(request, returnData, !log.isDebugEnabled());
	}
	/** /u0004.json end **/

	/**
	 * /addModal.json begin
	 **xx/
	@Value("${app.root}/config/api/vx/log/operateLog/addModal.input.preValidate.json")
	private String addModalInputPreValidateJson;
	
	@Value("${app.root}/config/api/vx/log/operateLog/addModal.input.json")
	private String addModalInputJson;
	
	@Value("${app.root}/config/api/vx/log/operateLog/addModal.input.postValidate.json")
	private String addModalInputPostValidateJson;
	
	@Value("${app.root}/config/api/vx/log/operateLog/addModal.output.json")
	private String addModalOutputJson;

    @RequestMapping("/addModal.json")
    @ResponseBody
	public Object addModalJson(HttpServletRequest request) {
	    Map<String, Object> inputMap = ApplicationContextHolder.getBean(WebSupport.class).getObject(request, new String[]{addModalInputPreValidateJson, addModalInputJson, addModalInputPostValidateJson}, !log.isDebugEnabled());
		
		Map<String, Object> returnData = ApplicationContextHolder.getBean(OperateLogService.class).findOneByOperateLogId(inputMap);

		Map<String, Object> newReturnData = top.cardone.context.util.MapUtils.newHashMap(returnData, top.cardone.context.util.MapUtils.newMap(addModalOutputJson, !log.isDebugEnabled()));

		return ApplicationContextHolder.getBean(FuncBindSupport.class).func(request, newReturnData, !log.isDebugEnabled());
	}
	/** /addModal.json end **/

	/**
	 * /modifyModal.json begin
	 **xx/
	@Value("${app.root}/config/api/vx/log/operateLog/modifyModal.input.preValidate.json")
	private String modifyModalInputPreValidateJson;
	
	@Value("${app.root}/config/api/vx/log/operateLog/modifyModal.input.json")
	private String modifyModalInputJson;
	
	@Value("${app.root}/config/api/vx/log/operateLog/modifyModal.input.postValidate.json")
	private String modifyModalInputPostValidateJson;
	
	@Value("${app.root}/config/api/vx/log/operateLog/modifyModal.output.json")
	private String modifyModalOutputJson;

    @RequestMapping("/modifyModal.json")
    @ResponseBody
	public Object modifyModalJson(HttpServletRequest request) {
	    Map<String, Object> inputMap = ApplicationContextHolder.getBean(WebSupport.class).getObject(request, new String[]{modifyModalInputPreValidateJson, modifyModalInputJson, modifyModalInputPostValidateJson}, !log.isDebugEnabled());
		
		Map<String, Object> returnData = ApplicationContextHolder.getBean(OperateLogService.class).findOneByOperateLogId(inputMap);

		Map<String, Object> newReturnData = top.cardone.context.util.MapUtils.newHashMap(returnData, top.cardone.context.util.MapUtils.newMap(modifyModalOutputJson, !log.isDebugEnabled()));

		return ApplicationContextHolder.getBean(FuncBindSupport.class).func(request, newReturnData, !log.isDebugEnabled());
	}
	/** /modifyModal.json end **/

	/**
	 * /index.json begin
	 **xx/
	@Value("${app.root}/config/api/vx/log/operateLog/index.input.preValidate.json")
	private String indexInputPreValidateJson;
	
	@Value("${app.root}/config/api/vx/log/operateLog/index.input.json")
	private String indexInputJson;
	
	@Value("${app.root}/config/api/vx/log/operateLog/index.input.postValidate.json")
	private String indexInputPostValidateJson;
	
	@Value("${app.root}/config/api/vx/log/operateLog/index.output.json")
	private String indexOutputJson;

    @RequestMapping("/index.json")
    @ResponseBody
	public Object indexJson(HttpServletRequest request) {
	    Map<String, Object> inputMap = ApplicationContextHolder.getBean(WebSupport.class).getObject(request, new String[]{indexInputPreValidateJson,indexInputJson, indexInputPostValidateJson}, !log.isDebugEnabled());
		
		Map<String, Object> returnData = ApplicationContextHolder.getBean(OperateLogService.class).findOneByOperateLogId(inputMap);

		Map<String, Object> newReturnData = top.cardone.context.util.MapUtils.newHashMap(returnData, top.cardone.context.util.MapUtils.newMap(indexOutputJson, !log.isDebugEnabled()));

		return ApplicationContextHolder.getBean(FuncBindSupport.class).func(request, newReturnData, !log.isDebugEnabled());
	}
    /** /index.json end **/
}
