
-- 日志(log)


-- 操作日志（c1_operate_log）

--业务代码
--drop index IF EXISTS idx_c1_operate_log_business_code;
--create UNIQUE index IF NOT EXISTS idx_c1_operate_log_business_code ON c1_operate_log ("code");
--批次编号
--drop index IF EXISTS idx_c1_operate_log_batch_no;
--create index IF NOT EXISTS idx_c1_operate_log_batch_no ON c1_operate_log ("batch_no" varchar_pattern_ops);
--开始日期
--drop index IF EXISTS idx_c1_operate_log_begin_date;
--create index IF NOT EXISTS idx_c1_operate_log_begin_date ON c1_operate_log ("begin_date");
--创建人编号
--drop index IF EXISTS idx_c1_operate_log_created_by_code;
--create index IF NOT EXISTS idx_c1_operate_log_created_by_code ON c1_operate_log ("created_by_code" varchar_pattern_ops);
--创建人标识
--drop index IF EXISTS idx_c1_operate_log_created_by_id;
--create index IF NOT EXISTS idx_c1_operate_log_created_by_id ON c1_operate_log ("created_by_id" varchar_pattern_ops);
--创建日期
--drop index IF EXISTS idx_c1_operate_log_created_date;
--create index IF NOT EXISTS idx_c1_operate_log_created_date ON c1_operate_log ("created_date");
--数据状态编号(数据字典)
--drop index IF EXISTS idx_c1_operate_log_data_state_code;
--create index IF NOT EXISTS idx_c1_operate_log_data_state_code ON c1_operate_log ("data_state_code" varchar_pattern_ops);
--部门编号
--drop index IF EXISTS idx_c1_operate_log_department_code;
--create index IF NOT EXISTS idx_c1_operate_log_department_code ON c1_operate_log ("department_code" varchar_pattern_ops);
--结束日期
--drop index IF EXISTS idx_c1_operate_log_end_date;
--create index IF NOT EXISTS idx_c1_operate_log_end_date ON c1_operate_log ("end_date");
--标记编号(数据字典：工作流、同步、生成、录入、审批)
--drop index IF EXISTS idx_c1_operate_log_flag_code;
--create index IF NOT EXISTS idx_c1_operate_log_flag_code ON c1_operate_log ("flag_code" varchar_pattern_ops);
--最后修改人编号
--drop index IF EXISTS idx_c1_operate_log_last_modified_by_code;
--create index IF NOT EXISTS idx_c1_operate_log_last_modified_by_code ON c1_operate_log ("last_modified_by_code" varchar_pattern_ops);
--最后修改人标识
--drop index IF EXISTS idx_c1_operate_log_last_modified_by_id;
--create index IF NOT EXISTS idx_c1_operate_log_last_modified_by_id ON c1_operate_log ("last_modified_by_id" varchar_pattern_ops);
--最后修改日期
--drop index IF EXISTS idx_c1_operate_log_last_modified_date;
--create index IF NOT EXISTS idx_c1_operate_log_last_modified_date ON c1_operate_log ("last_modified_date");
--对象编号
--drop index IF EXISTS idx_c1_operate_log_object_code;
--create index IF NOT EXISTS idx_c1_operate_log_object_code ON c1_operate_log ("object_code" varchar_pattern_ops);
--对象标识
--drop index IF EXISTS idx_c1_operate_log_object_id;
--create index IF NOT EXISTS idx_c1_operate_log_object_id ON c1_operate_log ("object_id" varchar_pattern_ops);
--对象类别编号(数据字典)
--drop index IF EXISTS idx_c1_operate_log_object_type_code;
--create index IF NOT EXISTS idx_c1_operate_log_object_type_code ON c1_operate_log ("object_type_code" varchar_pattern_ops);
--操作日志标识
--drop index IF EXISTS idx_c1_operate_log_operate_log_id;
--create index IF NOT EXISTS idx_c1_operate_log_operate_log_id ON c1_operate_log ("operate_log_id" varchar_pattern_ops);
--排序
--drop index IF EXISTS idx_c1_operate_log_order_by_;
--create index IF NOT EXISTS idx_c1_operate_log_order_by_ ON c1_operate_log ("order_by_");
--组织编号
--drop index IF EXISTS idx_c1_operate_log_org_code;
--create index IF NOT EXISTS idx_c1_operate_log_org_code ON c1_operate_log ("org_code" varchar_pattern_ops);
--个人编号
--drop index IF EXISTS idx_c1_operate_log_personal_code;
--create index IF NOT EXISTS idx_c1_operate_log_personal_code ON c1_operate_log ("personal_code" varchar_pattern_ops);
--个人标识
--drop index IF EXISTS idx_c1_operate_log_personal_id;
--create index IF NOT EXISTS idx_c1_operate_log_personal_id ON c1_operate_log ("personal_id" varchar_pattern_ops);
--站点编号
--drop index IF EXISTS idx_c1_operate_log_site_code;
--create index IF NOT EXISTS idx_c1_operate_log_site_code ON c1_operate_log ("site_code" varchar_pattern_ops);
--状态编号(数据字典)
--drop index IF EXISTS idx_c1_operate_log_state_code;
--create index IF NOT EXISTS idx_c1_operate_log_state_code ON c1_operate_log ("state_code" varchar_pattern_ops);
--系统信息编号
--drop index IF EXISTS idx_c1_operate_log_system_info_code;
--create index IF NOT EXISTS idx_c1_operate_log_system_info_code ON c1_operate_log ("system_info_code" varchar_pattern_ops);
--类别编号(数据字典)
--drop index IF EXISTS idx_c1_operate_log_type_code;
--create index IF NOT EXISTS idx_c1_operate_log_type_code ON c1_operate_log ("type_code" varchar_pattern_ops);




ALTER TABLE "c1_operate_log" ALTER COLUMN "json_data" TYPE jsonb;

--- sql end ---



