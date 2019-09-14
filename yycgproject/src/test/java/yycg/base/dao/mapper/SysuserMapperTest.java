package yycg.base.dao.mapper;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import yycg.base.pojo.po.Sysuser;
import yycg.util.UUIDBuild;
import junit.framework.TestCase;

public class SysuserMapperTest extends TestCase {
	private ApplicationContext applicationContext;
	private SysuserMapper sysuserMapper;
	
	protected void setUp()throws Exception {
		//获取spring容器
		applicationContext = new ClassPathXmlApplicationContext(new String[]{
				"spring/applicationContext.xml",
				"spring/applicationContext-dao.xml",
				
		});
		sysuserMapper = (SysuserMapper) applicationContext.getBean("sysuserMapper");
	}

	//根据主键删除
	public void testDeleteByPrimaryKey() {
		sysuserMapper.deleteByPrimaryKey("");
	}

	//插入用户信息
	public void testInsert() {
		Sysuser sysuser = new Sysuser();
		sysuser.setId(UUIDBuild.getUUID());//生成uuid主键
		
		sysuser.setUserid("");
		sysuser.setUsername("");
		sysuserMapper.insert(sysuser);
	}

	//自定义查询条件查询
	public void testSelectByExample() {
		
	}

	//根据主键查询用户信息
	public void testSelectByPrimaryKey() {
		Sysuser sysuser = sysuserMapper.selectByPrimaryKey("110");
		System.out.println(sysuser.toString());
		
	}

	//根据主键更新，传入的po类的属性不为空才更新
	public void testUpdateByPrimaryKeySelective() {
		//定义一个新的对象
		Sysuser sysuser = new Sysuser();
		//对象设置id
		sysuser.setId("");
		//在设置更新的值
		sysuser.setUsername("");
		sysuserMapper.updateByPrimaryKeySelective(sysuser);
		
	}

	//根据主键更新,不管传入的po类的属性是否为空，都更新
	public void testUpdateByPrimaryKey() {
		//先查询对象
		Sysuser sysuser = sysuserMapper.selectByPrimaryKey("");
		//向对象中设置要更新的值
		sysuser.setUsername("");
		//执行更新
			
		sysuserMapper.updateByPrimaryKey(sysuser);
		
	}

}
