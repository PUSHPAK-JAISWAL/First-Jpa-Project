package io.pushpakjaiswal.entityrelationships;

import javax.persistence.*;

@Entity
public class Student {
	
	@Column(name = "Student_Name",nullable=false)
	private String name;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int rollNo;
	
	
	@OneToOne
	private StudentIdCard card;
	
	

	public StudentIdCard getCard() {
		return card;
	}

	public void setCard(StudentIdCard card) {
		this.card = card;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int id) {
		this.rollNo = id;
	}
	

}
