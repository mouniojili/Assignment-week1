package com.info.beans;

public interface Subject {

	void addUser(Users user);

	void removeUser(Observer users);

	void sendAndroidUpdate(String version);

}