/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mis.dao;

import com.mis.model.GradeTable;
import com.mis.util.Pagination;
import java.util.List;

/**
 *
 * @author 陈浩
 */
public interface IGradeTableDao {
    public List<GradeTable> getCourseGrade(Pagination pagination,String tno);
}
