package org.sample.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.sample.entity.TbGood;
import org.sample.entity.TbGoodExample;

public interface TbGoodMapper {
    int countByExample(TbGoodExample example);

    int deleteByExample(TbGoodExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbGood record);

    int insertSelective(TbGood record);

    List<TbGood> selectByExample(TbGoodExample example);

    TbGood selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbGood record, @Param("example") TbGoodExample example);

    int updateByExample(@Param("record") TbGood record, @Param("example") TbGoodExample example);

    int updateByPrimaryKeySelective(TbGood record);

    int updateByPrimaryKey(TbGood record);
}