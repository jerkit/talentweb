package net.togogo.talent.mapper;

import java.util.List;
import net.togogo.talent.domain.TbKeyword;
import net.togogo.talent.domain.TbKeywordExample;
import org.apache.ibatis.annotations.Param;

public interface TbKeywordMapper {
    int countByExample(TbKeywordExample example);

    int deleteByExample(TbKeywordExample example);

    int deleteByPrimaryKey(Integer keywordId);

    int insert(TbKeyword record);

    int insertSelective(TbKeyword record);

    List<TbKeyword> selectByExample(TbKeywordExample example);

    TbKeyword selectByPrimaryKey(Integer keywordId);

    int updateByExampleSelective(@Param("record") TbKeyword record, @Param("example") TbKeywordExample example);

    int updateByExample(@Param("record") TbKeyword record, @Param("example") TbKeywordExample example);

    int updateByPrimaryKeySelective(TbKeyword record);

    int updateByPrimaryKey(TbKeyword record);
}