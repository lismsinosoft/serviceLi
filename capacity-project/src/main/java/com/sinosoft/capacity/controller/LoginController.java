package com.sinosoft.capacity.controller;

import com.sinosoft.capacity.dto.UserInfoDTO;
import com.sinosoft.capacity.dto.base.ResultMsgDTO;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;

@RestController
public class LoginController {

    private Log log = LogFactory.getLog(LoginController.class);

    @PostMapping("/capacity/login")
    public ResultMsgDTO LoginSysTem(@Validated @RequestBody UserInfoDTO userInfoDTO){
        log.info(userInfoDTO.getUserName());
        if(!"admin".equals(userInfoDTO.getUserName())){
            return ResultMsgDTO.fail("0","登录异常");
        }
        return ResultMsgDTO.succ("Hello");
    }
}
