package annotation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import annotation.beans.Course;
import annotation.dao.CourseDao;

@Service
public class CourseService {
	@Autowired//默认是按照类型自动装配的
	private CourseDao courseDao;
	
	public List<Course> getCourses(){
		return courseDao.getCourses();
	}
}
