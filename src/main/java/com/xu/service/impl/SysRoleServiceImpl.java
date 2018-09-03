package com.xu.service.impl;


import com.xu.entity.SysRole;
import com.xu.mapper.SysRoleMapper;
import com.xu.service.SysRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SysRoleServiceImpl implements SysRoleService {
    @Autowired
    SysRoleMapper sysRoleMapper;

    @Override
    public SysRole selectInfo(int num) {
        return  sysRoleMapper.selectInfo(num);
    }
}
