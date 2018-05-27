package cn.itcast.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.itcast.dao.AccountMapper;
import cn.itcast.dao.AccountRecordsMapper;
import cn.itcast.dao.SupplierMapper;
import cn.itcast.entity.Account;
import cn.itcast.entity.AccountRecords;
import cn.itcast.entity.Page;
import cn.itcast.entity.Supplier;
import cn.itcast.service.AccountRecordsService;
import cn.itcast.service.AccountService;
import cn.itcast.service.SupplierService;

@Service("accountRecordsService")
public class AccountRecordsServiceImpl extends BaseServiceImpl<AccountRecords> implements AccountRecordsService {

	@Override
	public List<Map<String, Object>> selectSupplier(Map<String, String> paramMap) {
		// TODO Auto-generated method stub
		return accountRecordsMapper.selectSupplier(paramMap);
	}

}
