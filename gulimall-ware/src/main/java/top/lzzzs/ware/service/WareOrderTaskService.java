package top.lzzzs.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import top.lzzzs.common.utils.PageUtils;
import top.lzzzs.ware.entity.WareOrderTaskEntity;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author lzs
 * @email 1250564179@gmail.com
 * @date 2022-08-14 15:54:38
 */
public interface WareOrderTaskService extends IService<WareOrderTaskEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

