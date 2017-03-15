package net.togogo.talent.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import net.togogo.talent.domain.TbCompany;
import net.togogo.talent.domain.TbCompanyExample;

public interface ITbCompanyService {

	int countByExample(TbCompanyExample example);

    int deleteByExample(TbCompanyExample example);

    int deleteByPrimaryKey(Integer compId);

    int insert(TbCompany record);

    int insertSelective(TbCompany record);

    List<TbCompany> selectByExample(TbCompanyExample example);

    TbCompany selectByPrimaryKey(Integer compId);

    int updateByExampleSelective(@Param("record") TbCompany record, @Param("example") TbCompanyExample example);

    int updateByExample(@Param("record") TbCompany record, @Param("example") TbCompanyExample example);

    int updateByPrimaryKeySelective(TbCompany record);

    int updateByPrimaryKey(TbCompany record);

    //企业登录
	public TbCompany login(String email, String password);
}
