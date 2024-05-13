package com.Hibernate.Hibernate_1;

import javax.persistence.GeneratedValue;
import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.*;
@Entity
@Table(name="studentinfo")
public class StudentPersistent {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "sid")
	private int id;
	
	@Column(name="firstname")
	private String firstName;
	
	@Column(name="lasttname")
	private String lastName;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "StudentPersistent [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}

	public StudentPersistent(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public StudentPersistent() {
		// TODO Auto-generated constructor stub
	}
	
	
}
