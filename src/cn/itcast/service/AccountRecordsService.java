package cn.itcast.service;

import java.util.List;
import java.util.Map;

import cn.itcast.entity.Account;
import cn.itcast.entity.AccountRecords;
import cn.itcast.entity.Supplier;

public interface AccountRecordsService extends BaseService<AccountRecords> {
	 List<Map<String, Object>> selectSupplier(Map<String, String> paramMap);
}
