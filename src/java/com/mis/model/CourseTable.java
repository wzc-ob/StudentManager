/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mis.model;

import java.io.Serializable;

/**
 *
 * @author 陈浩
 */
public class CourseTable implements Serializable{
     private String cno;
     private String cname;
     private int ccredit;
     private int grade;
     private String classroom;
     private String tname;

    public String getCno() {
        return cno;
    }

    public void setCno(String cno) {
        this.cno = cno;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public int getCcredit() {
        return ccredit;
    }

    public void setCcredit(int ccredit) {
        this.ccredit = ccredit;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }
     
}
