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
public class Userd implements Serializable{
     private static final long serialVersionUID = -4313782718477229465L;
    
    private String userid;
    private String passwordr;
    private String utype;
    
    public Userd(){ }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getPasswordr() {
        return passwordr;
    }

    public void setPasswordr(String passwordr) {
        this.passwordr = passwordr;
    }

    public String getUtype() {
        return utype;
    }

    public void setUtype(String utype) {
        this.utype = utype;
    }
}
