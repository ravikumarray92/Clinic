package com.training.apps;

public class ExceptioHandling_Example1 {

	public static void main(String[] args) {
		String name = null;
		int len = 0;
    try{
    	
    System.out.println(args [0]);
    System.out.println(name.length());
//    int len = name.length();
    len = name.length();
	}catch(ArrayIndexOutOfBoundsException e)
    {
	 System.out.println("Use Run Config-To Enter Command Line argument");	
    }
    catch(NullPointerException e){
    	System.out.println("Check Attribute Name - It may be Null");
    }
    System.out.println(len);
	}
}
