package annotation.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import annotation.beans.Course;

@Repository  //courseDao
public class CourseDao {
	public List<Course> getCourses(){
		List<Course> list = new ArrayList<Course>();
		System.out.println("查询课程信息");
		//list = 从数据库查询的结果集
		return list;
		
	}
}
