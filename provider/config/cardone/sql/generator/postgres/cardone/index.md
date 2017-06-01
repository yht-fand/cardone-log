
### 日志(log)

#### ER 图

![日志](log.png)

#### 表结构

##### 操作日志（c1_operate_log）

字段名|可为空|类型及范围|说明
---|---|---|---
batch_no|YES|String(255)|批次编号
begin_date|YES|Date(29)|开始日期
created_by_code|YES|String(255)|创建人代码
created_date|YES|Date(29)|创建日期
data_state_code|YES|String(255)|数据状态代码(数据字典)
department_code|YES|String(255)|部门代码
end_date|YES|Date(29)|结束日期
flag_code|YES|String(255)|标记代码(数据字典：工作流、同步、生成、录入、审批)
flag_object_code|YES|String(255)|标识对象代码(工作流：工作流标识、同步：批次号、生成：操作者编号、录入：操作者编号、审批：操作者编号)
json_data|YES|Object(2147483647)|JSON数据
last_modified_by_code|YES|String(255)|最后修改人代码
last_modified_date|YES|Date(29)|最后修改日期
message|YES|String(1023)|消息
object_code|YES|String(255)|对象代码
object_id|YES|String(255)|对象标识
object_type_code|YES|String(255)|对象类别代码(数据字典)
operate_log_id|NO|String(255)|操作日志标识
order_by_|YES|Long(19)|排序
org_code|YES|String(255)|组织代码
personal_code|YES|String(255)|个人代码
site_code|YES|String(255)|站点代码
state_code|YES|String(255)|状态代码(数据字典)
system_info_code|YES|String(255)|系统信息代码
type_code|NO|String(255)|类别代码(数据字典)
version_|YES|Integer(10)|版本
