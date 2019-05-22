package annotation.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

import annotation.beans.Course;
import annotation.service.CourseService;

@Controller
public class CourseController {
	@Resource//默认是按照名字自动装配
	private CourseService courseService;
	
	
	public List<Course> getCourses(){
		return courseService.getCourses();
	}
}
