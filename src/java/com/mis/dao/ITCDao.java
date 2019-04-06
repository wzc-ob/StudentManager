/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mis.dao;

import com.mis.model.TC;

/**
 *
 * @author 陈浩
 */
public interface ITCDao {
    public boolean insertTC(String cno,String classroom);
    public boolean deleteTC(String cno);  
}
