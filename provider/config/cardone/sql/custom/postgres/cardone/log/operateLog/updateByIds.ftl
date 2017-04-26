UPDATE c1_operate_log SET END_DATE = NOW(), DATA_STATE_CODE = '0' WHERE
operate_log_id = ANY(string_to_array(:operateLogIds, ','))