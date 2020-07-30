package com.sinosoft.capacity.controller;

import com.sinosoft.capacity.db.dao.ReqRequirementRecordDAO;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.annotation.Resource;

@Controller
@RequestMapping("/capacity")
public class TestController {

    @Resource
    private ReqRequirementRecordDAO reqRequirementRecordDAO;

    private Log log = LogFactory.getLog(TestController.class);


}
