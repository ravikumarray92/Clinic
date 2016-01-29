package com.training.apps;
import java.util.Scanner;

import com.training.domains.NewShowRoom;
//import com.training.domains.ShowRoom;
import com.training.ifaces.Automobiles;
public class Application {
	public static void main(String [] args){
		NewShowRoom showRoom = new NewShowRoom();
	Automobiles polyAuto = null;
	Scanner sc = new Scanner(System.in);
	int key;
	do{
	System.out.println("Enter the key value");
	System.out.println("1 : Luxury Car");
	System.out.println("2 : Passenger Car");
	System.out.println("3 : Sports Car");
    System.out.println("4 : Sports Bike");
    System.out.println("5 : Exit");
    key = Integer.parseInt(sc.next());
    if(key != 5){
	polyAuto = showRoom.getItem(key);
    showRoom.printQuote(polyAuto);}
	}
	while(key != 5);
	sc.close();
	}
	
}
