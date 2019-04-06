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
public class GradeTable implements Serializable{
     private String sno;
     private String sname;
     private String cno;
     private String cname;
     private int ccredit;
     private int grade;

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

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

}
