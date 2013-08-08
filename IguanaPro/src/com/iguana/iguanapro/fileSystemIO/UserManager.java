package com.iguana.iguanapro.fileSystemIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class UserManager implements java.io.Serializable {
	
	private ArrayList <User>users;
	
	public UserManager()
	{
		users = null;
	}
	
	public UserManager(ArrayList _users)
	{
		users = _users;
	}
		
	public boolean addUser(User _user)
	{
		int i = users.size();
		users.add(_user);
		if(users.size() > i) 
		  return true;
	    else
	      return false;
	}
	
	public boolean addUser(String _user )
	{
		int i = users.size();
		users.add(new User(_user));
		if(users.size() > i) 
		  return true;
	    else
	      return false;
	}
	
	public boolean removeUser(int _index)
	{
		int i = users.size();
		users.remove(_index);
		if(users.size() < i) 
		  return true;
	    else
	      return false;
	}
	
	public boolean removeUser(String _userName)
	{
		int i = users.size();
		users.remove(new User(_userName));
		if(users.size() < i) 
		  return true;
	    else
	      return false;
	}
	
	public boolean removeAllUsers()
	{
		users = null;
		return true;
	}
	
	public String[] getFriends(User _user)
	{
		if( _user != null && users.contains(_user))
		 return users.get(users.indexOf(_user)).getFriends();
		else
		return null;
	} 
	
	public void loadUser()
	{
		try {
		  //create new file if no file exists in METADATA dir
			File f = new File("/metadata/metadata.ig");
			if(f.exists())
			{
				FileInputStream fetch = new FileInputStream(f);
				ObjectInputStream OIS = new ObjectInputStream(fetch);
				users = (ArrayList)OIS.readObject(); //cast object
			}
			else
			 System.out.println("No Data Available!");
			
		}catch(Exception e){e.printStackTrace();}
	}
	
	public void saveUserData()
	{
		try{
		  FileOutputStream f = new FileOutputStream("/metadata/metadata.ig");		  
		  ObjectOutputStream OOS = new ObjectOutputStream(f);
		  OOS.writeObject(users);
		}catch(java.io.IOException e){e.printStackTrace();}		
	}
	
	public boolean isEmpty()
	{
		if( users.size() <= 0)
			return true;
		else
			return false;
	}
}
