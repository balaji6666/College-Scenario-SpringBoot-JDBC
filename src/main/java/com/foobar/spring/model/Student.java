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
@Table(name="students")

@Getter(AccessLevel.PUBLIC)
@Setter(AccessLevel.PUBLIC)
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Student {
	@Id
	private int registerNo;
	
	private String firstName;
	private String lastName;
	private String phone;
	private Department department;
	
	@ManyToOne
	private Department dep;
	
	@ManyToMany
	private Set<Course> courses;
	
	public void setCourses(Set<Course> courses)
	{
		this.courses=courses;
	}
	
	public Set<Course> getCourses()
	{
		return this.courses;
	}
	
	public void setDepartment(Department dep)
	{
		this.dep = dep;
	}
	
	public Department getDepartment()
	{
		return this.dep;
	}
	
	public void setId(int id)
	{
		this.registerNo=id;
	}
	
	public int getId()
	{
		return this.registerNo;
	}
	
	public void setFirstName(String fname)
	{
		this.firstName=fname;
	}
	
	public String getFirstName()
	{
		return this.firstName;
	}
	
	public void setLastName(String lname)
	{
		this.lastName=lname;
	}
	
	public String getLastName()
	{
		return this.lastName;
	}
	
	public void setPhone(String phone)
	{
		this.phone = phone;
	}
	
	public String getPhone()
	{
		return this.phone;
	}
	
}
