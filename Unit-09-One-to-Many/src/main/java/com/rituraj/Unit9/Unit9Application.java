package com.rituraj.Unit9;

import java.util.List;

import com.rituraj.Unit9.dao.AppDAO;
import com.rituraj.Unit9.entity.Course;
import com.rituraj.Unit9.entity.Instructor;
import com.rituraj.Unit9.entity.InstructorDetail;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class Unit9Application {

	public static void main(String[] args) {
		SpringApplication.run(Unit9Application.class, args);
	}

	@Bean	
	public CommandLineRunner commandLineRunner(AppDAO appDAO)
	{
		return  runner -> {
			
			//createInstructor(appDAO);
			
			//findInstructor(appDAO);
			
			//deleteInstructor(appDAO);
			
			//findInstructorDetail(appDAO);
			
			//deleteInstructorDetail(appDAO);
			
			//createInstructorWithCourses(appDAO);
			
			//findInstructorWithCourses(appDAO);
			
			//findCoursesForInstructor(appDAO);
			
			//findInstructorWithCoursesJoinFetch(appDAO);
			
			//updateInstructor(appDAO);
			
			//updateCourse(appDAO);
			
			//deleteInstructor(appDAO);
			
			deleteCourse(appDAO);
		};
	}

	private void deleteCourse(AppDAO appDAO) {
		
		int theId =20;
		
		System.out.println("Course with id  found :"+theId);
		
		appDAO.deleteCourseById(theId);
		
		System.out.println("Deleted");
		
	}

	/*
	 * private void deleteInstructor(AppDAO appDAO) {
	 * 
	 * int theId =4;
	 * 
	 * System.out.println("Deleting Instructor with id :"+theId);
	 * 
	 * appDAO.deleteInstructorById(theId);
	 * 
	 * System.out.println("Deleted !!!!!!");
	 * 
	 * }
	 */
	
	
	

	/*
	 * private void updateCourse(AppDAO appDAO) {
	 * 
	 * int theId =12;
	 * 
	 * System.out.println("Finding Course with id :"+theId);
	 * 
	 * Course tempCourse = appDAO.findCourseById(theId);
	 * 
	 * System.out.println("Course original detail :"+tempCourse);
	 * 
	 * tempCourse.setTitle("Advance Java");
	 * 
	 * appDAO.updateCourse(tempCourse);
	 * 
	 * System.out.println("Updated Course Detail :"+tempCourse);
	 * 
	 * }
	 */
	

	/*
	 * private void updateInstructor(AppDAO appDAO) {
	 * 
	 * int theId =1;
	 * 
	 * System.out.println("Instructor with Id :"+theId);
	 * 
	 * Instructor tempInstructor = appDAO.findInstructorById(theId);
	 * System.out.println("Original Instructor :"+tempInstructor);
	 * 
	 * System.out.println("Updating instructor");
	 * 
	 * tempInstructor.setLastName("Punjabi");
	 * 
	 * appDAO.updateInstructor(tempInstructor);
	 * 
	 * System.out.println("Updated Instructor :"+tempInstructor);
	 * 
	 * }
	 */
	
	

	
	/*
	 * private void findInstructorWithCoursesJoinFetch(AppDAO appDAO) {
	 * 
	 * int theId=4; System.out.println("Finding Instructor id:"+theId);
	 * 
	 * Instructor tempInstructor = appDAO.findInstructorByIdJoinFetch(theId);
	 * 
	 * System.out.println("Temp Instructor :"+tempInstructor);
	 * 
	 * System.out.println("Associated Courses with Instructor :"+tempInstructor.
	 * getCourses()); System.out.println("Done!!!");
	 * 
	 * }
	 */
	 

	
	/*
	 * private void findCoursesForInstructor(AppDAO appDAO) { int theId=1;
	 * System.out.println("Finding Instructor id:"+theId);
	 * 
	 * Instructor tempInstructor = appDAO.findInstructorById(theId);
	 * System.out.println("TempInstructor : "+tempInstructor);
	 * 
	 * System.out.println("Finding courses for  Instructor id:"+theId); List<Course>
	 * courses = appDAO.findCoursesByInstructorId(theId);
	 * tempInstructor.setCourses(courses); //associates the object
	 * 
	 * System.out.println("Associated Courses :"+tempInstructor.getCourses());
	 * 
	 * 
	 * }
	 */
	
	/*
	 * private void findInstructorWithCourses(AppDAO appDAO) {
	 * 
	 * int theId=3;
	 * 
	 * System.out.println("Instructor with id :"+theId);
	 * 
	 * Instructor tempInstructor = appDAO.findInstructorById(theId);
	 * 
	 * System.out.println("TempInstructor : "+tempInstructor);
	 * 
	 * 
	 * System.out.println("Associated Courses : "+tempInstructor.getCourses());
	 * 
	 * System.out.println("Done");
	 * 
	 * }
	 */
	 
	
	
	/*
	 * private void createInstructorWithCourses(AppDAO appDAO) {
	 * 
	 * 
	 * Instructor myInstructor = new
	 * Instructor("Raju","Singh","singhraju43@gmail.com");
	 * 
	 * InstructorDetail tempInstructorDetail = new
	 * InstructorDetail("http://www.youtube/billaraju","Listening Song");
	 * 
	 * //associate object
	 * 
	 * myInstructor.setInstructorDetail(tempInstructorDetail);
	 * 
	 * //create some courses
	 * 
	 * Course tempcourse1 = new Course("Asp.Net"); Course tempcourse2 = new
	 * Course("Springbot"); Course tempcourse3 = new Course("JavaBeginner");
	 * 
	 * //add courses to instructor myInstructor.add(tempcourse1);
	 * myInstructor.add(tempcourse2); myInstructor.add(tempcourse3);
	 * 
	 * //save the instructor //This will alsos ave courses because of
	 * CascadeType.PERSIST
	 * 
	 * System.out.println("Saving Instructor :"+myInstructor);
	 * System.out.println("Courses  :"+myInstructor.getCourses());
	 * 
	 * appDAO.save(myInstructor);
	 * 
	 * System.out.println("Done!"); }
	 */
	 
	
	
	
	
	/*
	 * private void deleteInstructorDetail(AppDAO appDAO) {
	 * 
	 * int theId=5;
	 * 
	 * System.out.println(" Deleting InstructorDetail with id :"+theId);
	 * 
	 * appDAO.deleteInstructorDetailById(theId);
	 * 
	 * System.out.println("Done"); }
	 */
	
	
	
	
	

	/*
	 * private void findInstructorDetail(AppDAO appDAO) {
	 * 
	 * int theId=1;
	 * 
	 * InstructorDetail myInstDetail = appDAO.findInstructorDetailById(theId);
	 * 
	 * System.out.println("InstructorDetail :"+myInstDetail);
	 * 
	 * System.out.println("Detail of Instructor Object :");
	 * 
	 * System.out.println(myInstDetail.getInstructor()); }
	 */
	
	
	
	
	
	
	
	
	
	
	

	/*
	 * private void deleteInstructor(AppDAO appDAO) {
	 * 
	 * int theId=2;
	 * 
	 * System.out.println("Delete Instructor id : +theId ");
	 * 
	 * appDAO.deleteById(theId); System.out.println("Done!!"); }
	 */
	
	
	
	
	

//	private void findInstructor(AppDAO appDAO) {
//		int theId= 1;
//		
//		System.out.println("Instructor with Id :" +theId);
//		
//		Instructor myInst = appDAO.findInstructorById(theId);
//		System.out.println(" Instructor : "+myInst);
//		System.out.println("Associated detail of Instructor :"+myInst.getInstructorDetail());
//	}	
	
	

	
	
	/*
	 * private void createInstructor(AppDAO appDAO) {
	 * 
	 * Instructor myInstructor = new
	 * Instructor("Rituraj","Singh","singhrituraj435@gmail.com");
	 * 
	 * InstructorDetail tempInstructorDetail = new
	 * InstructorDetail("http://www.youtube/rituraj","Playing Cricket");
	 * 
	 * //associate object
	 * 
	 * myInstructor.setInstructorDetail(tempInstructorDetail);
	 * 
	 * //save object
	 * 
	 * appDAO.save(myInstructor);
	 * 
	 * }
	 */
	  
	 
	
	
	
	
}
