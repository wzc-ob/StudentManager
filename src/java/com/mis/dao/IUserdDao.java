/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mis.dao;

import com.mis.model.Userd;

/**
 *
 * @author 陈浩
 */
public interface IUserdDao {
    public String getUserd(String userid);
     Userd find(String userid,String passwordr,String utype);

}
