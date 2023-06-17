package com.nxy.postgresqldemo.controller;

import com.nxy.postgresqldemo.entity.EmploymentInfo;
import com.nxy.postgresqldemo.entity.User;
import com.nxy.postgresqldemo.service.EmploymentInfoService;
import com.nxy.postgresqldemo.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Nilfie
 * @version 1.0
 * @date 2023/5/29 10:34
 */
@Controller
public class TestController {

    @Resource
    private UserService userService;

    @Resource
    private EmploymentInfoService employmentInfoService;

    @ResponseBody
    @RequestMapping("/index")
    public List login(){
        List infoList = employmentInfoService.getInfo();


        return infoList;
    }
}
