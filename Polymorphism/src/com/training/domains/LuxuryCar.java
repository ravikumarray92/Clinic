package com.training.domains;

import com.training.ifaces.Automobiles;

public class LuxuryCar implements Automobiles {

	@Override
	public String getColor() {
	return "White";
	}
    @Override
	public double getPrice() {
	return 200000.00;
	}

	@Override
	public String getModel() {
	return "Jaguar-5";
	}
	}