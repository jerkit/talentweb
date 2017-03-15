package net.togogo.talent.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import net.togogo.talent.domain.TbAdmin;
import net.togogo.talent.domain.TbAdminExample;
import net.togogo.talent.domain.TbUser;
import net.togogo.talent.mapper.TbAdminMapper;
import net.togogo.talent.service.ITbAdminService;
@Service("tbAdminService")
public class TbAdminServiceImpl implements ITbAdminService {

	@Resource
	private TbAdminMapper tbAdminMapper;
	
	public TbAdminMapper getTbAdminMapper() {
		return tbAdminMapper;
	}

	public void setTbAdminMapper(TbAdminMapper tbAdminMapper) {
		this.tbAdminMapper = tbAdminMapper;
	}

	@Override
	public int countByExample(TbAdminExample example) {
		return tbAdminMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(TbAdminExample example) {
		return tbAdminMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Integer adminId) {
		return tbAdminMapper.deleteByPrimaryKey(adminId);
	}

	@Override
	public int insert(TbAdmin record) {
		return tbAdminMapper.insert(record);
	}

	@Override
	public int insertSelective(TbAdmin record) {
		return tbAdminMapper.insertSelective(record);
	}

	@Override
	public List<TbAdmin> selectByExample(TbAdminExample example) {
		return tbAdminMapper.selectByExample(example);
	}

	@Override
	public TbAdmin selectByPrimaryKey(Integer adminId) {
		return tbAdminMapper.selectByPrimaryKey(adminId);
	}

	@Override
	public int updateByExampleSelective(TbAdmin record, TbAdminExample example) {
		return tbAdminMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(TbAdmin record, TbAdminExample example) {
		return tbAdminMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(TbAdmin record) {
		return tbAdminMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(TbAdmin record) {
		return tbAdminMapper.updateByPrimaryKey(record);
	}
	
}
