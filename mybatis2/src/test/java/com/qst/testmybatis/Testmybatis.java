package com.qst.testmybatis;


import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.qst.mapper.EmployeeMapper;
import com.qst.po.Employee;

public class Testmybatis {
	@Test
   public void testmybatis() throws IOException {
//		InputStream inputStream=Resources.getResourceAsStream("mybatis-config.xml");
//		
//		SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
//		
//		
//		SqlSession sqlSession=sqlSessionFactory.openSession();
		
		
		
//	   1读取配置文件
	    InputStream inputStream=Resources.getResourceAsStream("mybatis-config.xml");
//	   2 根据配置文件构建sqlSessionFactory
	    SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
//     3通过sqlSessionFactory创建SqlSession
	   SqlSession sqlSession=sqlSessionFactory.openSession();
//	   4通过SqlSession对象操作数据库，包括查询、添加、修改
	   
	   
	   
//	   Employee employee=  sqlSession.selectOne("selectEmployeeById",2);
//////	
//		System.out.println(employee);
//		sqlSession.close();
//	    5关闭SqlSession
		
		//  4 插入
//	    Employee employee=new Employee();
//	    employee.setName("杰斯");
//	    employee.setEmpid(6);
//	    employee.setPosition("上单");
//		employee.setEmail("99999999");
//		employee.setGender(0);
//		
//		sqlSession.insert("insertEmployee",employee);
//		sqlSession.commit();
//		2全查询，多条数据
		 List<Employee> employeelist=sqlSession.selectList("selectEmployee");
		 for(Employee employee:employeelist){
			 System.out.println(employee);
		 }
		 sqlSession.close();
//	        3模糊查询，根据名字查询	
//		 List<Employee> employeelist=sqlSession.selectList("selectEmployeeByName","张");
//		 
//		 for(Employee employe:employeelist){
//			 System.out.println(employe);}
//		
//        5修改
//		Employee employee=new Employee();
//		employee.setEmpid(5);
//		employee.setPosition("打野");
//		sqlSession.update("updateEmployee",employee);
//		sqlSession.commit();

//6  删除
//	
//		sqlSession.delete("deleteEmployee",10);
//		sqlSession.commit();
//		
//		7.通国mapper接口实现查找
//	   EmployeeMapper employeeMapper= sqlSession.getMapper(EmployeeMapper.class);
//		
//	   Employee employee=  employeeMapper.selectEmployeeById(3);
//	   System.out.println(employee);

	   //动态sql
	  //1. if动态查询
//	  Employee employee=new  Employee();
//	  employee.setName("海兽祭祀");
//    employee.setEmpid(15);
//	  List<Employee> employeelist=sqlSession.selectList("ifselectDynamicEmployee", employee);
//	  for(Employee employe:employeelist){
//    	 System.out.println(employe);
//    	 }
//	  
	  //2.choose,wen,otherwise动态查询
//	    Employee employee=new  Employee();
//		employee.setName("杰斯");
//	    employee.setEmpid(14);
//	    employee.setPosition("上单");
//	    List<Employee> employeelist=sqlSession.selectList("chooseselectDynamicEmployee", employee);
//	    for(Employee employe:employeelist){
//    	System.out.println(employe);
//	    	 }
	    
//           3.where动态查询
//	    Employee employee=new  Employee();
//			employee.setName("杰斯");
//		    employee.setEmpid(14);
//		    employee.setPosition("上单");
//		    List<Employee> employeelist=sqlSession.selectList("whereselectDynamicEmployee", employee);
//		    for(Employee employe:employeelist){
//	    	System.out.println(employe);
//		    	 }
	 //  4.1 trim前缀动态查询
//	      
//		    Employee employee=new  Employee();
//				employee.setName("杰斯");
//			    employee.setEmpid(14);
//			    employee.setPosition("上单");
//			    List<Employee> employeelist=sqlSession.selectList("trimsqianelectDynamicEmployee", employee);
//			    for(Employee employe:employeelist){
//		    	System.out.println(employe);
//			    	 }
			    
			    //  4.2 trim
//			        Employee employee=new  Employee();
//					employee.setName("复仇烈焰");
//				    employee.setGender(1);
//				    employee.setPosition("中单");
//				    employee.setEmpid(14);
//				    sqlSession.update("trimshouelectDynamicEmployee", employee);
//				    sqlSession.commit();
				    
				    //    5.set
//				     Employee employee=new  Employee();
//						employee.setName("机器人");
////					    employee.setGender(1);
////					    employee.setPosition("辅助");
//					    employee.setEmpid(8);
//					    sqlSession.update("setDynamicEmployee", employee);
//					    sqlSession.commit();
	   
//                      6.bind模糊查询
//	    Employee employee=new  Employee();
//        employee.setName("机器人");
//        List<Employee> employeelist=sqlSession.selectList("selectBindEmployee", employee);
//        for(Employee employe:employeelist){
//   	    System.out.println(employe);}
////	   
	   //7通国注解传递参数
//	   EmployeeMapper employeeMapper= sqlSession.getMapper(EmployeeMapper.class);
//       employeeMapper.updatetrimshouelectDynamicEmployee("天启者", 1);
//       sqlSession.commit();
  //   8,bind模糊查询
//	   EmployeeMapper employeeMapper= sqlSession.getMapper(EmployeeMapper.class);
//	   Employee employee=new  Employee();
//	List<Employee> employeelist=employeeMapper.selectBindEmployee("机",employee);
//	   for(Employee employe:employeelist){
//     	    System.out.println(employe);}
	   
//	   EmployeeMapper employeeMapper= sqlSession.getMapper(EmployeeMapper.class);
//
//	   List<Employee> employeelist=employeeMapper.selectBindEmployee("机");
//	   for(Employee employe:employeelist){
//     	    System.out.println(employe);}
	}
}