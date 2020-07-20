package com.sinosoft.capacity.db.dao;

import com.sinosoft.capacity.db.pojo.EbizCostTask;
import com.sinosoft.capacity.db.pojo.EbizCostTaskExample;
import com.sinosoft.capacity.db.pojo.EbizCostTaskKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EbizCostTaskDAO {
    long countByExample(EbizCostTaskExample example);

    int deleteByExample(EbizCostTaskExample example);

    int deleteByPrimaryKey(EbizCostTaskKey key);

    int insert(EbizCostTask record);

    int insertSelective(EbizCostTask record);

    List<EbizCostTask> selectByExample(EbizCostTaskExample example);

    EbizCostTask selectByPrimaryKey(EbizCostTaskKey key);

    int updateByExampleSelective(@Param("record") EbizCostTask record, @Param("example") EbizCostTaskExample example);

    int updateByExample(@Param("record") EbizCostTask record, @Param("example") EbizCostTaskExample example);

    int updateByPrimaryKeySelective(EbizCostTask record);

    int updateByPrimaryKey(EbizCostTask record);
}