package com.dream.universal.service;

import com.dream.universal.domain.SysUser;

public interface WelcomeService {
	String selectName(long id);
	SysUser selectUser(long id);
}
