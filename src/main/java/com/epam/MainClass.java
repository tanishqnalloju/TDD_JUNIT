package com.epam;

public class MainClass {
	
	public String remove(String s)
	{
		String result=null;
		if(s=="")
			return "";
		if(s.charAt(0)=='A' && s.charAt(1)=='A')
		{
			result=s.substring(2,s.length());
		}
		else if(s.charAt(0)=='A')
		{
			result=s.substring(0,0)+s.substring(1,s.length());
		}
		else if(s.charAt(1)=='A')
		{
			result=s.substring(0,1)+s.substring(2,s.length());
		}
		else
		{
			result=s;
		}
		return(result);
	}

}
