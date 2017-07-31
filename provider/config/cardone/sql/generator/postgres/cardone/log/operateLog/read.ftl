SELECT
<#switch (object_id!)>
<#case "batchNo">
"batch_no"
<#break>
<#case "beginDate">
"begin_date"
<#break>
<#case "createdByCode">
"created_by_code"
<#break>
<#case "createdById">
"created_by_id"
<#break>
<#case "createdDate">
"created_date"
<#break>
<#case "dataStateCode">
"data_state_code"
<#break>
<#case "departmentCode">
"department_code"
<#break>
<#case "endDate">
"end_date"
<#break>
<#case "flagCode">
"flag_code"
<#break>
<#case "flagObjectCode">
"flag_object_code"
<#break>
<#case "jsonData">
"json_data"
<#break>
<#case "lastModifiedByCode">
"last_modified_by_code"
<#break>
<#case "lastModifiedById">
"last_modified_by_id"
<#break>
<#case "lastModifiedDate">
"last_modified_date"
<#break>
<#case "message">
"message"
<#break>
<#case "objectCode">
"object_code"
<#break>
<#case "objectId">
"object_id"
<#break>
<#case "objectTypeCode">
"object_type_code"
<#break>
<#case "operateLogId">
"operate_log_id"
<#break>
<#case "orderBy">
"order_by_"
<#break>
<#case "orgCode">
"org_code"
<#break>
<#case "personalCode">
"personal_code"
<#break>
<#case "personalId">
"personal_id"
<#break>
<#case "siteCode">
"site_code"
<#break>
<#case "stateCode">
"state_code"
<#break>
<#case "systemInfoCode">
"system_info_code"
<#break>
<#case "typeCode">
"type_code"
<#break>
<#case "version">
"version_"
<#break>
<#default>
COUNT(*) AS COUNT_
</#switch>
FROM c1_operate_log
<#include "where.ftl">