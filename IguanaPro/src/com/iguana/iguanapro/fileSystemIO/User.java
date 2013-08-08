package com.iguana.iguanapro.fileSystemIO;

public class User implements java.io.Serializable{
	
	
	private String userName;
	private String[] friends;
	//add an image from pandora
	
	public User()
	{
		userName = "Default";
		friends = null;
	}
	
	public User(String _userName)
	{
		userName = _userName;
		friends = null;
	}
	
	public User(String _userName, String[] _friends)
	{
		userName = _userName;
		friends = _friends;
	}
	
	public String getUser(){ return userName;}
	public String[] getFriends(){return friends;}
}
