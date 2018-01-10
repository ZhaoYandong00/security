package com.zyd.security.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.zyd.security.model.SysUser;

@Mapper
public interface SysUserMapper {
	SysUser findByUsername(String username);
}
