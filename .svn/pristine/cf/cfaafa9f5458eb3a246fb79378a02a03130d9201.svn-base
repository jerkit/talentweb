package net.togogo.talent.mapper;

import java.util.List;
import net.togogo.talent.domain.TbUserCollectionExample;
import net.togogo.talent.domain.TbUserCollectionKey;
import org.apache.ibatis.annotations.Param;

public interface TbUserCollectionMapper {
    int countByExample(TbUserCollectionExample example);

    int deleteByExample(TbUserCollectionExample example);

    int deleteByPrimaryKey(TbUserCollectionKey key);

    int insert(TbUserCollectionKey record);

    int insertSelective(TbUserCollectionKey record);

    List<TbUserCollectionKey> selectByExample(TbUserCollectionExample example);

    int updateByExampleSelective(@Param("record") TbUserCollectionKey record, @Param("example") TbUserCollectionExample example);

    int updateByExample(@Param("record") TbUserCollectionKey record, @Param("example") TbUserCollectionExample example);
}