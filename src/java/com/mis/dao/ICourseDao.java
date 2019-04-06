/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mis.dao;

import com.mis.model.Course;
import com.mis.util.Pagination;
import java.util.List;

/**
 *
 * @author 陈浩
 */
public interface ICourseDao {
    public List<Course> getAllCourse(Pagination pagination);
   // public List<Course> getSomeCourse(Pagination pagination);
    public Course getCourse(String cno);
    public boolean findCourse(String cno);
    public boolean insertCourse(Course cou);
    public boolean updateCourse(Course cou);
    public boolean deleteCourse(String cno);   
}
