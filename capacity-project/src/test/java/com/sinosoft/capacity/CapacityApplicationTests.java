package com.sinosoft.capacity;

import com.sinosoft.capacity.db.dao.DzswReauirementTaskDAO;
import com.sinosoft.capacity.db.pojo.DzswRequirementTask;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class CapacityApplicationTests {

    @Resource
    private DzswReauirementTaskDAO dzswReauirementTaskDAO;
    @Test
    void contextLoads() {
        DzswRequirementTask dzswRequirementTask = dzswReauirementTaskDAO.selectByPrimaryKey("SEQ-11158");
        System.out.println("hello world!");
        System.out.println(dzswRequirementTask.toString());
    }

}
