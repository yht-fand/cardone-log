<#assign prefixName = 'WHERE'>
<#if (where_and_eq_batchNo??)>
<#if (where_and_eq_batchNo_value??)>
${prefixName} "batch_no" = :where_and_eq_batchNo_value
<#else>
${prefixName} "batch_no" IS NULL
</#if>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_beginDate??)>
<#if (where_and_eq_beginDate_value??)>
${prefixName} "begin_date" = :where_and_eq_beginDate_value
<#else>
${prefixName} "begin_date" IS NULL
</#if>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_createdByCode??)>
<#if (where_and_eq_createdByCode_value??)>
${prefixName} "created_by_code" = :where_and_eq_createdByCode_value
<#else>
${prefixName} "created_by_code" IS NULL
</#if>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_createdDate??)>
<#if (where_and_eq_createdDate_value??)>
${prefixName} "created_date" = :where_and_eq_createdDate_value
<#else>
${prefixName} "created_date" IS NULL
</#if>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_dataStateCode??)>
<#if (where_and_eq_dataStateCode_value??)>
${prefixName} "data_state_code" = :where_and_eq_dataStateCode_value
<#else>
${prefixName} "data_state_code" IS NULL
</#if>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_departmentCode??)>
<#if (where_and_eq_departmentCode_value??)>
${prefixName} "department_code" = :where_and_eq_departmentCode_value
<#else>
${prefixName} "department_code" IS NULL
</#if>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_endDate??)>
<#if (where_and_eq_endDate_value??)>
${prefixName} "end_date" = :where_and_eq_endDate_value
<#else>
${prefixName} "end_date" IS NULL
</#if>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_flagCode??)>
<#if (where_and_eq_flagCode_value??)>
${prefixName} "flag_code" = :where_and_eq_flagCode_value
<#else>
${prefixName} "flag_code" IS NULL
</#if>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_flagObjectCode??)>
<#if (where_and_eq_flagObjectCode_value??)>
${prefixName} "flag_object_code" = :where_and_eq_flagObjectCode_value
<#else>
${prefixName} "flag_object_code" IS NULL
</#if>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_jsonData??)>
<#if (where_and_eq_jsonData_value??)>
${prefixName} "json_data" = :where_and_eq_jsonData_value
<#else>
${prefixName} "json_data" IS NULL
</#if>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_lastModifiedByCode??)>
<#if (where_and_eq_lastModifiedByCode_value??)>
${prefixName} "last_modified_by_code" = :where_and_eq_lastModifiedByCode_value
<#else>
${prefixName} "last_modified_by_code" IS NULL
</#if>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_lastModifiedDate??)>
<#if (where_and_eq_lastModifiedDate_value??)>
${prefixName} "last_modified_date" = :where_and_eq_lastModifiedDate_value
<#else>
${prefixName} "last_modified_date" IS NULL
</#if>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_message??)>
<#if (where_and_eq_message_value??)>
${prefixName} "message" = :where_and_eq_message_value
<#else>
${prefixName} "message" IS NULL
</#if>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_objectCode??)>
<#if (where_and_eq_objectCode_value??)>
${prefixName} "object_code" = :where_and_eq_objectCode_value
<#else>
${prefixName} "object_code" IS NULL
</#if>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_objectId??)>
<#if (where_and_eq_objectId_value??)>
${prefixName} "object_id" = :where_and_eq_objectId_value
<#else>
${prefixName} "object_id" IS NULL
</#if>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_objectTypeCode??)>
<#if (where_and_eq_objectTypeCode_value??)>
${prefixName} "object_type_code" = :where_and_eq_objectTypeCode_value
<#else>
${prefixName} "object_type_code" IS NULL
</#if>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_operateLogId??)>
<#if (where_and_eq_operateLogId_value??)>
${prefixName} "operate_log_id" = :where_and_eq_operateLogId_value
<#else>
${prefixName} "operate_log_id" IS NULL
</#if>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_orderBy??)>
<#if (where_and_eq_orderBy_value??)>
${prefixName} "order_by_" = :where_and_eq_orderBy_value
<#else>
${prefixName} "order_by_" IS NULL
</#if>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_orgCode??)>
<#if (where_and_eq_orgCode_value??)>
${prefixName} "org_code" = :where_and_eq_orgCode_value
<#else>
${prefixName} "org_code" IS NULL
</#if>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_personalCode??)>
<#if (where_and_eq_personalCode_value??)>
${prefixName} "personal_code" = :where_and_eq_personalCode_value
<#else>
${prefixName} "personal_code" IS NULL
</#if>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_siteCode??)>
<#if (where_and_eq_siteCode_value??)>
${prefixName} "site_code" = :where_and_eq_siteCode_value
<#else>
${prefixName} "site_code" IS NULL
</#if>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_stateCode??)>
<#if (where_and_eq_stateCode_value??)>
${prefixName} "state_code" = :where_and_eq_stateCode_value
<#else>
${prefixName} "state_code" IS NULL
</#if>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_systemInfoCode??)>
<#if (where_and_eq_systemInfoCode_value??)>
${prefixName} "system_info_code" = :where_and_eq_systemInfoCode_value
<#else>
${prefixName} "system_info_code" IS NULL
</#if>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_typeCode??)>
<#if (where_and_eq_typeCode_value??)>
${prefixName} "type_code" = :where_and_eq_typeCode_value
<#else>
${prefixName} "type_code" IS NULL
</#if>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_version??)>
<#if (where_and_eq_version_value??)>
${prefixName} "version_" = :where_and_eq_version_value
<#else>
${prefixName} "version_" IS NULL
</#if>
<#assign prefixName = 'AND'>
</#if>
