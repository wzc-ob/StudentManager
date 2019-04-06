/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mis.dao.impl;

import com.mis.dao.IUserdDao;
import com.mis.model.Userd;
import com.mis.util.DatabaseBean;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.io.IOException;
/**
 *
 * @author 陈浩
 */
public class UserdDaoImpl implements IUserdDao{
    
    Connection conn = null;
    PreparedStatement psmt = null;
    ResultSet rs = null;
    
    public String getUserd(String userid){
        try{
            conn = DatabaseBean.getConnection();
            String sql = "select userid from userd where userid=? ";
            psmt = conn.prepareStatement(sql);
            psmt.setString(1, userid);      
            rs = psmt.executeQuery();
            if (rs.next()) {
               rs.getString("userid");
            }
            return userid;
        }catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DatabaseBean.close(rs, psmt, conn);
        }
        return null;  
    }
    
    public Userd find(String userid,String passwordr,String utype){
         Userd userd = null;
        try{
            conn = DatabaseBean.getConnection();
            String sql = "select * from userd where userid=? and passwordr=? and utype=?";
            psmt = conn.prepareStatement(sql);
            psmt.setString(1, userid);
            psmt.setString(2,passwordr);
            psmt.setString(3, utype);
            rs = psmt.executeQuery();
            if (rs.next()) {
                userd = new Userd();
                userd.setUserid(rs.getString("userid"));
                userd.setPasswordr(rs.getString("passwordr"));
                userd.setUtype(rs.getString("utype"));
            }
            return userd;
        }catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DatabaseBean.close(rs, psmt, conn);
        }
        return null; 
    }
}
