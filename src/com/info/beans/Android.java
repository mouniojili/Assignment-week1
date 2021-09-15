package com.info.beans;

import java.util.ArrayList;
import java.util.List;

public class Android implements Subject {

	
   private 	List<Users> androidUsersList = new ArrayList<>();
   
   @Override
public void addUser(Users user) {
	   androidUsersList.add(user);
   }
   
   @Override
public void removeUser(Observer users) {
	   androidUsersList.remove(users);
   }
   
   @Override
public void sendAndroidUpdate(String version) {
	   for(Users users : androidUsersList) {
		   users.recieveAndroidUpdate(version, users);
	   }
   }
   
   
}
