<#assign prefixName = 'WHERE'>
<#if (prefixName!) != 'WHERE'>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_createdByCode??)>
<#if (where_and_eq_createdByCode_value??)>
${prefixName} `CREATED_BY_CODE` = :where_and_eq_createdByCode_value
<#else>
${prefixName} `CREATED_BY_CODE` IS NULL
</#if>
<#assign prefixName = ''>
</#if>
<#if (where_and_nq_createdByCode??)>
<#if (prefixName!) != 'WHERE'>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_nq_createdByCode_value??)>
${prefixName} `CREATED_BY_CODE` <> :where_and_nq_createdByCode_value
<#else>
${prefixName} `CREATED_BY_CODE` IS NOT NULL
</#if>
<#assign prefixName = ''>
</#if>
<#if (where_and_like_createdByCode??)>
<#if (prefixName!) != 'WHERE'>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_like_createdByCode_value??)>
${prefixName} `CREATED_BY_CODE` <> :where_and_like_createdByCode_value
</#if>
<#assign prefixName = ''>
</#if>
<#if (where_or_eq_createdByCode??)>
<#if (prefixName!) != 'WHERE'>
<#assign prefixName = 'OR'>
</#if>
<#if (where_or_eq_createdByCode_value??)>
${prefixName} `CREATED_BY_CODE` = :where_or_eq_createdByCode_value
<#else>
${prefixName} `CREATED_BY_CODE` IS NULL
</#if>
<#assign prefixName = ''>
</#if>
<#if (where_or_nq_createdByCode??)>
<#if (prefixName!) != 'WHERE'>
<#assign prefixName = 'OR'>
</#if>
<#if (where_or_nq_createdByCode_value??)>
${prefixName} `CREATED_BY_CODE` <> :where_or_nq_createdByCode_value
<#else>
${prefixName} `CREATED_BY_CODE` IS NOT NULL
</#if>
<#assign prefixName = ''>
</#if>
<#if (where_or_like_createdByCode??)>
<#if (prefixName!) != 'WHERE'>
<#assign prefixName = 'OR'>
</#if>
<#if (where_or_like_createdByCode_value??)>
${prefixName} `CREATED_BY_CODE` like :where_or_like_createdByCode_value
</#if>
<#assign prefixName = ''>
</#if>
<#if (prefixName!) != 'WHERE'>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_createdDate??)>
<#if (where_and_eq_createdDate_value??)>
${prefixName} `CREATED_DATE` = :where_and_eq_createdDate_value
<#else>
${prefixName} `CREATED_DATE` IS NULL
</#if>
<#assign prefixName = ''>
</#if>
<#if (where_and_nq_createdDate??)>
<#if (prefixName!) != 'WHERE'>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_nq_createdDate_value??)>
${prefixName} `CREATED_DATE` <> :where_and_nq_createdDate_value
<#else>
${prefixName} `CREATED_DATE` IS NOT NULL
</#if>
<#assign prefixName = ''>
</#if>
<#if (where_and_like_createdDate??)>
<#if (prefixName!) != 'WHERE'>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_like_createdDate_value??)>
${prefixName} `CREATED_DATE` <> :where_and_like_createdDate_value
</#if>
<#assign prefixName = ''>
</#if>
<#if (where_or_eq_createdDate??)>
<#if (prefixName!) != 'WHERE'>
<#assign prefixName = 'OR'>
</#if>
<#if (where_or_eq_createdDate_value??)>
${prefixName} `CREATED_DATE` = :where_or_eq_createdDate_value
<#else>
${prefixName} `CREATED_DATE` IS NULL
</#if>
<#assign prefixName = ''>
</#if>
<#if (where_or_nq_createdDate??)>
<#if (prefixName!) != 'WHERE'>
<#assign prefixName = 'OR'>
</#if>
<#if (where_or_nq_createdDate_value??)>
${prefixName} `CREATED_DATE` <> :where_or_nq_createdDate_value
<#else>
${prefixName} `CREATED_DATE` IS NOT NULL
</#if>
<#assign prefixName = ''>
</#if>
<#if (where_or_like_createdDate??)>
<#if (prefixName!) != 'WHERE'>
<#assign prefixName = 'OR'>
</#if>
<#if (where_or_like_createdDate_value??)>
${prefixName} `CREATED_DATE` like :where_or_like_createdDate_value
</#if>
<#assign prefixName = ''>
</#if>
<#if (prefixName!) != 'WHERE'>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_departmentCode??)>
<#if (where_and_eq_departmentCode_value??)>
${prefixName} `DEPARTMENT_CODE` = :where_and_eq_departmentCode_value
<#else>
${prefixName} `DEPARTMENT_CODE` IS NULL
</#if>
<#assign prefixName = ''>
</#if>
<#if (where_and_nq_departmentCode??)>
<#if (prefixName!) != 'WHERE'>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_nq_departmentCode_value??)>
${prefixName} `DEPARTMENT_CODE` <> :where_and_nq_departmentCode_value
<#else>
${prefixName} `DEPARTMENT_CODE` IS NOT NULL
</#if>
<#assign prefixName = ''>
</#if>
<#if (where_and_like_departmentCode??)>
<#if (prefixName!) != 'WHERE'>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_like_departmentCode_value??)>
${prefixName} `DEPARTMENT_CODE` <> :where_and_like_departmentCode_value
</#if>
<#assign prefixName = ''>
</#if>
<#if (where_or_eq_departmentCode??)>
<#if (prefixName!) != 'WHERE'>
<#assign prefixName = 'OR'>
</#if>
<#if (where_or_eq_departmentCode_value??)>
${prefixName} `DEPARTMENT_CODE` = :where_or_eq_departmentCode_value
<#else>
${prefixName} `DEPARTMENT_CODE` IS NULL
</#if>
<#assign prefixName = ''>
</#if>
<#if (where_or_nq_departmentCode??)>
<#if (prefixName!) != 'WHERE'>
<#assign prefixName = 'OR'>
</#if>
<#if (where_or_nq_departmentCode_value??)>
${prefixName} `DEPARTMENT_CODE` <> :where_or_nq_departmentCode_value
<#else>
${prefixName} `DEPARTMENT_CODE` IS NOT NULL
</#if>
<#assign prefixName = ''>
</#if>
<#if (where_or_like_departmentCode??)>
<#if (prefixName!) != 'WHERE'>
<#assign prefixName = 'OR'>
</#if>
<#if (where_or_like_departmentCode_value??)>
${prefixName} `DEPARTMENT_CODE` like :where_or_like_departmentCode_value
</#if>
<#assign prefixName = ''>
</#if>
<#if (prefixName!) != 'WHERE'>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_message??)>
<#if (where_and_eq_message_value??)>
${prefixName} `MESSAGE` = :where_and_eq_message_value
<#else>
${prefixName} `MESSAGE` IS NULL
</#if>
<#assign prefixName = ''>
</#if>
<#if (where_and_nq_message??)>
<#if (prefixName!) != 'WHERE'>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_nq_message_value??)>
${prefixName} `MESSAGE` <> :where_and_nq_message_value
<#else>
${prefixName} `MESSAGE` IS NOT NULL
</#if>
<#assign prefixName = ''>
</#if>
<#if (where_and_like_message??)>
<#if (prefixName!) != 'WHERE'>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_like_message_value??)>
${prefixName} `MESSAGE` <> :where_and_like_message_value
</#if>
<#assign prefixName = ''>
</#if>
<#if (where_or_eq_message??)>
<#if (prefixName!) != 'WHERE'>
<#assign prefixName = 'OR'>
</#if>
<#if (where_or_eq_message_value??)>
${prefixName} `MESSAGE` = :where_or_eq_message_value
<#else>
${prefixName} `MESSAGE` IS NULL
</#if>
<#assign prefixName = ''>
</#if>
<#if (where_or_nq_message??)>
<#if (prefixName!) != 'WHERE'>
<#assign prefixName = 'OR'>
</#if>
<#if (where_or_nq_message_value??)>
${prefixName} `MESSAGE` <> :where_or_nq_message_value
<#else>
${prefixName} `MESSAGE` IS NOT NULL
</#if>
<#assign prefixName = ''>
</#if>
<#if (where_or_like_message??)>
<#if (prefixName!) != 'WHERE'>
<#assign prefixName = 'OR'>
</#if>
<#if (where_or_like_message_value??)>
${prefixName} `MESSAGE` like :where_or_like_message_value
</#if>
<#assign prefixName = ''>
</#if>
<#if (prefixName!) != 'WHERE'>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_operateLogCode??)>
<#if (where_and_eq_operateLogCode_value??)>
${prefixName} `OPERATE_LOG_CODE` = :where_and_eq_operateLogCode_value
<#else>
${prefixName} `OPERATE_LOG_CODE` IS NULL
</#if>
<#assign prefixName = ''>
</#if>
<#if (where_and_nq_operateLogCode??)>
<#if (prefixName!) != 'WHERE'>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_nq_operateLogCode_value??)>
${prefixName} `OPERATE_LOG_CODE` <> :where_and_nq_operateLogCode_value
<#else>
${prefixName} `OPERATE_LOG_CODE` IS NOT NULL
</#if>
<#assign prefixName = ''>
</#if>
<#if (where_and_like_operateLogCode??)>
<#if (prefixName!) != 'WHERE'>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_like_operateLogCode_value??)>
${prefixName} `OPERATE_LOG_CODE` <> :where_and_like_operateLogCode_value
</#if>
<#assign prefixName = ''>
</#if>
<#if (where_or_eq_operateLogCode??)>
<#if (prefixName!) != 'WHERE'>
<#assign prefixName = 'OR'>
</#if>
<#if (where_or_eq_operateLogCode_value??)>
${prefixName} `OPERATE_LOG_CODE` = :where_or_eq_operateLogCode_value
<#else>
${prefixName} `OPERATE_LOG_CODE` IS NULL
</#if>
<#assign prefixName = ''>
</#if>
<#if (where_or_nq_operateLogCode??)>
<#if (prefixName!) != 'WHERE'>
<#assign prefixName = 'OR'>
</#if>
<#if (where_or_nq_operateLogCode_value??)>
${prefixName} `OPERATE_LOG_CODE` <> :where_or_nq_operateLogCode_value
<#else>
${prefixName} `OPERATE_LOG_CODE` IS NOT NULL
</#if>
<#assign prefixName = ''>
</#if>
<#if (where_or_like_operateLogCode??)>
<#if (prefixName!) != 'WHERE'>
<#assign prefixName = 'OR'>
</#if>
<#if (where_or_like_operateLogCode_value??)>
${prefixName} `OPERATE_LOG_CODE` like :where_or_like_operateLogCode_value
</#if>
<#assign prefixName = ''>
</#if>
<#if (prefixName!) != 'WHERE'>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_operateLogId??)>
<#if (where_and_eq_operateLogId_value??)>
${prefixName} `OPERATE_LOG_ID` = :where_and_eq_operateLogId_value
<#else>
${prefixName} `OPERATE_LOG_ID` IS NULL
</#if>
<#assign prefixName = ''>
</#if>
<#if (where_and_nq_operateLogId??)>
<#if (prefixName!) != 'WHERE'>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_nq_operateLogId_value??)>
${prefixName} `OPERATE_LOG_ID` <> :where_and_nq_operateLogId_value
<#else>
${prefixName} `OPERATE_LOG_ID` IS NOT NULL
</#if>
<#assign prefixName = ''>
</#if>
<#if (where_and_like_operateLogId??)>
<#if (prefixName!) != 'WHERE'>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_like_operateLogId_value??)>
${prefixName} `OPERATE_LOG_ID` <> :where_and_like_operateLogId_value
</#if>
<#assign prefixName = ''>
</#if>
<#if (where_or_eq_operateLogId??)>
<#if (prefixName!) != 'WHERE'>
<#assign prefixName = 'OR'>
</#if>
<#if (where_or_eq_operateLogId_value??)>
${prefixName} `OPERATE_LOG_ID` = :where_or_eq_operateLogId_value
<#else>
${prefixName} `OPERATE_LOG_ID` IS NULL
</#if>
<#assign prefixName = ''>
</#if>
<#if (where_or_nq_operateLogId??)>
<#if (prefixName!) != 'WHERE'>
<#assign prefixName = 'OR'>
</#if>
<#if (where_or_nq_operateLogId_value??)>
${prefixName} `OPERATE_LOG_ID` <> :where_or_nq_operateLogId_value
<#else>
${prefixName} `OPERATE_LOG_ID` IS NOT NULL
</#if>
<#assign prefixName = ''>
</#if>
<#if (where_or_like_operateLogId??)>
<#if (prefixName!) != 'WHERE'>
<#assign prefixName = 'OR'>
</#if>
<#if (where_or_like_operateLogId_value??)>
${prefixName} `OPERATE_LOG_ID` like :where_or_like_operateLogId_value
</#if>
<#assign prefixName = ''>
</#if>
<#if (prefixName!) != 'WHERE'>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_orgCode??)>
<#if (where_and_eq_orgCode_value??)>
${prefixName} `ORG_CODE` = :where_and_eq_orgCode_value
<#else>
${prefixName} `ORG_CODE` IS NULL
</#if>
<#assign prefixName = ''>
</#if>
<#if (where_and_nq_orgCode??)>
<#if (prefixName!) != 'WHERE'>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_nq_orgCode_value??)>
${prefixName} `ORG_CODE` <> :where_and_nq_orgCode_value
<#else>
${prefixName} `ORG_CODE` IS NOT NULL
</#if>
<#assign prefixName = ''>
</#if>
<#if (where_and_like_orgCode??)>
<#if (prefixName!) != 'WHERE'>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_like_orgCode_value??)>
${prefixName} `ORG_CODE` <> :where_and_like_orgCode_value
</#if>
<#assign prefixName = ''>
</#if>
<#if (where_or_eq_orgCode??)>
<#if (prefixName!) != 'WHERE'>
<#assign prefixName = 'OR'>
</#if>
<#if (where_or_eq_orgCode_value??)>
${prefixName} `ORG_CODE` = :where_or_eq_orgCode_value
<#else>
${prefixName} `ORG_CODE` IS NULL
</#if>
<#assign prefixName = ''>
</#if>
<#if (where_or_nq_orgCode??)>
<#if (prefixName!) != 'WHERE'>
<#assign prefixName = 'OR'>
</#if>
<#if (where_or_nq_orgCode_value??)>
${prefixName} `ORG_CODE` <> :where_or_nq_orgCode_value
<#else>
${prefixName} `ORG_CODE` IS NOT NULL
</#if>
<#assign prefixName = ''>
</#if>
<#if (where_or_like_orgCode??)>
<#if (prefixName!) != 'WHERE'>
<#assign prefixName = 'OR'>
</#if>
<#if (where_or_like_orgCode_value??)>
${prefixName} `ORG_CODE` like :where_or_like_orgCode_value
</#if>
<#assign prefixName = ''>
</#if>
<#if (prefixName!) != 'WHERE'>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_siteCode??)>
<#if (where_and_eq_siteCode_value??)>
${prefixName} `SITE_CODE` = :where_and_eq_siteCode_value
<#else>
${prefixName} `SITE_CODE` IS NULL
</#if>
<#assign prefixName = ''>
</#if>
<#if (where_and_nq_siteCode??)>
<#if (prefixName!) != 'WHERE'>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_nq_siteCode_value??)>
${prefixName} `SITE_CODE` <> :where_and_nq_siteCode_value
<#else>
${prefixName} `SITE_CODE` IS NOT NULL
</#if>
<#assign prefixName = ''>
</#if>
<#if (where_and_like_siteCode??)>
<#if (prefixName!) != 'WHERE'>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_like_siteCode_value??)>
${prefixName} `SITE_CODE` <> :where_and_like_siteCode_value
</#if>
<#assign prefixName = ''>
</#if>
<#if (where_or_eq_siteCode??)>
<#if (prefixName!) != 'WHERE'>
<#assign prefixName = 'OR'>
</#if>
<#if (where_or_eq_siteCode_value??)>
${prefixName} `SITE_CODE` = :where_or_eq_siteCode_value
<#else>
${prefixName} `SITE_CODE` IS NULL
</#if>
<#assign prefixName = ''>
</#if>
<#if (where_or_nq_siteCode??)>
<#if (prefixName!) != 'WHERE'>
<#assign prefixName = 'OR'>
</#if>
<#if (where_or_nq_siteCode_value??)>
${prefixName} `SITE_CODE` <> :where_or_nq_siteCode_value
<#else>
${prefixName} `SITE_CODE` IS NOT NULL
</#if>
<#assign prefixName = ''>
</#if>
<#if (where_or_like_siteCode??)>
<#if (prefixName!) != 'WHERE'>
<#assign prefixName = 'OR'>
</#if>
<#if (where_or_like_siteCode_value??)>
${prefixName} `SITE_CODE` like :where_or_like_siteCode_value
</#if>
<#assign prefixName = ''>
</#if>
<#if (prefixName!) != 'WHERE'>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_systemInfoCode??)>
<#if (where_and_eq_systemInfoCode_value??)>
${prefixName} `SYSTEM_INFO_CODE` = :where_and_eq_systemInfoCode_value
<#else>
${prefixName} `SYSTEM_INFO_CODE` IS NULL
</#if>
<#assign prefixName = ''>
</#if>
<#if (where_and_nq_systemInfoCode??)>
<#if (prefixName!) != 'WHERE'>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_nq_systemInfoCode_value??)>
${prefixName} `SYSTEM_INFO_CODE` <> :where_and_nq_systemInfoCode_value
<#else>
${prefixName} `SYSTEM_INFO_CODE` IS NOT NULL
</#if>
<#assign prefixName = ''>
</#if>
<#if (where_and_like_systemInfoCode??)>
<#if (prefixName!) != 'WHERE'>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_like_systemInfoCode_value??)>
${prefixName} `SYSTEM_INFO_CODE` <> :where_and_like_systemInfoCode_value
</#if>
<#assign prefixName = ''>
</#if>
<#if (where_or_eq_systemInfoCode??)>
<#if (prefixName!) != 'WHERE'>
<#assign prefixName = 'OR'>
</#if>
<#if (where_or_eq_systemInfoCode_value??)>
${prefixName} `SYSTEM_INFO_CODE` = :where_or_eq_systemInfoCode_value
<#else>
${prefixName} `SYSTEM_INFO_CODE` IS NULL
</#if>
<#assign prefixName = ''>
</#if>
<#if (where_or_nq_systemInfoCode??)>
<#if (prefixName!) != 'WHERE'>
<#assign prefixName = 'OR'>
</#if>
<#if (where_or_nq_systemInfoCode_value??)>
${prefixName} `SYSTEM_INFO_CODE` <> :where_or_nq_systemInfoCode_value
<#else>
${prefixName} `SYSTEM_INFO_CODE` IS NOT NULL
</#if>
<#assign prefixName = ''>
</#if>
<#if (where_or_like_systemInfoCode??)>
<#if (prefixName!) != 'WHERE'>
<#assign prefixName = 'OR'>
</#if>
<#if (where_or_like_systemInfoCode_value??)>
${prefixName} `SYSTEM_INFO_CODE` like :where_or_like_systemInfoCode_value
</#if>
<#assign prefixName = ''>
</#if>
<#if (prefixName!) != 'WHERE'>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_typeCode??)>
<#if (where_and_eq_typeCode_value??)>
${prefixName} `TYPE_CODE` = :where_and_eq_typeCode_value
<#else>
${prefixName} `TYPE_CODE` IS NULL
</#if>
<#assign prefixName = ''>
</#if>
<#if (where_and_nq_typeCode??)>
<#if (prefixName!) != 'WHERE'>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_nq_typeCode_value??)>
${prefixName} `TYPE_CODE` <> :where_and_nq_typeCode_value
<#else>
${prefixName} `TYPE_CODE` IS NOT NULL
</#if>
<#assign prefixName = ''>
</#if>
<#if (where_and_like_typeCode??)>
<#if (prefixName!) != 'WHERE'>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_like_typeCode_value??)>
${prefixName} `TYPE_CODE` <> :where_and_like_typeCode_value
</#if>
<#assign prefixName = ''>
</#if>
<#if (where_or_eq_typeCode??)>
<#if (prefixName!) != 'WHERE'>
<#assign prefixName = 'OR'>
</#if>
<#if (where_or_eq_typeCode_value??)>
${prefixName} `TYPE_CODE` = :where_or_eq_typeCode_value
<#else>
${prefixName} `TYPE_CODE` IS NULL
</#if>
<#assign prefixName = ''>
</#if>
<#if (where_or_nq_typeCode??)>
<#if (prefixName!) != 'WHERE'>
<#assign prefixName = 'OR'>
</#if>
<#if (where_or_nq_typeCode_value??)>
${prefixName} `TYPE_CODE` <> :where_or_nq_typeCode_value
<#else>
${prefixName} `TYPE_CODE` IS NOT NULL
</#if>
<#assign prefixName = ''>
</#if>
<#if (where_or_like_typeCode??)>
<#if (prefixName!) != 'WHERE'>
<#assign prefixName = 'OR'>
</#if>
<#if (where_or_like_typeCode_value??)>
${prefixName} `TYPE_CODE` like :where_or_like_typeCode_value
</#if>
<#assign prefixName = ''>
</#if>
