package com.foobar.spring.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.ToString;


@Entity
@Table(name="course")

@Getter(AccessLevel.PUBLIC)
@Setter(AccessLevel.PUBLIC)
@NoArgsConstructor
@AllArgsConstructor
@ToString


public class Course {
	@Id
	private int id;
	
	@ManyToOne
	private Department department;
	
	@ManyToOne
	private Instructor instructor;
	
	@ManyToMany
	private Set<Student> students;
	
	public void setStudents(Set<Student> students)
	{
		this.students = students;
	}
	
	public Set<Student> getStudents()
	{
		return this.students;
	}
	
	private int duration;
	
	private String name;
	
	public void setId(int id)
	{
		this.id = id;
	}
	
	public int getId()
	{
		return this.id;
	}
	
	public void setDepartment(Department dep)
	{
		this.department = dep;
	}
	
	public Department getDepartment()
	{
		return this.department;
	}
	
	
	public void setInstructor(Instructor instructor)
	{
		this.instructor= instructor;
	}
	
	public Instructor getInstructor()
	{
		return this.instructor;
	}
	
	public void setDuration(int duration)
	{
		this.duration = duration;
	}
	
	public int getDuration()
	{
		return this.duration;
	}
	
	public void setName(String name)
	{
		this.name =name;
	}
	
	public String getName()
	{
		return this.name;
	}
	
}
