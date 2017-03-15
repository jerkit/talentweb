package net.togogo.talent.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import net.togogo.talent.domain.TbAdmin;
import net.togogo.talent.domain.TbAdminExample;

public interface ITbAdminService {
	int countByExample(TbAdminExample example);

	int deleteByExample(TbAdminExample example);

	int deleteByPrimaryKey(Integer adminId);

	int insert(TbAdmin record);

	int insertSelective(TbAdmin record);

	List<TbAdmin> selectByExample(TbAdminExample example);

	TbAdmin selectByPrimaryKey(Integer adminId);

	int updateByExampleSelective(@Param("record") TbAdmin record, @Param("example") TbAdminExample example);

	int updateByExample(@Param("record") TbAdmin record, @Param("example") TbAdminExample example);

	int updateByPrimaryKeySelective(TbAdmin record);

	int updateByPrimaryKey(TbAdmin record);
}
