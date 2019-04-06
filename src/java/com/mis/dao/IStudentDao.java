/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mis.dao;

import com.mis.model.Student;
import com.mis.util.Pagination;
import java.util.List;

/**
 *
 * @author 陈浩
 */
public interface IStudentDao {
    public List<Student> getAllStudent(Pagination pagination);
    public Student getStudent(String sno);
    public Student findStudente(String sno);
    public boolean findStudent(String sno);
    public boolean insertStudent(Student stu);
    public boolean deleteStudent(String sno);  
    public boolean updateStudent(Student stu);
   
}
