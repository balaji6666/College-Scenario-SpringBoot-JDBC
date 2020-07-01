package com.foobar.spring.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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
@Table(name="department")

@Getter(AccessLevel.PUBLIC)
@Setter(AccessLevel.PUBLIC)
@NoArgsConstructor
@AllArgsConstructor
@ToString


public class Department implements Serializable {
		@Id
		private int departmentId;
		
		private String name;
		
		private String location;
		
		
//		private Set<Instructor> instructors;
//		
//		
//		public void setInstructors(Set<Instructor> instructors)
//		{
//			this.instructors=instructors;
//		}
//		
//		public Set<Instructor> getInstructors()
//		{
//			return this.instructors;
//		}
		
		public void setDepartmentId(int did)
		{
			this.departmentId=did;
		}
		
		public int getDepartmentId()
		{
			return this.departmentId;
		}
		
		public void setName(String name)
		{
			this.name = name;
		}
		
		public String getName()
		{
			return this.name;
		}
		
		public void setLocation(String location)
		{
			this.location=location;
		}
		
		public String getLocation()
		{
			return this.location;
		}
}
