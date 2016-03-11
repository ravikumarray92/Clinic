package com.training.domains;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.training.domains.LuxuryCar;
import com.training.domains.PassengerCar;
import com.training.domains.ShowRoom;
import com.training.domains.SportsCar;

import com.training.ifaces.Automobiles;

public class TestShowRoom {

	
	ShowRoom sr;
	@Before
	public void setUp() throws Exception {
		
		sr = new ShowRoom();
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testReturnTypeofGetItem() {
		
		Automobiles auto;
		auto = sr.getItem(2);
		assertTrue(auto instanceof Automobiles);
		
			
	}
  
	@Test
	public void testGetItemCase1()
	{
		Automobiles auto;
		auto = sr.getItem(1);
		assertTrue(auto instanceof PassengerCar);
		
		
	}
	
	@Test
	public void testGetItemCase2()
	{
		Automobiles auto;
		auto = sr.getItem(2);
		assertTrue(auto instanceof LuxuryCar);
		
		
	}
	
	@Test
	public void testGetItemCase3()
	{
		Automobiles auto;
		auto = sr.getItem(3);
		assertTrue(auto instanceof SportsCar);
		
		
	}
	
	@Test
	public void testGetItemCaseDefault()
	{
		Automobiles auto;
		auto = sr.getItem(4);
		assertEquals(null,auto);
		
		
	}
	
	
	
	
}