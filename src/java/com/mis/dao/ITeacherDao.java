/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mis.dao;

import com.mis.model.Teacher;

/**
 *
 * @author 陈浩
 */
public interface ITeacherDao {
    public Teacher getTeacher(String tno);
    public Teacher findedTeacher(String tno);
    public boolean findTeacher(String tno);
    public boolean updateTeacher(Teacher tea);
}
