package com.sinosoft.capacity.controller;

import com.sinosoft.capacity.db.dao.DzswReauirementTaskDAO;
import com.sinosoft.capacity.db.pojo.DzswRequirementTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

@Controller
@RequestMapping("/capacity")
public class TestController {

    @Autowired
    private DzswReauirementTaskDAO dzswReauirementTaskDAO;

    @RequestMapping("/hello")
    public String getIndex(){
        DzswRequirementTask dzswRequirementTask = dzswReauirementTaskDAO.selectByPrimaryKey("SEQ-11158");
         System.out.println("hello world!");
         System.out.println(dzswRequirementTask.toString());
        return "index";
    }
    @RequestMapping("/login1")
    public ModelAndView getLogin(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/login/login");

        return modelAndView;
    }


}
