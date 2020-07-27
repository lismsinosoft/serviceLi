package com.sinosoft.capacity.db.dao;

import com.sinosoft.capacity.db.pojo.ReqUserManage;
import com.sinosoft.capacity.db.pojo.ReqUserManageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReqUserManageDAO {
    long countByExample(ReqUserManageExample example);

    int deleteByExample(ReqUserManageExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ReqUserManage record);

    int insertSelective(ReqUserManage record);

    List<ReqUserManage> selectByExample(ReqUserManageExample example);

    ReqUserManage selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ReqUserManage record, @Param("example") ReqUserManageExample example);

    int updateByExample(@Param("record") ReqUserManage record, @Param("example") ReqUserManageExample example);

    int updateByPrimaryKeySelective(ReqUserManage record);

    int updateByPrimaryKey(ReqUserManage record);
}