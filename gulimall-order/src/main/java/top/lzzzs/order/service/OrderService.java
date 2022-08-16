package top.lzzzs.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import top.lzzzs.common.utils.PageUtils;
import top.lzzzs.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author lzs
 * @email 1250564179@gmail.com
 * @date 2022-08-14 15:52:29
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

