package com.techastute.blog;

public class SimpleDBService {

	public String simpleWelcomMessage(String name) throws Exception {
		if(name.equals("")) {
			throw new Exception("Empty Name");
		}
		return "Hello "+name+"!!";
	}
}
