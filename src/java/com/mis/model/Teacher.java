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
public class Teacher implements Serializable{
    private String tno;
    private String tname;
    private String tsex;
    private String tpost;
    private String tdept;
    
    public Teacher(){ }

    public String getTno() {
        return tno;
    }

    public void setTno(String tno) {
        this.tno = tno;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public String getTsex() {
        return tsex;
    }

    public void setTsex(String tsex) {
        this.tsex = tsex;
    }

    public String getTpost() {
        return tpost;
    }

    public void setTpost(String tpost) {
        this.tpost = tpost;
    }

    public String getTdept() {
        return tdept;
    }

    public void setTdept(String tdept) {
        this.tdept = tdept;
    }
}
