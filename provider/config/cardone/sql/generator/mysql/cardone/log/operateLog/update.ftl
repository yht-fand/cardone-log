UPDATE c1_operate_log
<#assign prefixName = 'SET'>
<#if (update_beginDate??)>
${prefixName} `BEGIN_DATE` = :update_beginDate_value
<#assign prefixName = ','>
</#if>
<#if (update_createdByCode??)>
${prefixName} `CREATED_BY_CODE` = :update_createdByCode_value
<#assign prefixName = ','>
</#if>
<#if (update_createdDate??)>
${prefixName} `CREATED_DATE` = :update_createdDate_value
<#assign prefixName = ','>
</#if>
<#if (update_dataStateCode??)>
${prefixName} `DATA_STATE_CODE` = :update_dataStateCode_value
<#assign prefixName = ','>
</#if>
<#if (update_departmentCode??)>
${prefixName} `DEPARTMENT_CODE` = :update_departmentCode_value
<#assign prefixName = ','>
</#if>
<#if (update_endDate??)>
${prefixName} `END_DATE` = :update_endDate_value
<#assign prefixName = ','>
</#if>
<#if (update_flagCode??)>
${prefixName} `FLAG_CODE` = :update_flagCode_value
<#assign prefixName = ','>
</#if>
<#if (update_flagObjectCode??)>
${prefixName} `FLAG_OBJECT_CODE` = :update_flagObjectCode_value
<#assign prefixName = ','>
</#if>
<#if (update_jsonData??)>
${prefixName} `JSON_DATA` = :update_jsonData_value
<#assign prefixName = ','>
</#if>
<#if (update_lastModifiedByCode??)>
${prefixName} `LAST_MODIFIED_BY_CODE` = :update_lastModifiedByCode_value
<#assign prefixName = ','>
</#if>
<#if (update_lastModifiedDate??)>
${prefixName} `LAST_MODIFIED_DATE` = :update_lastModifiedDate_value
<#assign prefixName = ','>
</#if>
<#if (update_message??)>
${prefixName} `MESSAGE` = :update_message_value
<#assign prefixName = ','>
</#if>
<#if (update_objectCode??)>
${prefixName} `OBJECT_CODE` = :update_objectCode_value
<#assign prefixName = ','>
</#if>
<#if (update_objectId??)>
${prefixName} `OBJECT_ID` = :update_objectId_value
<#assign prefixName = ','>
</#if>
<#if (update_objectTypeCode??)>
${prefixName} `OBJECT_TYPE_CODE` = :update_objectTypeCode_value
<#assign prefixName = ','>
</#if>
<#if (update_operateLogId??)>
${prefixName} `OPERATE_LOG_ID` = :update_operateLogId_value
<#assign prefixName = ','>
</#if>
<#if (update_order??)>
${prefixName} `ORDER_` = :update_order_value
<#assign prefixName = ','>
</#if>
<#if (update_orgCode??)>
${prefixName} `ORG_CODE` = :update_orgCode_value
<#assign prefixName = ','>
</#if>
<#if (update_siteCode??)>
${prefixName} `SITE_CODE` = :update_siteCode_value
<#assign prefixName = ','>
</#if>
<#if (update_stateCode??)>
${prefixName} `STATE_CODE` = :update_stateCode_value
<#assign prefixName = ','>
</#if>
<#if (update_systemInfoCode??)>
${prefixName} `SYSTEM_INFO_CODE` = :update_systemInfoCode_value
<#assign prefixName = ','>
</#if>
<#if (update_typeCode??)>
${prefixName} `TYPE_CODE` = :update_typeCode_value
<#assign prefixName = ','>
</#if>
<#if (update_version??)>
${prefixName} `VERSION_` = :update_version_value
<#assign prefixName = ','>
</#if>
<#include "where.ftl">