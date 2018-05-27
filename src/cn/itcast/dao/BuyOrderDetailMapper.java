package cn.itcast.dao;

import cn.itcast.entity.BuyOrderDetail;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BuyOrderDetailMapper extends BaseMapper<BuyOrderDetail> {
    public int insertList(List<BuyOrderDetail> buyOrderDetails);
}