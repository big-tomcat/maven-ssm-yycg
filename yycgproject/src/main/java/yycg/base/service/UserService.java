package yycg.base.service;

import yycg.base.pojo.po.Sysuser;

public interface UserService {
	
	
	//根據用户id查询用户
	public Sysuser findSysuesrById(String id) throws Exception;
	

}
