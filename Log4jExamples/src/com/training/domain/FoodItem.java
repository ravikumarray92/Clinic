package com.training.domain;

import org.apache.log4j.Logger;

public class FoodItem {
private int itemCode;
private String itemName;
private double ratePerUnit;
private boolean isVegetraian;
Logger log = Logger.getRootLogger();
@Override
public String toString() {
	return "FoodItem [itemCode=" + itemCode + ", itemName=" + itemName + ", ratePerUnit=" + ratePerUnit
			+ ", isVegetraian=" + isVegetraian + "]";
}
public FoodItem(int itemCode, String itemName, double ratePerUnit, boolean isVegetraian) {
	super();
	this.itemCode = itemCode;
	this.itemName = itemName;
	this.ratePerUnit = ratePerUnit;
	this.isVegetraian = isVegetraian;
	log.info("Food Item Done");
}

public int getItemCode() {
	return itemCode;
}
public void setItemCode(int itemCode) {
	this.itemCode = itemCode;
}
public String getItemName() {
	return itemName;
}
public void setItemName(String itemName) {
	this.itemName = itemName;
}
public double getRatePerUnit() {
	return ratePerUnit;
}
public void setRatePerUnit(double ratePerUnit) {
	this.ratePerUnit = ratePerUnit;
}
public boolean isVegetraian() {
	return isVegetraian;
}
public void setVegetraian(boolean isVegetraian) {
	this.isVegetraian = isVegetraian;
}

 
}
