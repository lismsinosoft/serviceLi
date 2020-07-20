package com.sinosoft.capacity.db.dao;

import com.sinosoft.capacity.db.pojo.EbizUserTask;
import com.sinosoft.capacity.db.pojo.EbizUserTaskExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EbizUserTaskDAO {
    long countByExample(EbizUserTaskExample example);

    int deleteByExample(EbizUserTaskExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(EbizUserTask record);

    int insertSelective(EbizUserTask record);

    List<EbizUserTask> selectByExample(EbizUserTaskExample example);

    EbizUserTask selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EbizUserTask record, @Param("example") EbizUserTaskExample example);

    int updateByExample(@Param("record") EbizUserTask record, @Param("example") EbizUserTaskExample example);

    int updateByPrimaryKeySelective(EbizUserTask record);

    int updateByPrimaryKey(EbizUserTask record);
}