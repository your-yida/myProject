package com.qjcz.manager.dao;

import com.qjcz.bean.TParam;
import com.qjcz.bean.TParamExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TParamMapper {
    int countByExample(TParamExample example);

    int deleteByExample(TParamExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TParam record);

    int insertSelective(TParam record);

    List<TParam> selectByExample(TParamExample example);

    TParam selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TParam record, @Param("example") TParamExample example);

    int updateByExample(@Param("record") TParam record, @Param("example") TParamExample example);

    int updateByPrimaryKeySelective(TParam record);

    int updateByPrimaryKey(TParam record);
}