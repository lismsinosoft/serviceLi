package com.sinosoft.capacity.db.dao;

import com.sinosoft.capacity.db.pojo.DzswRequirementTask;
import com.sinosoft.capacity.db.pojo.DzswRequirementTaskExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
public interface DzswReauirementTaskDAO {
    long countByExample(DzswRequirementTaskExample example);

    int deleteByExample(DzswRequirementTaskExample example);

    int deleteByPrimaryKey(String seqNo);

    int insert(DzswRequirementTask record);

    int insertSelective(DzswRequirementTask record);

    List<DzswRequirementTask> selectByExample(DzswRequirementTaskExample example);

    DzswRequirementTask selectByPrimaryKey(String seqNo);

    int updateByExampleSelective(@Param("record") DzswRequirementTask record, @Param("example") DzswRequirementTaskExample example);

    int updateByExample(@Param("record") DzswRequirementTask record, @Param("example") DzswRequirementTaskExample example);

    int updateByPrimaryKeySelective(DzswRequirementTask record);

    int updateByPrimaryKey(DzswRequirementTask record);
}