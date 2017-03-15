package net.togogo.talent.service.impl;

import java.util.List;

import javax.annotation.Resource;

import net.togogo.talent.domain.TbRecruit;
import net.togogo.talent.domain.TbRecruitExample;
import net.togogo.talent.mapper.TbRecruitMapper;
import net.togogo.talent.service.RecruitService;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;

@Service("recruitService")
public class RecruitServiceImpl implements RecruitService {

	@Resource
	private TbRecruitMapper recruitMapper;

	@Override
	public List<TbRecruit> selectByExample(TbRecruitExample example) {
		// TODO Auto-generated method stub
		return recruitMapper.selectByExample(example);
	}

	@Override
	public List<TbRecruit> selectMoreByExample(TbRecruitExample example,int pageIndex,int pageSize) {
		// TODO Auto-generated method stub
		PageHelper.startPage(pageIndex,pageSize);
		return recruitMapper.selectByExample(example);
	}

	@Override
	public int insertSelective(TbRecruit record) {
		// TODO Auto-generated method stub
		return recruitMapper.insertSelective(record);
	}

	@Override
	public int deleteByPrimaryKey(Integer recrId) {
		// TODO Auto-generated method stub
		return recruitMapper.deleteByPrimaryKey(recrId);
	}

	@Override
	public int updateByPrimaryKeySelective(TbRecruit record) {
		// TODO Auto-generated method stub
		return recruitMapper.updateByPrimaryKeySelective(record);
	}
}
