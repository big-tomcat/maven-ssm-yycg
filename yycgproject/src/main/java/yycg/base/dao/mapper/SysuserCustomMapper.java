package yycg.base.dao.mapper;

import yycg.base.pojo.po.Sysuser;

public interface SysuserCustomMapper {

	//根据id查询用户信息  
	public Sysuser findSysuserById(String id) throws Exception;

}
