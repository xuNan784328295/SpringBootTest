package com.xu.mapper;

import com.xu.entity.SysRole;
import org.apache.ibatis.annotations.Param;

public interface SysRoleMapper {

    SysRole selectInfo(@Param("ngId") int ngId);
}
