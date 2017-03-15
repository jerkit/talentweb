package net.togogo.talent.service;

import java.util.List;

import net.togogo.talent.domain.TbKeyword;
import net.togogo.talent.domain.TbKeywordExample;

public interface KeywordService {

	int insertSelective(TbKeyword record);
	
	int deleteByPrimaryKey(Integer keywordId);
	
	int updateByPrimaryKeySelective(TbKeyword record);
	
	List<TbKeyword> selectByExample(TbKeywordExample example);
	
	List<TbKeyword> selectByExample(TbKeywordExample example,int pageIndex,int pageSize);
}
