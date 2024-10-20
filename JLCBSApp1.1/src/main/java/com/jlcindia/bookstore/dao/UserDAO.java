package com.jlcindia.bookstore.dao;

import com.jlcindia.bookstore.to.UserTO; 


public interface UserDAO { 
	public int registerUser(UserTO userTO); 
	public UserTO verifyUser(String username,String password); 
	public String getPassword(String email); 
	public int changePassword(int userId,String newPassword); 
	public UserTO getUserByUserId(int userId) ; 
	public int updateProfile(UserTO userTO); 
}

