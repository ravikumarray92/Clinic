package com.training.domains;

import com.training.ifaces.Automobiles;

public class LuxuryCar implements Automobiles {

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return "White";
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 200000.00;
	}

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return "Jaguar-5";
	}

}
