UPDATE t_operate_log
<#assign prefixName = 'SET'>
<#if (update_createdByCode??)>
<#if (update_createdByCode_value??)>
${prefixName} `CREATED_BY_CODE` = :update_createdByCode_value
</#if>
<#assign prefixName = ','>
</#if>
<#if (update_createdDate??)>
<#if (update_createdDate_value??)>
${prefixName} `CREATED_DATE` = :update_createdDate_value
</#if>
<#assign prefixName = ','>
</#if>
<#if (update_departmentCode??)>
<#if (update_departmentCode_value??)>
${prefixName} `DEPARTMENT_CODE` = :update_departmentCode_value
</#if>
<#assign prefixName = ','>
</#if>
<#if (update_message??)>
<#if (update_message_value??)>
${prefixName} `MESSAGE` = :update_message_value
</#if>
<#assign prefixName = ','>
</#if>
<#if (update_operateLogCode??)>
<#if (update_operateLogCode_value??)>
${prefixName} `OPERATE_LOG_CODE` = :update_operateLogCode_value
</#if>
<#assign prefixName = ','>
</#if>
<#if (update_operateLogId??)>
<#if (update_operateLogId_value??)>
${prefixName} `OPERATE_LOG_ID` = :update_operateLogId_value
</#if>
<#assign prefixName = ','>
</#if>
<#if (update_orgCode??)>
<#if (update_orgCode_value??)>
${prefixName} `ORG_CODE` = :update_orgCode_value
</#if>
<#assign prefixName = ','>
</#if>
<#if (update_siteCode??)>
<#if (update_siteCode_value??)>
${prefixName} `SITE_CODE` = :update_siteCode_value
</#if>
<#assign prefixName = ','>
</#if>
<#if (update_systemInfoCode??)>
<#if (update_systemInfoCode_value??)>
${prefixName} `SYSTEM_INFO_CODE` = :update_systemInfoCode_value
</#if>
<#assign prefixName = ','>
</#if>
<#if (update_typeCode??)>
<#if (update_typeCode_value??)>
${prefixName} `TYPE_CODE` = :update_typeCode_value
</#if>
<#assign prefixName = ','>
</#if>
<#include "where.ftl">