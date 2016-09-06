
### 日志(log)

#### ER 图

![日志](log.png)

#### 表结构

##### 操作日志（c1_operate_log）

字段名|可为空|类型及范围|说明
---|---|---|---
CREATED_BY_CODE|YES|String(255)|创建人代码
CREATED_DATE|YES|Date(19)|创建时间
DEPARTMENT_CODE|YES|String(255)|部门代码
MESSAGE|YES|String(511)|消息
OPERATE_LOG_ID|NO|String(255)|操作日志标识
ORG_CODE|YES|String(255)|组织代码
SITE_CODE|YES|String(255)|站点代码
SYSTEM_INFO_CODE|YES|String(255)|系统信息代码
TYPE_CODE|NO|String(255)|类别代码
