/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mis.service;

import com.mis.model.Userd;

/**
 *
 * @author 陈浩
 */
public interface IUserdService {
    Userd loginUserd(String userid,String passwordr,String utype);
}
