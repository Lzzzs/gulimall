package top.lzzzs.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import top.lzzzs.common.utils.PageUtils;
import top.lzzzs.member.entity.MemberCollectSubjectEntity;

import java.util.Map;

/**
 * 会员收藏的专题活动
 *
 * @author lzs
 * @email 1250564179@gmail.com
 * @date 2022-08-14 15:44:09
 */
public interface MemberCollectSubjectService extends IService<MemberCollectSubjectEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

