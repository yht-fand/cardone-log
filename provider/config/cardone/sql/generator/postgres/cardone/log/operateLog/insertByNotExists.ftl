INSERT
INTO
c1_operate_log
(<#assign prefixName = true>
<#if (insert_batchNo??) && (insert_batchNo_value??)>
${prefixName?string('  ', ', ')}"batch_no"
<#assign prefixName = false>
</#if>
<#if (insert_beginDate??) && (insert_beginDate_value??)>
${prefixName?string('  ', ', ')}"begin_date"
<#assign prefixName = false>
</#if>
<#if (insert_createdByCode??) && (insert_createdByCode_value??)>
${prefixName?string('  ', ', ')}"created_by_code"
<#assign prefixName = false>
</#if>
<#if (insert_createdById??) && (insert_createdById_value??)>
${prefixName?string('  ', ', ')}"created_by_id"
<#assign prefixName = false>
</#if>
<#if (insert_createdDate??) && (insert_createdDate_value??)>
${prefixName?string('  ', ', ')}"created_date"
<#assign prefixName = false>
</#if>
<#if (insert_dataStateCode??) && (insert_dataStateCode_value??)>
${prefixName?string('  ', ', ')}"data_state_code"
<#assign prefixName = false>
</#if>
<#if (insert_departmentCode??) && (insert_departmentCode_value??)>
${prefixName?string('  ', ', ')}"department_code"
<#assign prefixName = false>
</#if>
<#if (insert_endDate??) && (insert_endDate_value??)>
${prefixName?string('  ', ', ')}"end_date"
<#assign prefixName = false>
</#if>
<#if (insert_flagCode??) && (insert_flagCode_value??)>
${prefixName?string('  ', ', ')}"flag_code"
<#assign prefixName = false>
</#if>
<#if (insert_flagObjectCode??) && (insert_flagObjectCode_value??)>
${prefixName?string('  ', ', ')}"flag_object_code"
<#assign prefixName = false>
</#if>
<#if (insert_jsonData??) && (insert_jsonData_value??)>
${prefixName?string('  ', ', ')}"json_data"
<#assign prefixName = false>
</#if>
<#if (insert_lastModifiedByCode??) && (insert_lastModifiedByCode_value??)>
${prefixName?string('  ', ', ')}"last_modified_by_code"
<#assign prefixName = false>
</#if>
<#if (insert_lastModifiedById??) && (insert_lastModifiedById_value??)>
${prefixName?string('  ', ', ')}"last_modified_by_id"
<#assign prefixName = false>
</#if>
<#if (insert_lastModifiedDate??) && (insert_lastModifiedDate_value??)>
${prefixName?string('  ', ', ')}"last_modified_date"
<#assign prefixName = false>
</#if>
<#if (insert_message??) && (insert_message_value??)>
${prefixName?string('  ', ', ')}"message"
<#assign prefixName = false>
</#if>
<#if (insert_objectCode??) && (insert_objectCode_value??)>
${prefixName?string('  ', ', ')}"object_code"
<#assign prefixName = false>
</#if>
<#if (insert_objectId??) && (insert_objectId_value??)>
${prefixName?string('  ', ', ')}"object_id"
<#assign prefixName = false>
</#if>
<#if (insert_objectTypeCode??) && (insert_objectTypeCode_value??)>
${prefixName?string('  ', ', ')}"object_type_code"
<#assign prefixName = false>
</#if>
<#if (insert_operateLogId??) && (insert_operateLogId_value??)>
${prefixName?string('  ', ', ')}"operate_log_id"
<#assign prefixName = false>
</#if>
<#if (insert_orderBy??) && (insert_orderBy_value??)>
${prefixName?string('  ', ', ')}"order_by_"
<#assign prefixName = false>
</#if>
<#if (insert_orgCode??) && (insert_orgCode_value??)>
${prefixName?string('  ', ', ')}"org_code"
<#assign prefixName = false>
</#if>
<#if (insert_personalCode??) && (insert_personalCode_value??)>
${prefixName?string('  ', ', ')}"personal_code"
<#assign prefixName = false>
</#if>
<#if (insert_personalId??) && (insert_personalId_value??)>
${prefixName?string('  ', ', ')}"personal_id"
<#assign prefixName = false>
</#if>
<#if (insert_siteCode??) && (insert_siteCode_value??)>
${prefixName?string('  ', ', ')}"site_code"
<#assign prefixName = false>
</#if>
<#if (insert_stateCode??) && (insert_stateCode_value??)>
${prefixName?string('  ', ', ')}"state_code"
<#assign prefixName = false>
</#if>
<#if (insert_systemInfoCode??) && (insert_systemInfoCode_value??)>
${prefixName?string('  ', ', ')}"system_info_code"
<#assign prefixName = false>
</#if>
<#if (insert_typeCode??) && (insert_typeCode_value??)>
${prefixName?string('  ', ', ')}"type_code"
<#assign prefixName = false>
</#if>
<#if (insert_version??) && (insert_version_value??)>
${prefixName?string('  ', ', ')}"version_"
<#assign prefixName = false>
</#if>
)
(SELECT
<#assign prefixName = true>
<#if (insert_batchNo??) && (insert_batchNo_value??)>
${prefixName?string('  ', ', ')}:insert_batchNo_value
<#assign prefixName = false>
</#if>
<#if (insert_beginDate??) && (insert_beginDate_value??)>
${prefixName?string('  ', ', ')}:insert_beginDate_value
<#assign prefixName = false>
</#if>
<#if (insert_createdByCode??) && (insert_createdByCode_value??)>
${prefixName?string('  ', ', ')}:insert_createdByCode_value
<#assign prefixName = false>
</#if>
<#if (insert_createdById??) && (insert_createdById_value??)>
${prefixName?string('  ', ', ')}:insert_createdById_value
<#assign prefixName = false>
</#if>
<#if (insert_createdDate??) && (insert_createdDate_value??)>
${prefixName?string('  ', ', ')}:insert_createdDate_value
<#assign prefixName = false>
</#if>
<#if (insert_dataStateCode??) && (insert_dataStateCode_value??)>
${prefixName?string('  ', ', ')}:insert_dataStateCode_value
<#assign prefixName = false>
</#if>
<#if (insert_departmentCode??) && (insert_departmentCode_value??)>
${prefixName?string('  ', ', ')}:insert_departmentCode_value
<#assign prefixName = false>
</#if>
<#if (insert_endDate??) && (insert_endDate_value??)>
${prefixName?string('  ', ', ')}:insert_endDate_value
<#assign prefixName = false>
</#if>
<#if (insert_flagCode??) && (insert_flagCode_value??)>
${prefixName?string('  ', ', ')}:insert_flagCode_value
<#assign prefixName = false>
</#if>
<#if (insert_flagObjectCode??) && (insert_flagObjectCode_value??)>
${prefixName?string('  ', ', ')}:insert_flagObjectCode_value
<#assign prefixName = false>
</#if>
<#if (insert_jsonData??) && (insert_jsonData_value??)>
${prefixName?string('  ', ', ')}:insert_jsonData_value
<#assign prefixName = false>
</#if>
<#if (insert_lastModifiedByCode??) && (insert_lastModifiedByCode_value??)>
${prefixName?string('  ', ', ')}:insert_lastModifiedByCode_value
<#assign prefixName = false>
</#if>
<#if (insert_lastModifiedById??) && (insert_lastModifiedById_value??)>
${prefixName?string('  ', ', ')}:insert_lastModifiedById_value
<#assign prefixName = false>
</#if>
<#if (insert_lastModifiedDate??) && (insert_lastModifiedDate_value??)>
${prefixName?string('  ', ', ')}:insert_lastModifiedDate_value
<#assign prefixName = false>
</#if>
<#if (insert_message??) && (insert_message_value??)>
${prefixName?string('  ', ', ')}:insert_message_value
<#assign prefixName = false>
</#if>
<#if (insert_objectCode??) && (insert_objectCode_value??)>
${prefixName?string('  ', ', ')}:insert_objectCode_value
<#assign prefixName = false>
</#if>
<#if (insert_objectId??) && (insert_objectId_value??)>
${prefixName?string('  ', ', ')}:insert_objectId_value
<#assign prefixName = false>
</#if>
<#if (insert_objectTypeCode??) && (insert_objectTypeCode_value??)>
${prefixName?string('  ', ', ')}:insert_objectTypeCode_value
<#assign prefixName = false>
</#if>
<#if (insert_operateLogId??) && (insert_operateLogId_value??)>
${prefixName?string('  ', ', ')}:insert_operateLogId_value
<#assign prefixName = false>
</#if>
<#if (insert_orderBy??) && (insert_orderBy_value??)>
${prefixName?string('  ', ', ')}:insert_orderBy_value
<#assign prefixName = false>
</#if>
<#if (insert_orgCode??) && (insert_orgCode_value??)>
${prefixName?string('  ', ', ')}:insert_orgCode_value
<#assign prefixName = false>
</#if>
<#if (insert_personalCode??) && (insert_personalCode_value??)>
${prefixName?string('  ', ', ')}:insert_personalCode_value
<#assign prefixName = false>
</#if>
<#if (insert_personalId??) && (insert_personalId_value??)>
${prefixName?string('  ', ', ')}:insert_personalId_value
<#assign prefixName = false>
</#if>
<#if (insert_siteCode??) && (insert_siteCode_value??)>
${prefixName?string('  ', ', ')}:insert_siteCode_value
<#assign prefixName = false>
</#if>
<#if (insert_stateCode??) && (insert_stateCode_value??)>
${prefixName?string('  ', ', ')}:insert_stateCode_value
<#assign prefixName = false>
</#if>
<#if (insert_systemInfoCode??) && (insert_systemInfoCode_value??)>
${prefixName?string('  ', ', ')}:insert_systemInfoCode_value
<#assign prefixName = false>
</#if>
<#if (insert_typeCode??) && (insert_typeCode_value??)>
${prefixName?string('  ', ', ')}:insert_typeCode_value
<#assign prefixName = false>
</#if>
<#if (insert_version??) && (insert_version_value??)>
${prefixName?string('  ', ', ')}:insert_version_value
<#assign prefixName = false>
</#if>
WHERE NOT EXISTS (SELECT 1 FROM c1_operate_log E
<#assign prefixName = true>
<#if (where_and_eq_batchNo??)>
<#if (where_and_eq_batchNo_value??)>
${prefixName?string('WHERE ', 'AND ')}E."batch_no" = :where_and_eq_batchNo_value
<#else>
${prefixName?string('WHERE ', 'AND ')}(E."batch_no" IS NULL OR E."batch_no" = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_beginDate??)>
<#if (where_and_eq_beginDate_value??)>
${prefixName?string('WHERE ', 'AND ')}E."begin_date" = :where_and_eq_beginDate_value
<#else>
${prefixName?string('WHERE ', 'AND ')}E."begin_date" IS NULL
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_createdByCode??)>
<#if (where_and_eq_createdByCode_value??)>
${prefixName?string('WHERE ', 'AND ')}E."created_by_code" = :where_and_eq_createdByCode_value
<#else>
${prefixName?string('WHERE ', 'AND ')}(E."created_by_code" IS NULL OR E."created_by_code" = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_createdById??)>
<#if (where_and_eq_createdById_value??)>
${prefixName?string('WHERE ', 'AND ')}E."created_by_id" = :where_and_eq_createdById_value
<#else>
${prefixName?string('WHERE ', 'AND ')}(E."created_by_id" IS NULL OR E."created_by_id" = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_createdDate??)>
<#if (where_and_eq_createdDate_value??)>
${prefixName?string('WHERE ', 'AND ')}E."created_date" = :where_and_eq_createdDate_value
<#else>
${prefixName?string('WHERE ', 'AND ')}E."created_date" IS NULL
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_dataStateCode??)>
<#if (where_and_eq_dataStateCode_value??)>
${prefixName?string('WHERE ', 'AND ')}E."data_state_code" = :where_and_eq_dataStateCode_value
<#else>
${prefixName?string('WHERE ', 'AND ')}(E."data_state_code" IS NULL OR E."data_state_code" = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_departmentCode??)>
<#if (where_and_eq_departmentCode_value??)>
${prefixName?string('WHERE ', 'AND ')}E."department_code" = :where_and_eq_departmentCode_value
<#else>
${prefixName?string('WHERE ', 'AND ')}(E."department_code" IS NULL OR E."department_code" = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_endDate??)>
<#if (where_and_eq_endDate_value??)>
${prefixName?string('WHERE ', 'AND ')}E."end_date" = :where_and_eq_endDate_value
<#else>
${prefixName?string('WHERE ', 'AND ')}E."end_date" IS NULL
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_flagCode??)>
<#if (where_and_eq_flagCode_value??)>
${prefixName?string('WHERE ', 'AND ')}E."flag_code" = :where_and_eq_flagCode_value
<#else>
${prefixName?string('WHERE ', 'AND ')}(E."flag_code" IS NULL OR E."flag_code" = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_flagObjectCode??)>
<#if (where_and_eq_flagObjectCode_value??)>
${prefixName?string('WHERE ', 'AND ')}E."flag_object_code" = :where_and_eq_flagObjectCode_value
<#else>
${prefixName?string('WHERE ', 'AND ')}(E."flag_object_code" IS NULL OR E."flag_object_code" = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_jsonData??)>
<#if (where_and_eq_jsonData_value??)>
${prefixName?string('WHERE ', 'AND ')}E."json_data" = :where_and_eq_jsonData_value
<#else>
${prefixName?string('WHERE ', 'AND ')}E."json_data" IS NULL
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_lastModifiedByCode??)>
<#if (where_and_eq_lastModifiedByCode_value??)>
${prefixName?string('WHERE ', 'AND ')}E."last_modified_by_code" = :where_and_eq_lastModifiedByCode_value
<#else>
${prefixName?string('WHERE ', 'AND ')}(E."last_modified_by_code" IS NULL OR E."last_modified_by_code" = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_lastModifiedById??)>
<#if (where_and_eq_lastModifiedById_value??)>
${prefixName?string('WHERE ', 'AND ')}E."last_modified_by_id" = :where_and_eq_lastModifiedById_value
<#else>
${prefixName?string('WHERE ', 'AND ')}(E."last_modified_by_id" IS NULL OR E."last_modified_by_id" = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_lastModifiedDate??)>
<#if (where_and_eq_lastModifiedDate_value??)>
${prefixName?string('WHERE ', 'AND ')}E."last_modified_date" = :where_and_eq_lastModifiedDate_value
<#else>
${prefixName?string('WHERE ', 'AND ')}E."last_modified_date" IS NULL
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_message??)>
<#if (where_and_eq_message_value??)>
${prefixName?string('WHERE ', 'AND ')}E."message" = :where_and_eq_message_value
<#else>
${prefixName?string('WHERE ', 'AND ')}(E."message" IS NULL OR E."message" = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_objectCode??)>
<#if (where_and_eq_objectCode_value??)>
${prefixName?string('WHERE ', 'AND ')}E."object_code" = :where_and_eq_objectCode_value
<#else>
${prefixName?string('WHERE ', 'AND ')}(E."object_code" IS NULL OR E."object_code" = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_objectId??)>
<#if (where_and_eq_objectId_value??)>
${prefixName?string('WHERE ', 'AND ')}E."object_id" = :where_and_eq_objectId_value
<#else>
${prefixName?string('WHERE ', 'AND ')}(E."object_id" IS NULL OR E."object_id" = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_objectTypeCode??)>
<#if (where_and_eq_objectTypeCode_value??)>
${prefixName?string('WHERE ', 'AND ')}E."object_type_code" = :where_and_eq_objectTypeCode_value
<#else>
${prefixName?string('WHERE ', 'AND ')}(E."object_type_code" IS NULL OR E."object_type_code" = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_operateLogId??)>
<#if (where_and_eq_operateLogId_value??)>
${prefixName?string('WHERE ', 'AND ')}E."operate_log_id" = :where_and_eq_operateLogId_value
<#else>
${prefixName?string('WHERE ', 'AND ')}(E."operate_log_id" IS NULL OR E."operate_log_id" = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_orderBy??)>
<#if (where_and_eq_orderBy_value??)>
${prefixName?string('WHERE ', 'AND ')}E."order_by_" = :where_and_eq_orderBy_value
<#else>
${prefixName?string('WHERE ', 'AND ')}E."order_by_" IS NULL
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_orgCode??)>
<#if (where_and_eq_orgCode_value??)>
${prefixName?string('WHERE ', 'AND ')}E."org_code" = :where_and_eq_orgCode_value
<#else>
${prefixName?string('WHERE ', 'AND ')}(E."org_code" IS NULL OR E."org_code" = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_personalCode??)>
<#if (where_and_eq_personalCode_value??)>
${prefixName?string('WHERE ', 'AND ')}E."personal_code" = :where_and_eq_personalCode_value
<#else>
${prefixName?string('WHERE ', 'AND ')}(E."personal_code" IS NULL OR E."personal_code" = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_personalId??)>
<#if (where_and_eq_personalId_value??)>
${prefixName?string('WHERE ', 'AND ')}E."personal_id" = :where_and_eq_personalId_value
<#else>
${prefixName?string('WHERE ', 'AND ')}(E."personal_id" IS NULL OR E."personal_id" = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_siteCode??)>
<#if (where_and_eq_siteCode_value??)>
${prefixName?string('WHERE ', 'AND ')}E."site_code" = :where_and_eq_siteCode_value
<#else>
${prefixName?string('WHERE ', 'AND ')}(E."site_code" IS NULL OR E."site_code" = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_stateCode??)>
<#if (where_and_eq_stateCode_value??)>
${prefixName?string('WHERE ', 'AND ')}E."state_code" = :where_and_eq_stateCode_value
<#else>
${prefixName?string('WHERE ', 'AND ')}(E."state_code" IS NULL OR E."state_code" = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_systemInfoCode??)>
<#if (where_and_eq_systemInfoCode_value??)>
${prefixName?string('WHERE ', 'AND ')}E."system_info_code" = :where_and_eq_systemInfoCode_value
<#else>
${prefixName?string('WHERE ', 'AND ')}(E."system_info_code" IS NULL OR E."system_info_code" = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_typeCode??)>
<#if (where_and_eq_typeCode_value??)>
${prefixName?string('WHERE ', 'AND ')}E."type_code" = :where_and_eq_typeCode_value
<#else>
${prefixName?string('WHERE ', 'AND ')}(E."type_code" IS NULL OR E."type_code" = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_version??)>
<#if (where_and_eq_version_value??)>
${prefixName?string('WHERE ', 'AND ')}E."version_" = :where_and_eq_version_value
<#else>
${prefixName?string('WHERE ', 'AND ')}E."version_" IS NULL
</#if>
<#assign prefixName = false>
</#if>
))