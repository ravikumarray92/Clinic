package com.training.apps;

import org.apache.log4j.Logger;

import com.training.domain.Restaurant;

public class Application {
public static void main(String [] cmd){
	Logger log = Logger.getRootLogger();
	log.info("Starting Application");
	Restaurant obj = new Restaurant();
	obj.getMenuCard();
	log.info("Done bye.....");
}
}
