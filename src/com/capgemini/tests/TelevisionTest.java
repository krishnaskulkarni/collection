package com.capgemini.tests;

import static org.junit.Assert.assertEquals;

import java.util.HashSet;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.model.Television;

public class TelevisionTest {

	Television t1;
	Television t2;
	Television t3;
	Television t4;
	Television t5;
	
	@Before
	public void setUp(){
		t1 = new Television("ONIDA","LCD",true,12000);
		t2 = new Television("LG","LED",true,12500);
		t3 = new Television("MI","plasma",true,1000);
		t4 = new Television("MI","plasma",true,1000);
		t5 = new Television("LG","LED",true,12500);
		
	}

	@Test
	public void testTelevisionisInOrder() {
		
		HashSet<Television> tv = new HashSet<Television>();
		tv.add(t1);
		tv.add(t2);
		tv.add(t3);
		tv.add(t4);
		tv.add(t5);
		
		assertEquals(3, tv.size());
	}
	
	

}
