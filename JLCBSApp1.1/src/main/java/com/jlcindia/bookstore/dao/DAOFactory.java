package com.jlcindia.bookstore.dao;

public class DAOFactory { 
	 static UserDAO userDAO; 
	 static { 
	 userDAO = new UserDAOImpl(); 
	 } 
	 public static UserDAO getUserDAO() { 
	 return userDAO; 
	 } 
}

