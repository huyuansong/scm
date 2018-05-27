package cn.itcast.dao;

import cn.itcast.entity.AccountRecords;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface AccountRecordsMapper extends BaseMapper<AccountRecords> {
   List<Map<String, Object>> selectSupplier(Map<String, String> paramMap);
}