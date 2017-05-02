SELECT d.OPERATELOG_CODE  ,d.NAME FROM c1_operate_log d
<#if cardone.StringUtils.isNotBlank(term)>
WHERE strpos(d.NAME, :term) > 0 OR strpos(d.OPERATELOG_CODE, :term) > 0
</#if>
ORDER BY d.ORDER_BY_, d.OPERATELOG_CODE
LIMIT 20