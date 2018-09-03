package com.xu.controller;

import com.xu.entity.SysRole;
import com.xu.service.SysRoleService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@EnableAutoConfiguration
@RequestMapping("/testboot")
public class SysRoleController {

    private Logger logger  = Logger.getLogger(SysRoleController.class);

    @Autowired
    private SysRoleService sysRoleService;

    @RequestMapping("/libai")
    @ResponseBody
    public SysRole libai(HttpServletRequest hsp){
        return sysRoleService.selectInfo(1);
    }
}
