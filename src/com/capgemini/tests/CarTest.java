package com.capgemini.tests;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.model.Car;

public class CarTest {
	
	Car c1;
	Car c2;
	Car c3;
	Car c4;
	
	@Before 
	public void setUp() {
		c1=new Car("TATA","Nexon",2009,8000000);
		c2=new Car("Honda","Jazz",2010,8600000);
		c3=new Car("Audi","A3",2019,8560000);
		c4=new Car("Audi","A3",2019,8560000);
		
	}
	
	@Test
	public void TestInsertionOrder() {
		ArrayList<Car> cars = new ArrayList<>();
		cars.add(c1);
		cars.add(c2);
		cars.add(c3);
		Iterator<Car> iterator = cars.iterator();
		assertEquals("TATA", iterator.next().getMake());
	}

	@Test
	public void TestCarIsInOrder() {
		HashSet<Car> car = new HashSet<>();
		car.add(c1);
		car.add(c2);
		car.add(c3);
		car.add(c4);
		
		assertEquals(3, car.size());
	}
	
	@Test
	public void TestCarIsInAscendingOrder() {
		TreeSet<Car> cars = new TreeSet<>();
		cars.add(c1);
		cars.add(c2);
		cars.add(c3);
		cars.add(c4);
		
		Iterator<Car> iterator = cars.iterator();
		assertEquals("Audi", iterator.next().getMake());
	
	
	}
	

}
