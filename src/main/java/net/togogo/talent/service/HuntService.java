package net.togogo.talent.service;

import java.util.List;

import net.togogo.talent.domain.TbHunt;
import net.togogo.talent.domain.TbHuntExample;

public interface HuntService {

	int insertSelective(TbHunt record);
	
	int deleteByPrimaryKey(Integer huntId);
	
	int updateByPrimaryKeySelective(TbHunt record);
	
	List<TbHunt> selectByExample(TbHuntExample example);

	List<TbHunt> selectMoreByExample(TbHuntExample example,int pageIndex,int pageSize);
}
