package com.qst.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.qst.po.Employee;

public interface EmployeeMapper {
    public Employee selectEmployeeById(int empid);
    public void updatetrimshouelectDynamicEmployee(@Param("name")String name,@Param("empid")int empid);
    public List<Employee> selectBindEmployee(@Param("name")String name);
    //public List<Employee> selectBindEmployee(@Param("name")String name,@Param("employee")Employee employee);
}
 