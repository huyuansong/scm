package cn.itcast.dao;

import cn.itcast.entity.SysParam;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysParamMapper extends BaseMapper<SysParam>{
	
	//查询所有的系统参数表的记录，包括了类型为“1”的记录
	public List<SysParam> selectSysParamList(SysParam sysParam);
	
	//查询其它表的数据
	public List<SysParam> selectOtherTable(String sql);
  
}