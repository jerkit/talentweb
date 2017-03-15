package net.togogo.talent.service.impl;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import net.togogo.talent.domain.TbResume;
import net.togogo.talent.domain.TbResumeExample;
import net.togogo.talent.mapper.TbResumeMapper;
import net.togogo.talent.service.ITbResumeService;
@Service("tbResumeService")
public class TbResumeServiceImpl implements ITbResumeService{
	@Resource
	private TbResumeMapper tbResumeMapper;
	
	@Override
	public int deleteByPrimaryKey(Integer resuId) {
		// TODO Auto-generated method stub
		return tbResumeMapper.deleteByPrimaryKey(resuId);
	}

	@Override
	public int insert(TbResume record) {
		// TODO Auto-generated method stub
		return tbResumeMapper.insert(record);
	}

	@Override
	public TbResume selectByPrimaryKey(Integer resuId) {
		// TODO Auto-generated method stub
		return tbResumeMapper.selectByPrimaryKey(resuId);
	}

	@Override
	public int updateByPrimaryKey(TbResume record) {
		// TODO Auto-generated method stub
		return tbResumeMapper.updateByPrimaryKey(record);
	}

	@Override
	public int insertSelective(TbResume record) {
		// TODO Auto-generated method stub
		return tbResumeMapper.insertSelective(record);
	}

	@Override
	public List<TbResume> selectByExample(TbResumeExample example) {
		// TODO Auto-generated method stub
		return tbResumeMapper.selectByExample(example);
	}

}
