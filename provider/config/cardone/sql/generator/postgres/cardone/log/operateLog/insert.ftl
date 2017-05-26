INSERT
INTO c1_operate_log
(<#assign prefixName = ' '>
<#if (insert_batchNo??) && (insert_batchNo_value??)>
${prefixName} "batch_no"
<#assign prefixName = ','>
</#if>
<#if (insert_beginDate??) && (insert_beginDate_value??)>
${prefixName} "begin_date"
<#assign prefixName = ','>
</#if>
<#if (insert_createdByCode??) && (insert_createdByCode_value??)>
${prefixName} "created_by_code"
<#assign prefixName = ','>
</#if>
<#if (insert_createdDate??) && (insert_createdDate_value??)>
${prefixName} "created_date"
<#assign prefixName = ','>
</#if>
<#if (insert_dataStateCode??) && (insert_dataStateCode_value??)>
${prefixName} "data_state_code"
<#assign prefixName = ','>
</#if>
<#if (insert_departmentCode??) && (insert_departmentCode_value??)>
${prefixName} "department_code"
<#assign prefixName = ','>
</#if>
<#if (insert_endDate??) && (insert_endDate_value??)>
${prefixName} "end_date"
<#assign prefixName = ','>
</#if>
<#if (insert_flagCode??) && (insert_flagCode_value??)>
${prefixName} "flag_code"
<#assign prefixName = ','>
</#if>
<#if (insert_flagObjectCode??) && (insert_flagObjectCode_value??)>
${prefixName} "flag_object_code"
<#assign prefixName = ','>
</#if>
<#if (insert_jsonData??) && (insert_jsonData_value??)>
${prefixName} "json_data"
<#assign prefixName = ','>
</#if>
<#if (insert_lastModifiedByCode??) && (insert_lastModifiedByCode_value??)>
${prefixName} "last_modified_by_code"
<#assign prefixName = ','>
</#if>
<#if (insert_lastModifiedDate??) && (insert_lastModifiedDate_value??)>
${prefixName} "last_modified_date"
<#assign prefixName = ','>
</#if>
<#if (insert_message??) && (insert_message_value??)>
${prefixName} "message"
<#assign prefixName = ','>
</#if>
<#if (insert_objectCode??) && (insert_objectCode_value??)>
${prefixName} "object_code"
<#assign prefixName = ','>
</#if>
<#if (insert_objectId??) && (insert_objectId_value??)>
${prefixName} "object_id"
<#assign prefixName = ','>
</#if>
<#if (insert_objectTypeCode??) && (insert_objectTypeCode_value??)>
${prefixName} "object_type_code"
<#assign prefixName = ','>
</#if>
<#if (insert_operateLogId??) && (insert_operateLogId_value??)>
${prefixName} "operate_log_id"
<#assign prefixName = ','>
</#if>
<#if (insert_orderBy??) && (insert_orderBy_value??)>
${prefixName} "order_by_"
<#assign prefixName = ','>
</#if>
<#if (insert_orgCode??) && (insert_orgCode_value??)>
${prefixName} "org_code"
<#assign prefixName = ','>
</#if>
<#if (insert_personalCode??) && (insert_personalCode_value??)>
${prefixName} "personal_code"
<#assign prefixName = ','>
</#if>
<#if (insert_siteCode??) && (insert_siteCode_value??)>
${prefixName} "site_code"
<#assign prefixName = ','>
</#if>
<#if (insert_stateCode??) && (insert_stateCode_value??)>
${prefixName} "state_code"
<#assign prefixName = ','>
</#if>
<#if (insert_systemInfoCode??) && (insert_systemInfoCode_value??)>
${prefixName} "system_info_code"
<#assign prefixName = ','>
</#if>
<#if (insert_typeCode??) && (insert_typeCode_value??)>
${prefixName} "type_code"
<#assign prefixName = ','>
</#if>
<#if (insert_version??) && (insert_version_value??)>
${prefixName} "version_"
<#assign prefixName = ','>
</#if>
)
VALUES
(<#assign prefixName = ' '>
<#if (insert_batchNo??) && (insert_batchNo_value??)>
${prefixName} :insert_batchNo_value
<#assign prefixName = ','>
</#if>
<#if (insert_beginDate??) && (insert_beginDate_value??)>
${prefixName} :insert_beginDate_value
<#assign prefixName = ','>
</#if>
<#if (insert_createdByCode??) && (insert_createdByCode_value??)>
${prefixName} :insert_createdByCode_value
<#assign prefixName = ','>
</#if>
<#if (insert_createdDate??) && (insert_createdDate_value??)>
${prefixName} :insert_createdDate_value
<#assign prefixName = ','>
</#if>
<#if (insert_dataStateCode??) && (insert_dataStateCode_value??)>
${prefixName} :insert_dataStateCode_value
<#assign prefixName = ','>
</#if>
<#if (insert_departmentCode??) && (insert_departmentCode_value??)>
${prefixName} :insert_departmentCode_value
<#assign prefixName = ','>
</#if>
<#if (insert_endDate??) && (insert_endDate_value??)>
${prefixName} :insert_endDate_value
<#assign prefixName = ','>
</#if>
<#if (insert_flagCode??) && (insert_flagCode_value??)>
${prefixName} :insert_flagCode_value
<#assign prefixName = ','>
</#if>
<#if (insert_flagObjectCode??) && (insert_flagObjectCode_value??)>
${prefixName} :insert_flagObjectCode_value
<#assign prefixName = ','>
</#if>
<#if (insert_jsonData??) && (insert_jsonData_value??)>
${prefixName} :insert_jsonData_value
<#assign prefixName = ','>
</#if>
<#if (insert_lastModifiedByCode??) && (insert_lastModifiedByCode_value??)>
${prefixName} :insert_lastModifiedByCode_value
<#assign prefixName = ','>
</#if>
<#if (insert_lastModifiedDate??) && (insert_lastModifiedDate_value??)>
${prefixName} :insert_lastModifiedDate_value
<#assign prefixName = ','>
</#if>
<#if (insert_message??) && (insert_message_value??)>
${prefixName} :insert_message_value
<#assign prefixName = ','>
</#if>
<#if (insert_objectCode??) && (insert_objectCode_value??)>
${prefixName} :insert_objectCode_value
<#assign prefixName = ','>
</#if>
<#if (insert_objectId??) && (insert_objectId_value??)>
${prefixName} :insert_objectId_value
<#assign prefixName = ','>
</#if>
<#if (insert_objectTypeCode??) && (insert_objectTypeCode_value??)>
${prefixName} :insert_objectTypeCode_value
<#assign prefixName = ','>
</#if>
<#if (insert_operateLogId??) && (insert_operateLogId_value??)>
${prefixName} :insert_operateLogId_value
<#assign prefixName = ','>
</#if>
<#if (insert_orderBy??) && (insert_orderBy_value??)>
${prefixName} :insert_orderBy_value
<#assign prefixName = ','>
</#if>
<#if (insert_orgCode??) && (insert_orgCode_value??)>
${prefixName} :insert_orgCode_value
<#assign prefixName = ','>
</#if>
<#if (insert_personalCode??) && (insert_personalCode_value??)>
${prefixName} :insert_personalCode_value
<#assign prefixName = ','>
</#if>
<#if (insert_siteCode??) && (insert_siteCode_value??)>
${prefixName} :insert_siteCode_value
<#assign prefixName = ','>
</#if>
<#if (insert_stateCode??) && (insert_stateCode_value??)>
${prefixName} :insert_stateCode_value
<#assign prefixName = ','>
</#if>
<#if (insert_systemInfoCode??) && (insert_systemInfoCode_value??)>
${prefixName} :insert_systemInfoCode_value
<#assign prefixName = ','>
</#if>
<#if (insert_typeCode??) && (insert_typeCode_value??)>
${prefixName} :insert_typeCode_value
<#assign prefixName = ','>
</#if>
<#if (insert_version??) && (insert_version_value??)>
${prefixName} :insert_version_value
<#assign prefixName = ','>
</#if>
)