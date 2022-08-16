package top.lzzzs.order.dao;

import top.lzzzs.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author lzs
 * @email 1250564179@gmail.com
 * @date 2022-08-14 15:52:29
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
