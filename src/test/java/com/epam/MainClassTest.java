package com.epam;

import junit.framework.TestCase;


public class MainClassTest extends TestCase{

	MainClass m=new MainClass();
	
	public void test1() 
	{
		assertEquals("BCD",m.remove("AABCD"));
	}
	public void test2()
	{
		assertEquals("DUDE",m.remove("ADUDE"));	
	}
	public void test3()
	{
		assertEquals("ZXYA",m.remove("ZXYA"));	
	}	
	public void test4() 
	{
		assertEquals("BCD",m.remove("BACD"));	
	}
	public void test5()
	{
		assertEquals("",m.remove(""));	

	}
}
