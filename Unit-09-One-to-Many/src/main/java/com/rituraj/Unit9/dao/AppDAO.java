package com.rituraj.Unit9.dao;

import com.rituraj.Unit9.entity.Instructor;

import java.util.List;

import com.rituraj.Unit9.entity.Course;
import com.rituraj.Unit9.entity.InstructorDetail;

public interface AppDAO {

	public void save(Instructor theInstructor);
	
	public Instructor findInstructorById(int theId);
	
	public void deleteById(int theId);
	
	public InstructorDetail findInstructorDetailById(int theId);
	
	public void deleteInstructorDetailById(int theId);
	
	public List<Course> findCoursesByInstructorId(int theId);
	
	public Instructor findInstructorByIdJoinFetch(int theId);
	
	public void updateInstructor(Instructor tempInstructor);
	
	public Course findCourseById(int theId);
	
	public void updateCourse(Course tempCourse);
	
	public void deleteInstructorById(int theId);
	
	public void deleteCourseById(int theId);
}
