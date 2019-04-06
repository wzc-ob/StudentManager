/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mis.util;

import com.mis.dao.ICourseDao;
import com.mis.dao.ICourseTableDao;
import com.mis.dao.IGradeTableDao;
import com.mis.dao.ISCDao;
import com.mis.dao.IStudentDao;
import com.mis.dao.ITCDao;
import com.mis.dao.ITeacherDao;
import com.mis.dao.IUserdDao;
import com.mis.dao.impl.CourseDaoImpl;
import com.mis.dao.impl.CourseTableDaoImpl;
import com.mis.dao.impl.GradeTableDaoImpl;
import com.mis.dao.impl.SCDaoImpl;
import com.mis.dao.impl.StudentDaoImpl;
import com.mis.dao.impl.TCDaoImpl;
import com.mis.dao.impl.TeacherDaoImpl;
import com.mis.dao.impl.UserdDaoImpl;

/**
 *
 * @author 陈浩
 */
public class DaoFactory {

    public static IStudentDao getStudentDao() {
        return new StudentDaoImpl();
    }

    public static ITeacherDao getTeacherDao() {
        return new TeacherDaoImpl();
    }

    public static ICourseDao getCourseDao() {
        return new CourseDaoImpl();
    }

    public static ICourseTableDao getCourseTableDao() {
        return new CourseTableDaoImpl();
    }

    public static IGradeTableDao getGradeTableDao() {
        return new GradeTableDaoImpl();
    }
    public static ISCDao getSCDao() {
        return new SCDaoImpl();
    }

    public static ITCDao getTCDao() {
        return new TCDaoImpl();
    }
    public static IUserdDao getUserdDao() {
        return new UserdDaoImpl();
    }
}
