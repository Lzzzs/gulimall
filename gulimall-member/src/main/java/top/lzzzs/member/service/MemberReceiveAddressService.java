package top.lzzzs.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import top.lzzzs.common.utils.PageUtils;
import top.lzzzs.member.entity.MemberReceiveAddressEntity;

import java.util.Map;

/**
 * 会员收货地址
 *
 * @author lzs
 * @email 1250564179@gmail.com
 * @date 2022-08-14 15:44:09
 */
public interface MemberReceiveAddressService extends IService<MemberReceiveAddressEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

