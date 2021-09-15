package com.info.beans;

public class Users implements Observer {

	private String name;
	
	
	public Users(String name) {
		super();
		this.name = name;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public void recieveAndroidUpdate(String androidVersion, Users users) {
		System.out.println(users.getName()+",you have recieved the latest verison of android====>"+androidVersion);
	}
}
