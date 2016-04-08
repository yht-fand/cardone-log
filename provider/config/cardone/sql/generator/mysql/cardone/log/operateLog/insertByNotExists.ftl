INSERT
INTO
c1_operate_log
(<#assign prefixName = ' '>
<#if (insert_createdByCode??) && (insert_createdByCode_value??)>
${prefixName} `CREATED_BY_CODE`
<#assign prefixName = ','>
</#if>
<#if (insert_createdDate??) && (insert_createdDate_value??)>
${prefixName} `CREATED_DATE`
<#assign prefixName = ','>
</#if>
<#if (insert_departmentCode??) && (insert_departmentCode_value??)>
${prefixName} `DEPARTMENT_CODE`
<#assign prefixName = ','>
</#if>
<#if (insert_message??) && (insert_message_value??)>
${prefixName} `MESSAGE`
<#assign prefixName = ','>
</#if>
<#if (insert_operateLogCode??) && (insert_operateLogCode_value??)>
${prefixName} `OPERATE_LOG_CODE`
<#assign prefixName = ','>
</#if>
<#if (insert_operateLogId??) && (insert_operateLogId_value??)>
${prefixName} `OPERATE_LOG_ID`
<#assign prefixName = ','>
</#if>
<#if (insert_orgCode??) && (insert_orgCode_value??)>
${prefixName} `ORG_CODE`
<#assign prefixName = ','>
</#if>
<#if (insert_siteCode??) && (insert_siteCode_value??)>
${prefixName} `SITE_CODE`
<#assign prefixName = ','>
</#if>
<#if (insert_systemInfoCode??) && (insert_systemInfoCode_value??)>
${prefixName} `SYSTEM_INFO_CODE`
<#assign prefixName = ','>
</#if>
<#if (insert_typeCode??) && (insert_typeCode_value??)>
${prefixName} `TYPE_CODE`
<#assign prefixName = ','>
</#if>
)
(SELECT
<#assign prefixName = ' '>
<#if (insert_createdByCode??) && (insert_createdByCode_value??)>
${prefixName} :insert_createdByCode_value
<#assign prefixName = ','>
</#if>
<#if (insert_createdDate??) && (insert_createdDate_value??)>
${prefixName} :insert_createdDate_value
<#assign prefixName = ','>
</#if>
<#if (insert_departmentCode??) && (insert_departmentCode_value??)>
${prefixName} :insert_departmentCode_value
<#assign prefixName = ','>
</#if>
<#if (insert_message??) && (insert_message_value??)>
${prefixName} :insert_message_value
<#assign prefixName = ','>
</#if>
<#if (insert_operateLogCode??) && (insert_operateLogCode_value??)>
${prefixName} :insert_operateLogCode_value
<#assign prefixName = ','>
</#if>
<#if (insert_operateLogId??) && (insert_operateLogId_value??)>
${prefixName} :insert_operateLogId_value
<#assign prefixName = ','>
</#if>
<#if (insert_orgCode??) && (insert_orgCode_value??)>
${prefixName} :insert_orgCode_value
<#assign prefixName = ','>
</#if>
<#if (insert_siteCode??) && (insert_siteCode_value??)>
${prefixName} :insert_siteCode_value
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
FROM DUAL WHERE NOT EXISTS (SELECT 1 FROM c1_operate_log E
<#assign prefixName = 'WHERE'>
<#if (where_and_eq_createdByCode??)>
<#if (where_and_eq_createdByCode_value??)>
${prefixName} E.CREATED_BY_CODE = :where_and_eq_createdByCode_value
<#else>
${prefixName} E.CREATED_BY_CODE IS NULL
</#if>
<#assign prefixName = ''>
</#if>
<#if (prefixName!) != 'WHERE'>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_createdDate??)>
<#if (where_and_eq_createdDate_value??)>
${prefixName} E.CREATED_DATE = :where_and_eq_createdDate_value
<#else>
${prefixName} E.CREATED_DATE IS NULL
</#if>
<#assign prefixName = ''>
</#if>
<#if (prefixName!) != 'WHERE'>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_departmentCode??)>
<#if (where_and_eq_departmentCode_value??)>
${prefixName} E.DEPARTMENT_CODE = :where_and_eq_departmentCode_value
<#else>
${prefixName} E.DEPARTMENT_CODE IS NULL
</#if>
<#assign prefixName = ''>
</#if>
<#if (prefixName!) != 'WHERE'>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_message??)>
<#if (where_and_eq_message_value??)>
${prefixName} E.MESSAGE = :where_and_eq_message_value
<#else>
${prefixName} E.MESSAGE IS NULL
</#if>
<#assign prefixName = ''>
</#if>
<#if (prefixName!) != 'WHERE'>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_operateLogCode??)>
<#if (where_and_eq_operateLogCode_value??)>
${prefixName} E.OPERATE_LOG_CODE = :where_and_eq_operateLogCode_value
<#else>
${prefixName} E.OPERATE_LOG_CODE IS NULL
</#if>
<#assign prefixName = ''>
</#if>
<#if (prefixName!) != 'WHERE'>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_operateLogId??)>
<#if (where_and_eq_operateLogId_value??)>
${prefixName} E.OPERATE_LOG_ID = :where_and_eq_operateLogId_value
<#else>
${prefixName} E.OPERATE_LOG_ID IS NULL
</#if>
<#assign prefixName = ''>
</#if>
<#if (prefixName!) != 'WHERE'>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_orgCode??)>
<#if (where_and_eq_orgCode_value??)>
${prefixName} E.ORG_CODE = :where_and_eq_orgCode_value
<#else>
${prefixName} E.ORG_CODE IS NULL
</#if>
<#assign prefixName = ''>
</#if>
<#if (prefixName!) != 'WHERE'>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_siteCode??)>
<#if (where_and_eq_siteCode_value??)>
${prefixName} E.SITE_CODE = :where_and_eq_siteCode_value
<#else>
${prefixName} E.SITE_CODE IS NULL
</#if>
<#assign prefixName = ''>
</#if>
<#if (prefixName!) != 'WHERE'>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_systemInfoCode??)>
<#if (where_and_eq_systemInfoCode_value??)>
${prefixName} E.SYSTEM_INFO_CODE = :where_and_eq_systemInfoCode_value
<#else>
${prefixName} E.SYSTEM_INFO_CODE IS NULL
</#if>
<#assign prefixName = ''>
</#if>
<#if (prefixName!) != 'WHERE'>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_typeCode??)>
<#if (where_and_eq_typeCode_value??)>
${prefixName} E.TYPE_CODE = :where_and_eq_typeCode_value
<#else>
${prefixName} E.TYPE_CODE IS NULL
</#if>
<#assign prefixName = ''>
</#if>
))