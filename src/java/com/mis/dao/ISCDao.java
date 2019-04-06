/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mis.dao;

import com.mis.model.SC;

/**
 *
 * @author 陈浩
 */
public interface ISCDao {
    public SC getSC(String sno,String cno);
    public boolean insertSC(String sno,String cno);
    public boolean deleteSC(String cno);  
    public boolean updateSC(SC sc);
}
