package com.training.domain;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
	private List<FoodItem> items;
	FoodItem food1 = null;
	FoodItem food2 = null;
	FoodItem food3 = null;
	public Restaurant(){
		           items = new ArrayList<FoodItem>();
		           food1 = new FoodItem(1,"Paneer",100,true);
		           food2 = new FoodItem(2,"Chicken",200,false);
		           food3 = new FoodItem(3,"Cup Cakes",400,false);
		           init();
	}
	public void init(){
		items.add(food1);
		items.add(food2);
		items.add(food3);
	}
	public List<FoodItem> getItems(String type)
	{
		 //System.out.println(items.get(i).getItemCode());
		return items;
	}
public List<FoodItem> getMenuCard(){
	int size = items.size();

	for(int i = 0; i < size; i++) {
        System.out.println(items.get(i).getItemCode()+"\t"+items.get(i).getItemName()+"\t"+items.get(i).getRatePerUnit()+"\t"+items.get(i).isVegetraian());
  	  
}
	return items;
}
}
