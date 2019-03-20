package com.capgemini.model;

public class Student implements Comparable<Student> {

	private int rollNo;
	private String name;
	private String branch;
	private String gender;
	
	
	public Student(int rollNo, String name, String branch, String gender) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.branch = branch;
		this.gender = gender;
	}
	
	
	public Student() {
		super();
		
	}


	public int getRollNo() {
		return rollNo;
	}


	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getBranch() {
		return branch;
	}


	public void setBranch(String branch) {
		this.branch = branch;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + rollNo;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (rollNo != other.rollNo)
			return false;
		return true;
	}


	@Override
	public int compareTo(Student obj) {

		return this.name.compareTo(obj.name);
	}
	
	
	
	
	
}
