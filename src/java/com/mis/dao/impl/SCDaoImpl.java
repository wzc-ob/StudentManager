/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mis.dao.impl;

import com.mis.dao.ISCDao;
import com.mis.model.SC;
import com.mis.util.DatabaseBean;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author 陈浩
 */
public class SCDaoImpl implements ISCDao {

    Connection conn = null;
    PreparedStatement psmt = null;
    ResultSet rs = null;
    
    public SC getSC(String sno,String cno) {
        SC sc = null;
        try {
            conn = DatabaseBean.getConnection();
            String sql = "select * from sc where sno=? and cno = ?";
            psmt = conn.prepareStatement(sql);
            psmt.setString(1, sno);
            psmt.setString(2, cno);
            rs = psmt.executeQuery();
            if (rs.next()) {
                sc = new SC();
                sc.setSno(rs.getString("sno"));
                sc.setCno(rs.getString("cno"));
            
                sc.setGrade(rs.getInt("grade"));
     
            }
            return sc;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DatabaseBean.close(rs, psmt, conn);
        }
        return null;
        
    }

    public boolean insertSC(String sno,String cno) {
        try {
            conn = DatabaseBean.getConnection();      
                String sql = "insert into sc(sno,cno,grade) values(?,?,null)";
                
                psmt = conn.prepareStatement(sql);
                psmt.setString(1, sno);
                psmt.setString(2, cno);
                    
            psmt.executeUpdate();
            return true;
        }catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DatabaseBean.close(rs, psmt, conn);
        }
        return false;

    }

    public boolean deleteSC(String cno) {
        try {
            conn = DatabaseBean.getConnection();
            String sql = "delete from sc where cno=?";
            psmt = conn.prepareStatement(sql);
            psmt.setString(1, cno);
            psmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DatabaseBean.close(rs, psmt, conn);
        }
        return false;
    }
    
    public boolean updateSC(SC sc){
         try {
            conn = DatabaseBean.getConnection();        
                String sql = "update sc set grade=? where sno=? and cno = ?";
                psmt = conn.prepareStatement(sql);
                psmt.setInt(1, sc.getGrade());
                psmt.setString(2, sc.getSno());
                psmt.setString(3, sc.getCno());               
            psmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            DatabaseBean.close(null, psmt, conn);
        }
        return false;
    }
}
