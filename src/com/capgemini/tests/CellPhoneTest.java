package com.capgemini.tests;

import static org.junit.Assert.assertEquals;

import java.util.HashSet;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.model.CellPhone;

public class CellPhoneTest {

	CellPhone phone1;
	CellPhone phone2;
	CellPhone phone3;
	CellPhone phone4;
	
	
	@Before
	public void setUp() {
		phone1 = new CellPhone("nokia","6","touchScreen","android6",12000);
		phone2 = new CellPhone("apple","6","touchScreen","android6",12000);
		phone3 = new CellPhone("nokia","7","touchScreen","android6",12000);
		phone4 = new CellPhone("nokia","6","touchScreen","android6",12000);
	}

	@Test
	public void TestCarIsInOrder() {
		HashSet<CellPhone> cellPhones = new HashSet<>();
		cellPhones.add(phone1);
		cellPhones.add(phone2);
		cellPhones.add(phone3);
		cellPhones.add(phone4);
		
		
		assertEquals(3, cellPhones.size());
	}

}
