package net.togogo.talent.mapper;

import java.util.List;
import net.togogo.talent.domain.TbRecruitResume;
import net.togogo.talent.domain.TbRecruitResumeExample;
import org.apache.ibatis.annotations.Param;

public interface TbRecruitResumeMapper {
    int countByExample(TbRecruitResumeExample example);

    int deleteByExample(TbRecruitResumeExample example);

    int deleteByPrimaryKey(Integer deliverId);

    int insert(TbRecruitResume record);

    int insertSelective(TbRecruitResume record);

    List<TbRecruitResume> selectByExample(TbRecruitResumeExample example);

    TbRecruitResume selectByPrimaryKey(Integer deliverId);

    int updateByExampleSelective(@Param("record") TbRecruitResume record, @Param("example") TbRecruitResumeExample example);

    int updateByExample(@Param("record") TbRecruitResume record, @Param("example") TbRecruitResumeExample example);

    int updateByPrimaryKeySelective(TbRecruitResume record);

    int updateByPrimaryKey(TbRecruitResume record);
}