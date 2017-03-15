package net.togogo.talent.service.impl;

import java.util.List;

import javax.annotation.Resource;

import net.togogo.talent.domain.TbHunt;
import net.togogo.talent.domain.TbHuntExample;
import net.togogo.talent.mapper.TbHuntMapper;
import net.togogo.talent.service.HuntService;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;

@Service("huntService")
public class HuntServiceImpl implements HuntService {

	@Resource
	private TbHuntMapper huntMapper;
	
	@Override
	public int insertSelective(TbHunt record) {
		// TODO Auto-generated method stub
		return huntMapper.insertSelective(record);
	}

	@Override
	public int deleteByPrimaryKey(Integer huntId) {
		// TODO Auto-generated method stub
		return huntMapper.deleteByPrimaryKey(huntId);
	}

	@Override
	public int updateByPrimaryKeySelective(TbHunt record) {
		// TODO Auto-generated method stub
		return huntMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public List<TbHunt> selectByExample(TbHuntExample example) {
		// TODO Auto-generated method stub
		return huntMapper.selectByExample(example);
	}

	@Override
	public List<TbHunt> selectMoreByExample(TbHuntExample example,
			int pageIndex, int pageSize) {
		// TODO Auto-generated method stub
		PageHelper.startPage(pageIndex,pageSize);
		return huntMapper.selectByExample(example);
	}
}
