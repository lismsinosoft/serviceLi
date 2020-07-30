package com.sinosoft.capacity;

import com.alibaba.fastjson.JSON;
import com.sinosoft.capacity.db.dao.ReqRequirementRecordDAO;
import com.sinosoft.capacity.db.pojo.ReqRequirementRecord;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
class CapacityApplicationTests {

    @Resource
    private ReqRequirementRecordDAO reqRequirementRecordDAO;

    private Log log = LogFactory.getLog(CapacityApplicationTests.class);
    @Test
    void contextLoads() {
        ReqRequirementRecord reqRequirementRecord = reqRequirementRecordDAO.selectByPrimaryKey("SEQ-11158");
        System.out.println("hello world!");
        System.out.println(JSON.toJSON(reqRequirementRecord));
        log.info(JSON.toJSON(reqRequirementRecord));

    }

}
