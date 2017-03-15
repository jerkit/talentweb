package net.togogo.talent.mapper;

import java.util.List;
import net.togogo.talent.domain.TbResume;
import net.togogo.talent.domain.TbResumeExample;
import org.apache.ibatis.annotations.Param;

public interface TbResumeMapper {
    int countByExample(TbResumeExample example);

    int deleteByExample(TbResumeExample example);

    int deleteByPrimaryKey(Integer resuId);

    int insert(TbResume record);

    int insertSelective(TbResume record);

    List<TbResume> selectByExample(TbResumeExample example);

    TbResume selectByPrimaryKey(Integer resuId);

    int updateByExampleSelective(@Param("record") TbResume record, @Param("example") TbResumeExample example);

    int updateByExample(@Param("record") TbResume record, @Param("example") TbResumeExample example);

    int updateByPrimaryKeySelective(TbResume record);

    int updateByPrimaryKey(TbResume record);
}