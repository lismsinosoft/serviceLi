package com.sinosoft.capacity.db.dao;

import com.sinosoft.capacity.db.pojo.ReqCostRecord;
import com.sinosoft.capacity.db.pojo.ReqCostRecordExample;
import com.sinosoft.capacity.db.pojo.ReqCostRecordKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReqCostRecordDAO {
    long countByExample(ReqCostRecordExample example);

    int deleteByExample(ReqCostRecordExample example);

    int deleteByPrimaryKey(ReqCostRecordKey key);

    int insert(ReqCostRecord record);

    int insertSelective(ReqCostRecord record);

    List<ReqCostRecord> selectByExample(ReqCostRecordExample example);

    ReqCostRecord selectByPrimaryKey(ReqCostRecordKey key);

    int updateByExampleSelective(@Param("record") ReqCostRecord record, @Param("example") ReqCostRecordExample example);

    int updateByExample(@Param("record") ReqCostRecord record, @Param("example") ReqCostRecordExample example);

    int updateByPrimaryKeySelective(ReqCostRecord record);

    int updateByPrimaryKey(ReqCostRecord record);
}