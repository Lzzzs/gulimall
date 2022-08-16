package top.lzzzs.member.dao;

import top.lzzzs.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author lzs
 * @email 1250564179@gmail.com
 * @date 2022-08-14 15:44:09
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
