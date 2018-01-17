package com.dream.universal.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dream.universal.domain.SysUser;
import com.dream.universal.mapper.SysUserMapper;
import com.dream.universal.service.WelcomeService;


@Service
public class WelcomeServiceImpl implements WelcomeService{
	@Autowired
	private SysUserMapper sysUserMapper;
	
	@Override
	public String selectName(long id) {
		SysUser user= sysUserMapper.selectByPrimaryKey(id);
		String name =user.getRealName();
		return name;
	}

}
