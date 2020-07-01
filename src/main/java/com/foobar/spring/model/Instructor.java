package com.foobar.spring.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
@Table(name="instructor")

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Instructor implements Serializable{
	
	@Id
	private int id;
	
	private String firstName;
	
	private String lastName;
	
	private String phone;
	
	@ManyToOne
	private Department dep;
	
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
		this.id=id;
	}
	
	public int getId() {
		return this.id;
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
