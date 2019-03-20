package com.capgemini.tests;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeSet;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.model.Student;

public class StudentTest {

	Student student1;
	Student student2;
	Student student3;
	
	
	@Before
	public void setUp() {
		student1 = new Student(1,"Abbas","IT","male");
		student2 = new Student(2,"mrunal","comp","male");
		student3 = new Student(3,"arif","ENTC","male");
		
	}

	@Test
	public void testStudentsAreInGivenOrder() {
		ArrayList<Student>students = new ArrayList<>();
		
		students.add(student1);
		students.add(student2);
		students.add(student3);
		
		Iterator<Student> iterator = students.iterator(); 
		
		assertEquals("Abbas", iterator.next().getName());
		
	}
	
	@Test
	public void TestStudentsInNaturalOrder() {
		student1 = new Student(1,"Abbas","IT","male");
		TreeSet<Student> students = new TreeSet<>();
		
		students.add(student1);
		students.add(student2);
		students.add(student3);
		
		Iterator<Student> iterator = students.iterator(); 
		
		assertEquals("Abbas", iterator.next().getName());
		
	}
	
	@Test
	public void TestUsingMap() {
		HashMap<String , String> hm = new HashMap<>();
		
		hm.put(student1.getName(), "mango");
		hm.put(student2.getName(), "banana");
		hm.put(student3.getName(), "strawbery");
		
		assertEquals("mango", hm.get(student1.getName()));
	}
	
	
	

}
