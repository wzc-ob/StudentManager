/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mis.dao.impl;

import com.mis.dao.ICourseTableDao;
import com.mis.model.CourseTable;
import com.mis.util.DatabaseBean;
import com.mis.util.Pagination;
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
public class CourseTableDaoImpl implements ICourseTableDao {

    Connection conn = null;
    PreparedStatement psmt = null;
    ResultSet rs = null;

    @Override
    public List<CourseTable> getStuCourse(Pagination pagination, String sno) {
        List<CourseTable> coursetable = new ArrayList<>();

        try {
            //统计总记录数
            conn = DatabaseBean.getConnection();
            String sql = "select count(*) as counts from sc inner join userd on sc.sno=userd.userid and sno=? ";
            psmt = conn.prepareStatement(sql);
            psmt.setString(1, sno);
            rs = psmt.executeQuery();
            rs.next();

            pagination.setCountSize(rs.getInt("counts"));
            System.out.print(rs.getInt("counts"));
            //求指定显示的记录数
            int perPage = pagination.getPageSize();
            int start = (pagination.getPageNo() - 1) * perPage + 1;
            int end = pagination.getPageNo() * perPage;
            //小于等于该页最大条数，大于等于该页最小条数
            sql = "SELECT * FROM(SELECT ROWNUM NO,coursetable.* FROM "
                    + "(select course.*,sc.grade,tc.classroom,teacher.tname from sc,userd,course,tc,teacher where sc.sno=userd.userid and sno= ? and sc.cno = course.cno and course.cno = tc.cno and tc.tno = teacher.tno ) coursetable "
                    + "WHERE ROWNUM<=?) WHERE NO >=?";

            psmt = conn.prepareStatement(sql);
            psmt.setString(1, sno);
            psmt.setInt(2, end);
            psmt.setInt(3, start);

            rs = psmt.executeQuery();
            while (rs.next()) {
                CourseTable ct = new CourseTable();
                ct.setCno(rs.getString("cno"));
                ct.setCname(rs.getString("cname"));
                ct.setCcredit(rs.getInt("ccredit"));
                ct.setGrade(rs.getInt("grade"));
                ct.setClassroom(rs.getString("classroom"));
                ct.setTname(rs.getString("tname"));
                coursetable.add(ct);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DatabaseBean.close(rs, psmt, conn);
        }
        return coursetable;
    }

    @Override
    public List<CourseTable> getUnStuCourse(Pagination pagination, String sno) {
        List<CourseTable> coursetable = new ArrayList<CourseTable>();

        try {
            //统计总记录数
            conn = DatabaseBean.getConnection();
            String sql = "select count(*) as counts from course where cno not in (select sc.cno from sc,userd where sc.sno = userd.userid and sno =?) ";
            psmt = conn.prepareStatement(sql);
            psmt.setString(1, sno);
            rs = psmt.executeQuery();
            rs.next();
            pagination.setCountSize(rs.getInt("counts"));
            //求指定显示的记录数
            int perPage = pagination.getPageSize();
            int start = (pagination.getPageNo() - 1) * perPage + 1;
            int end = pagination.getPageNo() * perPage;
            //小于等于该页最大条数，大于等于该页最小条数
            sql = "SELECT * FROM(SELECT ROWNUM NO,coursetable.* FROM "
                    + "(select course.*,tc.classroom,teacher.tname from course,tc,teacher where course.cno not in (select sc.cno from sc,userd where sc.sno = userd.userid and sno =?) and course.cno = tc.cno and tc.tno = teacher.tno ) coursetable "
                    + "WHERE ROWNUM<=?) WHERE NO >=?";

            psmt = conn.prepareStatement(sql);
            psmt.setString(1, sno);
            psmt.setInt(2, end);
            psmt.setInt(3, start);

            rs = psmt.executeQuery();
            while (rs.next()) {
                CourseTable ct = new CourseTable();
                ct.setCno(rs.getString("cno"));
                ct.setCname(rs.getString("cname"));
                ct.setCcredit(rs.getInt("ccredit"));
                ct.setClassroom(rs.getString("classroom"));
                ct.setTname(rs.getString("tname"));
                coursetable.add(ct);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DatabaseBean.close(rs, psmt, conn);
        }
        return coursetable;
    }

    public List<CourseTable> getTeaCourse(Pagination pagination, String tno) {
        List<CourseTable> coursetable = new ArrayList<>();
        try {
            //统计总记录数
            conn = DatabaseBean.getConnection();
            String sql = "select count(*) as counts from tc inner join userd on tc.tno=userd.userid and tno=? ";
            psmt = conn.prepareStatement(sql);
            psmt.setString(1, tno);
            rs = psmt.executeQuery();
            rs.next();
            pagination.setCountSize(rs.getInt("counts"));
            System.out.print(rs.getInt("counts"));
            //求指定显示的记录数
            int perPage = pagination.getPageSize();
            int start = (pagination.getPageNo() - 1) * perPage + 1;
            int end = pagination.getPageNo() * perPage;
            //小于等于该页最大条数，大于等于该页最小条数
            sql = "SELECT * FROM(SELECT ROWNUM NO,coursetable.* FROM "
                    + "(select course.*,tc.classroom,teacher.tname from userd,course,tc,teacher where tc.tno=userd.userid and tc.tno=? and tc.cno = course.cno  and tc.tno = teacher.tno ) coursetable "
                    + "WHERE ROWNUM<=?) WHERE NO >=?";
            psmt = conn.prepareStatement(sql);
            psmt.setString(1, tno);
            psmt.setInt(2, end);
            psmt.setInt(3, start);
            rs = psmt.executeQuery();
            while (rs.next()) {
                CourseTable ct = new CourseTable();
                ct.setCno(rs.getString("cno"));
                ct.setCname(rs.getString("cname"));
                ct.setCcredit(rs.getInt("ccredit"));
                ct.setClassroom(rs.getString("classroom"));
                ct.setTname(rs.getString("tname"));
                coursetable.add(ct);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DatabaseBean.close(rs, psmt, conn);
        }
        return coursetable;
    }

    public List<CourseTable> getCourseGrade(Pagination pagination, String tno) {
        List<CourseTable> coursetable = new ArrayList<>();
        try {
            //统计总记录数
            conn = DatabaseBean.getConnection();
            String sql = "select count(*) as counts from (tc inner join userd on tc.tno=userd.userid and tno=? ) inner join sc on tc.cno = sc.cno ";
            psmt = conn.prepareStatement(sql);
            psmt.setString(1, tno);
            rs = psmt.executeQuery();
            rs.next();
            pagination.setCountSize(rs.getInt("counts"));
            System.out.print(rs.getInt("counts"));
            //求指定显示的记录数
            int perPage = pagination.getPageSize();
            int start = (pagination.getPageNo() - 1) * perPage + 1;
            int end = pagination.getPageNo() * perPage;
            //小于等于该页最大条数，大于等于该页最小条数
            sql = "SELECT * FROM(SELECT ROWNUM NO,coursetable.* FROM "
                    + "(select course.*,sc.grade,tc.classroom,teacher.tname from sc,userd,course,tc,teacher where tc.tno=userd.userid and tno= ? and tc.cno = sc.cno and course.cno = tc.cno and tc.tno = teacher.tno) coursetable "
                    + "WHERE ROWNUM<=?) WHERE NO >=?";
            psmt = conn.prepareStatement(sql);
            psmt.setString(1, tno);
            psmt.setInt(2, end);
            psmt.setInt(3, start);
            rs = psmt.executeQuery();
            while (rs.next()) {
                CourseTable ct = new CourseTable();
                ct.setCno(rs.getString("cno"));
                ct.setCname(rs.getString("cname"));
                ct.setCcredit(rs.getInt("ccredit"));
                ct.setClassroom(rs.getString("classroom"));
                ct.setTname(rs.getString("tname"));
                coursetable.add(ct);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DatabaseBean.close(rs, psmt, conn);
        }
        return coursetable;
    }

}
