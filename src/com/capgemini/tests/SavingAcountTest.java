package com.capgemini.tests;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.model.SavingAcount;

public class SavingAcountTest {
	
	SavingAcount acount1;
	SavingAcount acount2;
	SavingAcount acount3;
	SavingAcount acount4;
	SavingAcount acount5;

	@Before
	public void setUp() {
		acount1 = new SavingAcount("Abbas Pathan",1001,20000,true);
		acount2 = new SavingAcount("tony starc",1002,2000000,false);
		acount3 = new SavingAcount("peter parker",1003,2200000,true);
		acount4 = new SavingAcount("john doe",1004,250000,false);
		acount5 = new SavingAcount("ricky ponting",1005,300000,true);
		
	}

	@Test
	public void testSavingBankAcountWithIterator() {
		ArrayList<SavingAcount> acounts = new ArrayList<>();
		acounts.add(acount1);
		acounts.add(acount2);
		acounts.add(acount3);
		acounts.add(acount4);
		acounts.add(acount5);
		
		Iterator<SavingAcount> iterator = acounts.iterator();
		
		assertEquals(acount1, iterator.next());
		assertEquals(5, acounts.size());
	
	}
	
	public void testSavingBankAcountWithTreeSet() {
		TreeSet<SavingAcount> acounts = new TreeSet<>();
		acounts.add(acount1);
		acounts.add(acount2);
		acounts.add(acount3);
		acounts.add(acount4);
		acounts.add(acount5);
		
		Iterator<SavingAcount> iterator = acounts.iterator();
		assertEquals("Abbas Pathan", iterator.next().getAcountHolderName());
	}

}
