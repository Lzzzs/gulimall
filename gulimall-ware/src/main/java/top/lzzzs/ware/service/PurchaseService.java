package top.lzzzs.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import top.lzzzs.common.utils.PageUtils;
import top.lzzzs.ware.entity.PurchaseEntity;

import java.util.Map;

/**
 * 采购信息
 *
 * @author lzs
 * @email 1250564179@gmail.com
 * @date 2022-08-14 15:54:38
 */
public interface PurchaseService extends IService<PurchaseEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

