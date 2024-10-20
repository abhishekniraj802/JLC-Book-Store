package com.jlcindia.bookstore.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/*
 * @Author : Srinivas Dande
 * @Company : Java Learning Center
 */

public class JdbcTemplate {

    // Update() method for performing Update, Insert, or Delete operations
    public static int update(String SQL, Object... params) {
        System.out.println("JdbcTemplate - update()");
        Connection con = null;
        PreparedStatement ps = null;
        int result = 0;
        try {
            con = DataSourceUtil.getConnection();
            ps = con.prepareStatement(SQL);
            for (int i = 0; i < params.length; i++) {
                ps.setObject(i + 1, params[i]);
            }
            result = ps.executeUpdate();
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            DataSourceUtil.cleanUp(ps, con);
        }
        return result;
    }

    // Method for Select operations that return 0 or 1 record
    public static Object queryForObject(String SQL, RowMapper rowMapper, Object... params) {
        System.out.println("JdbcTemplate - queryForObject()");
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Object obj = null;
        try {
            con = DataSourceUtil.getConnection();
            ps = con.prepareStatement(SQL);
            for (int i = 0; i < params.length; i++) {
                ps.setObject(i + 1, params[i]);
            }
            rs = ps.executeQuery();
            if (rs.next()) {
                obj = rowMapper.mapRow(rs);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            DataSourceUtil.cleanUp(rs, ps, con);
        }
        return obj;
    }

    // Method for Select operations that return 0 or many records
    public static List<Object> queryForList(String SQL, RowMapper rowMapper, Object... params) {
        System.out.println("JdbcTemplate - queryForList()");
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        List<Object> list = new ArrayList<>();
        try {
            con = DataSourceUtil.getConnection();
            ps = con.prepareStatement(SQL);
            for (int i = 0; i < params.length; i++) {
                ps.setObject(i + 1, params[i]);
            }
            rs = ps.executeQuery();
            while (rs.next()) {
                Object obj = rowMapper.mapRow(rs);
                list.add(obj);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            DataSourceUtil.cleanUp(rs, ps, con);
        }
        return list;
    }
}
