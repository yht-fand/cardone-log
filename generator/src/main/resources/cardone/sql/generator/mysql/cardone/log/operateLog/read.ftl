SELECT
<#switch (object_id!)>
<#case "createdByCode">
CREATED_BY_CODE AS createdByCode
<#break>
<#case "createdDate">
CREATED_DATE AS createdDate
<#break>
<#case "departmentCode">
DEPARTMENT_CODE AS departmentCode
<#break>
<#case "message">
MESSAGE AS message
<#break>
<#case "operateLogCode">
OPERATE_LOG_CODE AS operateLogCode
<#break>
<#case "operateLogId">
OPERATE_LOG_ID AS operateLogId
<#break>
<#case "orgCode">
ORG_CODE AS orgCode
<#break>
<#case "typeCode">
TYPE_CODE AS typeCode
<#break>
<#default>
COUNT(1) AS COUNT_
</#switch>
FROM t_operate_log
<#include "where.ftl">