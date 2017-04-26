DELETE FROM c1_operate_log WHERE
operate_log_id = ANY(string_to_array(:operateLogIds, ','))