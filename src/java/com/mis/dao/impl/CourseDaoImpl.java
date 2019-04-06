/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mis.dao.impl;

import com.mis.dao.ICourseDao;
import com.mis.model.Course;
import com.mis.model.SC;
import com.mis.model.TC;
import com.mis.model.Teacher;
import com.mis.util.DatabaseBean;
import com.mis.util.Pagination;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 陈浩
 */
public class CourseDaoImpl implements ICourseDao {
    Connection conn = null;
    PreparedStatement psmt = null;
    ResultSet rs = null;

    @Override
    public List<Course> getAllCourse(Pagination pagination) {
        List<Course> courses = new ArrayList<Course>();

        try {
            //统计总记录数
            conn = DatabaseBean.getConnection();
            String sql = "select count(*) as counts from course ";
            psmt = conn.prepareStatement(sql);
            rs = psmt.executeQuery();
            rs.next();
            pagination.setCountSize(rs.getInt("counts"));
            //求指定显示的记录数
            int perPage = pagination.getPageSize();
            int start = (pagination.getPageNo() - 1) * perPage + 1;
            int end = pagination.getPageNo() * perPage;
            //小于等于该页最大条数，大于等于该页最小条数
            sql = "SELECT * FROM(SELECT ROWNUM NO,s.* FROM "
                    + "(SELECT * FROM course ORDER BY cno ASC) s "
                    + "WHERE ROWNUM<=?) WHERE NO >=?";
            psmt = conn.prepareStatement(sql);
            psmt.setInt(1, end);
            psmt.setInt(2, start);
            rs = psmt.executeQuery();
            while (rs.next()) {
                Course cou = new Course();
                cou.setCno(rs.getString("cno"));
                cou.setCname(rs.getString("cname"));
                cou.setCcredit(rs.getInt("ccredit"));
                courses.add(cou);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DatabaseBean.close(rs, psmt, conn);
        }
        return courses;
    }

    /* public List<Course> getSomeCourse(Pagination pagination) {
        List<Course> courses = new ArrayList<Course>();

        try {
            //统计总记录数
            conn = DatabaseBean.getConnection();
            String sql = "select count(*) as counts from sc,userd where sc.sno=userd.userid ";
            psmt = conn.prepareStatement(sql);
            rs = psmt.executeQuery();
            rs.next();
            pagination.setCountSize(rs.getInt("counts"));
            //求指定显示的记录数
            int perPage = pagination.getPageSize();
            int start = (pagination.getPageNo() - 1) * perPage + 1;
            int end = pagination.getPageNo() * perPage;
            //小于等于该页最大条数，大于等于该页最小条数
            sql = "SELECT * FROM(SELECT ROWNUM NO,s.* FROM "
                    + "(select course.*,sc.grade,tc.classroom,teacher.tname from sc,userd,course,tc,teacher where sc.sno=userd.userid and sc.cno = course.cno and course.cno = tc.cno and tc.tno = teacher.tno ORDER BY cno ASC) s "
                    + "WHERE ROWNUM<=?) WHERE NO >=?";
            psmt = conn.prepareStatement(sql);
            psmt.setInt(1, end);
            psmt.setInt(2, start);
            rs = psmt.executeQuery();
            while (rs.next()) {
                Course cou = new Course();
                SC sc = new SC();
                TC tc = new TC();
                Teacher tea = new Teacher();
                cou.setCno(rs.getString("cno"));
                cou.setCname(rs.getString("cname"));
                cou.setCcredit(rs.getInt("ccredit"));
                sc.setGrade(rs.getInt("grade"));
                tc.setClassroom(rs.getString("classroom"));
                tea.setTname(rs.getString("tname"));            
                courses.add(cou);
                courses.add(sc);
                
                
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DatabaseBean.close(rs, psmt, conn);
        }
        return courses;
    }*/
    
    
    @Override
    public Course getCourse(String cno) {
        Course cou = null;
        try {
            conn = DatabaseBean.getConnection();
            String sql = "select * from course where cno=?";
            psmt = conn.prepareStatement(sql);
            psmt.setString(1, cno);
            rs = psmt.executeQuery();
            if (rs.next()) {
                cou = new Course();
                cou.setCno(rs.getString("cno"));
                cou.setCname(rs.getString("cname"));
                cou.setCcredit(rs.getInt("ccredit"));
          
            }
            return cou;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DatabaseBean.close(rs, psmt, conn);
        }
        return null;
    }

    @Override
    public boolean findCourse(String cno) {
        try {
            conn = DatabaseBean.getConnection();
            String sql = "select * from course where cno=?";
            psmt = conn.prepareStatement(sql);
            psmt.setString(1, cno);
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
    public boolean insertCourse(Course cou) {
        try {
            conn = DatabaseBean.getConnection();
            String sql = "insert into course(cno,cname,ccredit) values(?,?,?)";
            psmt = conn.prepareStatement(sql);
            psmt.setString(1, cou.getCno());
            psmt.setString(2, cou.getCname());
            psmt.setInt(3, cou.getCcredit());
        
            psmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DatabaseBean.close(rs, psmt, conn);
        }
        return false;
    }

    @Override
    public boolean updateCourse(Course cou) {
        try {
            String sql = "update course set cname = ?, ccredit = ? where cno=?";
            conn = DatabaseBean.getConnection();
            psmt = conn.prepareStatement(sql);
            psmt.setString(3, cou.getCno());
            psmt.setString(1, cou.getCname());
            psmt.setInt(2, cou.getCcredit());
                  
            psmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            DatabaseBean.close(rs, psmt, conn);
        }
        return false;
    }

    @Override
    public boolean deleteCourse(String cno) {
        try {
            conn = DatabaseBean.getConnection();
            String sql = "delete from course where cno=?";
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
