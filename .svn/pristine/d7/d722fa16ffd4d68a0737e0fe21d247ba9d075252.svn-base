package net.togogo.talent.service.impl;

import java.util.List;

import javax.annotation.Resource;

import net.togogo.talent.domain.TbKeyword;
import net.togogo.talent.domain.TbKeywordExample;
import net.togogo.talent.mapper.TbKeywordMapper;
import net.togogo.talent.service.KeywordService;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;

@Service("keywordService")
public class KeywordServiceImpl implements KeywordService {

	@Resource
	private TbKeywordMapper keywordMapper;
	
	@Override
	public int insertSelective(TbKeyword record) {
		// TODO Auto-generated method stub
		return keywordMapper.insertSelective(record);
	}

	@Override
	public int deleteByPrimaryKey(Integer keywordId) {
		// TODO Auto-generated method stub
		return keywordMapper.deleteByPrimaryKey(keywordId);
	}

	@Override
	public int updateByPrimaryKeySelective(TbKeyword record) {
		// TODO Auto-generated method stub
		return keywordMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public List<TbKeyword> selectByExample(TbKeywordExample example) {
		// TODO Auto-generated method stub
		return keywordMapper.selectByExample(example);
	}

	@Override
	public List<TbKeyword> selectByExample(TbKeywordExample example,
			int pageIndex, int pageSize) {
		// TODO Auto-generated method stub
		PageHelper.startPage(pageIndex,pageSize);
		return keywordMapper.selectByExample(example);
	}
}
