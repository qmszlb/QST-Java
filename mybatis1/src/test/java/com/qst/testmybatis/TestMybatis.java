package com.qst.testmybatis;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.qst.po.Employee;

public class TestMybatis {
	
	@Test
	public void test() throws IOException {
		
		//读取配置文件
		InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
		
		//根据配置文件构建SqlSessionFactory
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		//通过SqlSessionFactory创建SqlSession
		SqlSession sqlSession = sqlSessionFactory.openSession();
		//使用SqlSession对象操作数据库，包括查询、添加、修改、删除以及提交事务等
		
		//4、插入一条数据
//		Employee employee = new Employee();
//		employee.setName("小明");
//		employee.setGender(1);
//		employee.setPosition("软件工程师");
//		sqlSession.insert("insertEmployee", employee);
		
		//5、修改
//		Employee employee = new Employee();
//		employee.setEmpid(12);
//		employee.setPosition("项目经理");
//		sqlSession.update("updateEmployee", employee);
		
		
		//6、删除
		sqlSession.delete("deleteEmployee", 12);
		
		
		sqlSession.commit();
		
		//1、查询单条数据
//		Employee employee = sqlSession.selectOne("selectEmployeeById", 3);
//		System.out.println(employee);
		
		//2、查询多条数据
		List<Employee> employeeList = sqlSession.selectList("selectEmployee");
		for (Employee employee1 : employeeList) {
			System.out.println(employee1);
		}
		
		//3、模糊查询
//		List<Employee> employeeList = sqlSession.selectList("selectEmployeeByName","张");
//		for (Employee employee : employeeList) {
//			System.out.println(employee);
//		}
			
			
			
		//关闭SqlSession
		sqlSession.close();
		
		
	}
}
