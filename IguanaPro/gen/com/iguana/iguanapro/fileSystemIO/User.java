package com.iguana.iguanapro.fileSystemIO;

public class User implements java.io.Serializable{
	
	
	private String userName;
	private String[] friends;
	//add an image from pandora
	
	public User()
	{
		
	}
	
	public User(String _userName)
	{
		userName = _userName;
	}
	
	public User(String[] _friends)
	{
		
	}
	
	public String getUser(){ return userName;}
	public String[] getFriends(){return friends;}
}
