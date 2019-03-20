package com.capgemini.tests;

import static org.junit.Assert.assertEquals;

import java.util.HashSet;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.model.School;

public class SchoolTest {

	School school1 ;
	School school2 ;
	School school3 ;
	School school4 ;
	
	@Before
	public void setUp() throws Exception {
		
		school1 = new School("DYPIEMR","pune","pune",1);
		school2 = new School("DYPIEMR1","mumbai","pune",1);
		school3 = new School("DYPIEMR2","pune","mumbai",1);
		school4 = new School("DYPIEMR","pune","pune",1);
		
	}
	
	@Test
	public void TestCarIsInOrder() {
		HashSet<School> schools = new HashSet<>();
		schools.add(school1);
		schools.add(school2);
		schools.add(school3);
		schools.add(school4);	
		
		assertEquals(3, schools.size());
	}

	

}
