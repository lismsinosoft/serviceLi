package com.sinosoft.capacity.db.dao;

import com.sinosoft.capacity.db.pojo.ReqRequirementRecord;
import com.sinosoft.capacity.db.pojo.ReqRequirementRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReqRequirementRecordDAO {
    long countByExample(ReqRequirementRecordExample example);

    int deleteByExample(ReqRequirementRecordExample example);

    int deleteByPrimaryKey(String seqNo);

    int insert(ReqRequirementRecord record);

    int insertSelective(ReqRequirementRecord record);

    List<ReqRequirementRecord> selectByExample(ReqRequirementRecordExample example);

    ReqRequirementRecord selectByPrimaryKey(String seqNo);

    int updateByExampleSelective(@Param("record") ReqRequirementRecord record, @Param("example") ReqRequirementRecordExample example);

    int updateByExample(@Param("record") ReqRequirementRecord record, @Param("example") ReqRequirementRecordExample example);

    int updateByPrimaryKeySelective(ReqRequirementRecord record);

    int updateByPrimaryKey(ReqRequirementRecord record);
}