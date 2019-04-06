/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mis.dao.impl;

import com.mis.dao.ITCDao;
import com.mis.model.TC;
import com.mis.util.DatabaseBean;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author 陈浩
 */
public class TCDaoImpl implements ITCDao {

    Connection conn = null;
    PreparedStatement psmt = null;
    ResultSet rs = null;

    public boolean insertTC(String cno,String classroom) {
        try {
            conn = DatabaseBean.getConnection();
            String sql = "insert into tc(cno,classroom) values(?,?) where tc.tno = ?";
            psmt = conn.prepareStatement(sql);
            
            psmt.setString(1, cno);
            psmt.setString(2, classroom);
        
            psmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DatabaseBean.close(rs, psmt, conn);
        }
        return false;

    }

    public boolean deleteTC(String cno) {
        try {
            conn = DatabaseBean.getConnection();
            String sql = "delete from tc where cno=?";
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
}
