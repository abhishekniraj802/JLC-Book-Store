package com.jlcindia.bookstore.dao;

import com.jlcindia.bookstore.to.UserTO;
import com.jlcindia.bookstore.util.JdbcTemplate;

public class UserDAOImpl implements UserDAO {

    @Override
    public int registerUser(UserTO userTO) {
        System.out.println("UserDAO - registerUser()");
        String SQL = "insert into myusers(fullName, email, phone, dob, gender, username, password, status) " +
                     "values(?,?,?,?,?,?,?,?)";
        int x = JdbcTemplate.update(SQL, userTO.getFullName(), userTO.getEmail(), userTO.getPhone(),
                                    userTO.getDob(), userTO.getGender(), userTO.getUsername(),
                                    userTO.getPassword(), userTO.getStatus());
        return x;
    }

    @Override
    public UserTO verifyUser(String username, String password) {
        System.out.println("UserDAO - verifyUser()");
        String SQL = "select * from myusers where username=? and password=?";
        Object obj = JdbcTemplate.queryForObject(SQL, new UserRowMapper(), username, password);
        UserTO userTO = (UserTO) obj;
        System.out.println(userTO);
        return userTO;
    }

    @Override
    public String getPassword(String email) {
        String SQL = "select * from myusers where email=?";
        UserTO userTO = (UserTO) JdbcTemplate.queryForObject(SQL, new UserRowMapper(), email);
        return userTO.getPassword();
    }

    @Override
    public int changePassword(int userId, String newPassword) {
        String SQL = "update myusers set password=? where userId=?";
        int x = JdbcTemplate.update(SQL, newPassword, userId);
        return x;
    }

    @Override
    public UserTO getUserByUserId(int userId) {
        String SQL = "select * from myusers where userId=?";
        UserTO userTO = (UserTO) JdbcTemplate.queryForObject(SQL, new UserRowMapper(), userId);
        return userTO;
    }

    @Override
    public int updateProfile(UserTO userTO) {
        String SQL = "update myusers set fullName=?, email=?, phone=? where userId=?";
        int x = JdbcTemplate.update(SQL, userTO.getFullName(), userTO.getEmail(), 
                                    userTO.getPhone(), userTO.getUserId());
        return x;
    }
}
