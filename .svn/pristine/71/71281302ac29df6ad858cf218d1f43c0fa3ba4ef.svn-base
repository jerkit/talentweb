package net.togogo.talent.mapper;

import java.util.List;
import net.togogo.talent.domain.TbRecruit;
import net.togogo.talent.domain.TbRecruitExample;
import org.apache.ibatis.annotations.Param;

public interface TbRecruitMapper {
    int countByExample(TbRecruitExample example);

    int deleteByExample(TbRecruitExample example);

    int deleteByPrimaryKey(Integer recrId);

    int insert(TbRecruit record);

    int insertSelective(TbRecruit record);

    List<TbRecruit> selectByExample(TbRecruitExample example);

    TbRecruit selectByPrimaryKey(Integer recrId);

    int updateByExampleSelective(@Param("record") TbRecruit record, @Param("example") TbRecruitExample example);

    int updateByExample(@Param("record") TbRecruit record, @Param("example") TbRecruitExample example);

    int updateByPrimaryKeySelective(TbRecruit record);

    int updateByPrimaryKey(TbRecruit record);
}