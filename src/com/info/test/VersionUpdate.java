package com.info.test;

import com.info.beans.Android;
import com.info.beans.Subject;
import com.info.beans.Users;

public class VersionUpdate {

	
	public static void main(String[] args) {
		
		Subject android = new Android();
		
		Users u1 = new Users("Anil");
		Users u2 = new Users("Ashok");
		Users u3 = new Users("Ankit");
		Users u4 = new Users("Arul raj");
		Users u5 = new Users("Praveen ");

		android.addUser(u1);
		android.addUser(u2);
		android.addUser(u3);
		android.addUser(u4);
		android.addUser(u5);

		android.sendAndroidUpdate("Pie");
		
	}
}
