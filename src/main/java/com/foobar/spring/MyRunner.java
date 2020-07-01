package com.foobar.spring;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.foobar.spring.dao.*;
import com.foobar.spring.model.Course;
import com.foobar.spring.model.Department;
import com.foobar.spring.model.Instructor;
import com.foobar.spring.model.Student;


/*
 * 
	@Id
	private int id;
	
	private String firstName,lastName;
	
	private String phone;
	
	@ManyToOne
	@JoinColumn(name="departmentId")
	private Department dep;
	
	///
	 * 
	 * private int departmentId;
		
		private String name;
		
		private String location;
		
		@OneToMany(mappedBy = "department", cascade = CascadeType.ALL)	
		private Set<Instructor> instructors;
		
	
 * 
 */
@Component
public class MyRunner implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(MyRunner.class);
    
    @Autowired
    private StudentDaoRepository studentRepository;

    @Autowired
    private CourseDaoRepository courseRepository;
    
    @Autowired
    private DepartmentDaoRepository departmentRepository;
    
    @Autowired
    private InstructorDaoRepository instructorRepository;
    
    @Override
    public void run(String...args) throws Exception {
    	
    	// one department has many instructors = OneToMany
    	Department d1 = new Department();
    	d1.setDepartmentId(1);
    	d1.setLocation("Watson Building");
    	d1.setName("IST");
    	
    	Department d2 = new Department();
    	d2.setDepartmentId(2);
    	d2.setLocation("Red Building");
    	d2.setName("MECH");
    	
    	List<Department> dl = new ArrayList<>();
    	dl.add(d1);
    	dl.add(d2);
    	
    	departmentRepository.saveAll(dl);
    	
    	Instructor in1 = new Instructor();
    	in1.setId(101);
    	in1.setFirstName("Balaji");
    	in1.setLastName("Arumugam");
    	in1.setPhone("8056124486");
    	in1.setDepartment(d2);
    	
    	Instructor in2 = new Instructor();
    	in2.setId(102);
    	in2.setFirstName("Venkii");
    	in2.setLastName("MadanaGopal");
    	in2.setPhone("9080605109");
    	in2.setDepartment(d1);
    	
    	
    	Instructor in3 = new Instructor();
    	in3.setId(103);
    	in3.setFirstName("Mukesh");
    	in3.setLastName("Swamynathan");
    	in3.setPhone("8870601654");
    	in3.setDepartment(d2);
    	
    	List<Instructor> hs = new ArrayList<>();
    	hs.add(in1);
    	hs.add(in2);
    	hs.add(in3);
    	
    	instructorRepository.saveAll(hs);
    	
    	
    	//one department offers many courses = OneToMany
    	
    	
    	
    	Course c1 = new Course();
    	c1.setName("OS");
    	c1.setId(2001);
    	c1.setDuration(45);
    	c1.setDepartment(d1);
    	c1.setInstructor(in2);
 
    	
 
    	Course c2 = new Course();
    	c2.setName("FM");
    	c2.setId(2002);
    	c2.setDuration(45);
    	c2.setDepartment(d2);
    	c2.setInstructor(in1);
    	
    	Course c3 = new Course();
    	c3.setName("Mechatronics");
    	c3.setId(2003);
    	c3.setDuration(45);
    	c3.setDepartment(d2);
    	c3.setInstructor(in3);
    	
    	List<Course> cl = new ArrayList<>();
    	cl.add(c1);
    	cl.add(c2);
    	cl.add(c3);
    	
    	courseRepository.saveAll(cl);
    	
    	Student s1 = new Student();
    	s1.setFirstName("Phil");
    	s1.setLastName("foden");
    	s1.setId(40001);
    	s1.setPhone("9892312432");
    	s1.setDepartment(d1);
    	
//    			
    	Student s2 = new Student();
    	s2.setFirstName("ThaelBathiri");
    	s2.setLastName("Singh");
    	s2.setId(40002);
    	s2.setPhone("8923192432");
    	s2.setDepartment(d2); 	
    	
    	Student s3= new Student();
    	s3.setFirstName("Veera");
    	s3.setLastName("Baghu");
    	s3.setId(40003);
    	s3.setPhone("8919243223");
    	s3.setDepartment(d2); 	
    	
    	List<Student> sl = new ArrayList<>();
    	sl.add(s1);
    	sl.add(s2);
    	sl.add(s3);
    	
    	studentRepository.saveAll(sl);
    	
    	
    	Set<Student> st1 = new HashSet<>(sl);
    	c1.setStudents(st1);
    	
    	Set<Course> st2 = new HashSet<>(cl);
    	s1.setCourses(st2);
    	
    	
    	
    
    }
    
}
