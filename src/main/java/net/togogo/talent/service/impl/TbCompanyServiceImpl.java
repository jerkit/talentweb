package net.togogo.talent.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import net.togogo.talent.domain.TbCompany;
import net.togogo.talent.domain.TbCompanyExample;
import net.togogo.talent.domain.TbCompanyExample.Criteria;
import net.togogo.talent.mapper.TbCompanyMapper;
import net.togogo.talent.service.ITbCompanyService;

@Service("tbCompanyService")
public class TbCompanyServiceImpl implements ITbCompanyService {
	@Resource
	TbCompanyMapper tbCompanyMapper;

	@Override
	public int countByExample(TbCompanyExample example) {
		return tbCompanyMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(TbCompanyExample example) {
		return tbCompanyMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Integer compId) {
		return tbCompanyMapper.deleteByPrimaryKey(compId);
	}

	@Override
	public int insert(TbCompany record) {
		return tbCompanyMapper.insert(record);
	}

	@Override
	public int insertSelective(TbCompany record) {
		return tbCompanyMapper.insertSelective(record);
	}

	@Override
	public List<TbCompany> selectByExample(TbCompanyExample example) {
		return tbCompanyMapper.selectByExample(example);
	}

	@Override
	public TbCompany selectByPrimaryKey(Integer compId) {
		return tbCompanyMapper.selectByPrimaryKey(compId);
	}

	@Override
	public int updateByExampleSelective(TbCompany record, TbCompanyExample example) {
		return tbCompanyMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(TbCompany record, TbCompanyExample example) {
		return tbCompanyMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(TbCompany record) {
		return tbCompanyMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(TbCompany record) {
		return tbCompanyMapper.updateByPrimaryKey(record);
	}

	// 企业登录
	@Override
	public TbCompany login(String email, String password) {
		TbCompanyExample example = new TbCompanyExample();
		Criteria cr = example.createCriteria();
		cr.andCompEmailEqualTo(email);
		List<TbCompany> companyList = tbCompanyMapper.selectByExample(example);
		if(companyList.size() > 0) {
			TbCompany company = companyList.get(0);
			return company;
		}
		return null;
	}

}
