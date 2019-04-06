/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mis.service.impl;

import com.mis.dao.IUserdDao;
import com.mis.dao.impl.UserdDaoImpl;
import com.mis.model.Userd;
import com.mis.service.IUserdService;

/**
 *
 * @author 陈浩
 */
public class UserdServiceImpl implements IUserdService{
    private IUserdDao userdDao = new UserdDaoImpl();
    
    public Userd loginUserd(String userid,String passwordr,String utype){
       return userdDao.find(userid, passwordr, utype);
    }
    
}
