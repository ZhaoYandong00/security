package com.zyd.security.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import com.zyd.security.mapper.SysUserMapper;
import com.zyd.security.model.SysUser;


public class CustomUserService implements UserDetailsService {
	@Autowired
	private SysUserMapper sysUserMapper;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		SysUser user = sysUserMapper.findByUsername(username);
		if (user == null)
			throw new UsernameNotFoundException("用户名不存在");
		return user;
	}

}
