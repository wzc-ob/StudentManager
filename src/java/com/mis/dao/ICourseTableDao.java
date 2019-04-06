/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mis.dao;

import com.mis.model.CourseTable;
import com.mis.util.Pagination;
import java.util.List;

/**
 *
 * @author 陈浩
 */
public interface ICourseTableDao {
    public List<CourseTable> getStuCourse(Pagination pagination,String sno);
    public List<CourseTable> getUnStuCourse(Pagination pagination,String sno);
    public List<CourseTable> getTeaCourse(Pagination pagination,String tno);
    
}
