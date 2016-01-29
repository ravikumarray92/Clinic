package com.training.domains;

import com.training.ifaces.Automobiles;

public class SportsCar implements Automobiles {

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return "Black";
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 10000000.00;
	}

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return "BMW-7";
	}

}
