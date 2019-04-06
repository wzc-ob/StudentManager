/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mis.dao.impl;

import com.mis.dao.ITeacherDao;
import com.mis.model.Teacher;
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
public class TeacherDaoImpl implements ITeacherDao {
    Connection conn = null;
    PreparedStatement psmt = null;
    ResultSet rs = null;

    @Override
    public Teacher getTeacher(String tno) {
        Teacher tea = null;
        try {
            conn = DatabaseBean.getConnection();
            String sql = "select teacher.tno,teacher.tname,teacher.tsex,teacher.tpost,teacher.tdept from teacher inner join userd on teacher.tno = userd.userid where tno=?";
            psmt = conn.prepareStatement(sql);
            psmt.setString(1, tno);
            rs = psmt.executeQuery();
            if (rs.next()) {
                tea = new Teacher();
                tea.setTno(rs.getString("tno"));
                tea.setTname(rs.getString("tname"));
                tea.setTsex(rs.getString("tsex"));
                tea.setTpost(rs.getString("tpost"));
                tea.setTdept(rs.getString("tdept"));     
            }
            return tea;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DatabaseBean.close(rs, psmt, conn);
        }
        return null;
    }
    
    public Teacher findedTeacher(String tno){
         Teacher tea = null;
        try {
            conn = DatabaseBean.getConnection();
            String sql = "select * from teacher where tno=?";
            psmt = conn.prepareStatement(sql);
            psmt.setString(1, tno);
            rs = psmt.executeQuery();
            if (rs.next()) {
                tea = new Teacher();
                tea.setTno(rs.getString("Tno"));
                tea.setTname(rs.getString("Tname"));
                tea.setTsex(rs.getString("Tsex"));
                tea.setTpost(rs.getString("Tpost"));
                tea.setTdept(rs.getString("Tdept"));
               
            }
            return tea;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DatabaseBean.close(rs, psmt, conn);
        }
        return null;
    }

    @Override
    public boolean findTeacher(String tno) {
          try {
            conn = DatabaseBean.getConnection();
            String sql = "select * from teacher where tno=?";
            psmt = conn.prepareStatement(sql);
            psmt.setString(1, tno);
            rs = psmt.executeQuery();
            while (rs.next()) {             
                return true;              
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            DatabaseBean.close(rs, psmt, conn);
        }
        return false;
    }

    @Override
    public boolean updateTeacher(Teacher tea) {
        try{
                conn = DatabaseBean.getConnection();
                String sql = "update teacher set tname=?,tsex=?,tpost=?,tdept=? where tno=?";
                psmt = conn.prepareStatement(sql);
                psmt.setString(1, tea.getTname());
                psmt.setString(2, tea.getTsex());
                psmt.setString(3, tea.getTpost());
                psmt.setString(4, tea.getTdept());
                psmt.setString(5, tea.getTno());
            psmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }finally {
            DatabaseBean.close(null, psmt, conn);
        }
        return false;
    }
}
