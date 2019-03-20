package com.capgemini.tests;

import static org.junit.Assert.assertEquals;

import java.util.HashSet;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.model.Laptops;

public class LaptopTest {

	Laptops laptop1;
	Laptops laptop2;
	Laptops laptop3;
	Laptops laptop4;
	Laptops laptop5;

	
	@Before
	public void setUp() {
		laptop1 = new Laptops("hp", "model1", "windows10", "i7");
		laptop2 = new Laptops("asus", "model2", "ubuntu", "i5");
		laptop3 = new Laptops("lenovo", "model3", "windows7", "i3");
		laptop4 = new Laptops("hp", "model1", "windows10", "i7");
		laptop5 = new Laptops("lenovo", "model3", "windows7", "i3");
	}

	@Test
	public void testLaptopisInOrder() {
		HashSet<Laptops> laptops = new HashSet<>();
		laptops.add(laptop1);
		laptops.add(laptop2);
		laptops.add(laptop3);
		laptops.add(laptop4);
		laptops.add(laptop5);
		assertEquals(3,laptops.size());
	}


}
