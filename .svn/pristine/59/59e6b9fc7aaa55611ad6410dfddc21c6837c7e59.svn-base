package net.togogo.talent.mapper;

import java.util.List;
import net.togogo.talent.domain.TbHuntCompany;
import net.togogo.talent.domain.TbHuntCompanyExample;
import org.apache.ibatis.annotations.Param;

public interface TbHuntCompanyMapper {
    int countByExample(TbHuntCompanyExample example);

    int deleteByExample(TbHuntCompanyExample example);

    int deleteByPrimaryKey(Integer wantId);

    int insert(TbHuntCompany record);

    int insertSelective(TbHuntCompany record);

    List<TbHuntCompany> selectByExample(TbHuntCompanyExample example);

    TbHuntCompany selectByPrimaryKey(Integer wantId);

    int updateByExampleSelective(@Param("record") TbHuntCompany record, @Param("example") TbHuntCompanyExample example);

    int updateByExample(@Param("record") TbHuntCompany record, @Param("example") TbHuntCompanyExample example);

    int updateByPrimaryKeySelective(TbHuntCompany record);

    int updateByPrimaryKey(TbHuntCompany record);
}