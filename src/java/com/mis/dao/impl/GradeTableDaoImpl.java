/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mis.dao.impl;

import com.mis.dao.IGradeTableDao;
import com.mis.model.GradeTable;
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
public class GradeTableDaoImpl implements IGradeTableDao {

    Connection conn = null;
    PreparedStatement psmt = null;
    ResultSet rs = null;

    public List<GradeTable> getCourseGrade(Pagination pagination, String tno) {
        List<GradeTable> gradetable = new ArrayList<>();
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
            sql = "SELECT * FROM(SELECT ROWNUM NO,gradetable.* FROM "
                    + "(select student.sno,student.sname,course.*,sc.grade from student,sc,userd,course,tc where tc.tno=userd.userid and tno= ? and tc.cno = sc.cno and sc.cno = course.cno and sc.sno = student.sno) gradetable "
                    + "WHERE ROWNUM<=?) WHERE NO >=?";
            psmt = conn.prepareStatement(sql);
            psmt.setString(1, tno);
            psmt.setInt(2, end);
            psmt.setInt(3, start);
            rs = psmt.executeQuery();
            while (rs.next()) {
                GradeTable gtt = new GradeTable();
                gtt.setSno(rs.getString("sno"));
                gtt.setSname(rs.getString("sname"));
                gtt.setCno(rs.getString("cno"));
                gtt.setCname(rs.getString("cname"));
                gtt.setCcredit(rs.getInt("ccredit"));
                gtt.setGrade(rs.getInt("grade"));
                gradetable.add(gtt);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DatabaseBean.close(rs, psmt, conn);
        }
        return gradetable;
    }
}
