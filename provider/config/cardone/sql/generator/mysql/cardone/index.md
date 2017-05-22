
### 日志(log)

#### ER 图

![日志](log.png)

#### 表结构

##### 操作日志（c1_operate_log）

字段名|可为空|类型及范围|说明
---|---|---|---
BEGIN_DATE|YES|Date(19)|开始时间
CREATED_BY_CODE|YES|String(255)|创建人代码
CREATED_DATE|YES|Date(19)|创建时间
DATA_STATE_CODE|YES|String(255)|数据状态代码(数据字典)
DEPARTMENT_CODE|YES|String(255)|部门代码
END_DATE|YES|Date(19)|结束时间
FLAG_CODE|YES|String(255)|标记代码(数据字典：工作流、同步、生成、录入、审批)
FLAG_OBJECT_CODE|YES|String(255)|标识对象代码(工作流：工作流标识、同步：批次号、生成：操作者编号、录入：操作者编号、审批：操作者编号)
JSON_DATA|YES|String()|JSON数据
LAST_MODIFIED_BY_CODE|YES|String(255)|最后修改人代码
LAST_MODIFIED_DATE|YES|Date(19)|最后修改时间
MESSAGE|YES|String(1023)|消息
OBJECT_CODE|YES|String(255)|对象代码
OBJECT_ID|YES|String(255)|对象标识
OBJECT_TYPE_CODE|YES|String(255)|对象类别代码(数据字典)
OPERATE_LOG_ID|NO|String(255)|操作日志标识
ORDER_BY_|YES|Long(19)|排序
ORG_CODE|YES|String(255)|组织代码
SITE_CODE|YES|String(255)|站点代码
STATE_CODE|YES|String(255)|状态代码(数据字典)
SYSTEM_INFO_CODE|YES|String(255)|系统信息代码
TYPE_CODE|NO|String(255)|类别代码(数据字典)
VERSION_|YES|Integer(10)|版本
