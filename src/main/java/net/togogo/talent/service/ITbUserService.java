package net.togogo.talent.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import net.togogo.talent.domain.TbUser;
import net.togogo.talent.domain.TbUserExample;

public interface ITbUserService {

	int countByExample(TbUserExample example);

	int deleteByExample(TbUserExample example);

	int deleteByPrimaryKey(Integer userId);

	int insert(TbUser record);

	int insertSelective(TbUser record);

	List<TbUser> selectByExample(TbUserExample example);

	TbUser selectByPrimaryKey(Integer userId);

	int updateByExampleSelective(@Param("record") TbUser record, @Param("example") TbUserExample example);

	int updateByExample(@Param("record") TbUser record, @Param("example") TbUserExample example);

	int updateByPrimaryKeySelective(TbUser record);

	int updateByPrimaryKey(TbUser record);

	TbUser login(String userEmail, String userPassword);
}
