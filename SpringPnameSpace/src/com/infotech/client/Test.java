package com.infotech.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.infotech.model.Course;
import com.infotech.model.Student;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ctx  = new ClassPathXmlApplicationContext("Beans.xml");
		
		Student student = ctx.getBean("student", Student.class);
		
		System.out.println(student.getName()+"\t"+student.getAge());
		
		System.out.println("--------------------");
		
		Course course = student.getCourse();
		
		System.out.println(course.getCourseName());
		
		((AbstractApplicationContext) ctx).close();
	}

}
