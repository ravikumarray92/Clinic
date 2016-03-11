package com.training.apps;

public class ExceptionHandling_Example2 {
	public static void main(String [] args){
		try{String name = null;
			String age ="Fourty";
			System.out.println(name.length());
			int age2 = Integer.parseInt(age);
			
			System.out.println(++age2);
		}catch(NumberFormatException | NullPointerException e){
			if (e instanceof NumberFormatException){
				System.out.println(e.getMessage()+ "Age should be integer value.");
			}
			else
			{
				System.out.println(e.getMessage());
		    }
		
		}
	}

}
