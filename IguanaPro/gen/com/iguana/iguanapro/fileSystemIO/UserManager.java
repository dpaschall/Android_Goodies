package com.iguana.iguanapro.fileSystemIO;

public class UserManager implements java.io.Serializable {
	
	private User users[];
	
	public UserManager()
	{
		
	}
	
	public UserManager(User[] _users)
	{
		users = _users;
	}
		
	public boolean addUser(User _user)
	{
		return false;
	}
	
	public boolean addUser(String _user )
	{
		return false;
	}
	
	public boolean removeUser(int _index)
	{
		return false;
	}
	
	public boolean removeUser(String _userName)
	{
		return false;
	}
	
	public boolean removeAllUsers()
	{
		return false;
	}
	
	
	
	
	

}
