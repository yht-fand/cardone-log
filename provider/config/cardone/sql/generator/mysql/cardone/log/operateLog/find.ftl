SELECT
<#assign prefixName = ' '>
<#if (select_createdByCode??)>
${prefixName} `CREATED_BY_CODE`
<#assign prefixName = ','>
</#if>
<#if (select_createdDate??)>
${prefixName} `CREATED_DATE`
<#assign prefixName = ','>
</#if>
<#if (select_departmentCode??)>
${prefixName} `DEPARTMENT_CODE`
<#assign prefixName = ','>
</#if>
<#if (select_message??)>
${prefixName} `MESSAGE`
<#assign prefixName = ','>
</#if>
<#if (select_operateLogCode??)>
${prefixName} `OPERATE_LOG_CODE`
<#assign prefixName = ','>
</#if>
<#if (select_operateLogId??)>
${prefixName} `OPERATE_LOG_ID`
<#assign prefixName = ','>
</#if>
<#if (select_orgCode??)>
${prefixName} `ORG_CODE`
<#assign prefixName = ','>
</#if>
<#if (select_siteCode??)>
${prefixName} `SITE_CODE`
<#assign prefixName = ','>
</#if>
<#if (select_systemInfoCode??)>
${prefixName} `SYSTEM_INFO_CODE`
<#assign prefixName = ','>
</#if>
<#if (select_typeCode??)>
${prefixName} `TYPE_CODE`
<#assign prefixName = ','>
</#if>
<#if prefixName ==  ' '>
  `CREATED_BY_CODE`
, `CREATED_DATE`
, `DEPARTMENT_CODE`
, `MESSAGE`
, `OPERATE_LOG_CODE`
, `OPERATE_LOG_ID`
, `ORG_CODE`
, `SITE_CODE`
, `SYSTEM_INFO_CODE`
, `TYPE_CODE`
</#if>
FROM c1_operate_log
<#include "where.ftl">
<#assign prefixName = 'ORDER BY'>
<#if (order_by_createdByCode??)>
${prefixName} `CREATED_BY_CODE` ${order_by_createdByCode_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_createdDate??)>
${prefixName} `CREATED_DATE` ${order_by_createdDate_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_departmentCode??)>
${prefixName} `DEPARTMENT_CODE` ${order_by_departmentCode_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_message??)>
${prefixName} `MESSAGE` ${order_by_message_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_operateLogCode??)>
${prefixName} `OPERATE_LOG_CODE` ${order_by_operateLogCode_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_operateLogId??)>
${prefixName} `OPERATE_LOG_ID` ${order_by_operateLogId_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_orgCode??)>
${prefixName} `ORG_CODE` ${order_by_orgCode_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_siteCode??)>
${prefixName} `SITE_CODE` ${order_by_siteCode_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_systemInfoCode??)>
${prefixName} `SYSTEM_INFO_CODE` ${order_by_systemInfoCode_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_typeCode??)>
${prefixName} `TYPE_CODE` ${order_by_typeCode_value!}
<#assign prefixName = ','>
</#if>
