/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mis.tag;

import java.io.IOException;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 *
 * @author 陈浩
 */
public class TeaDepartListTag extends SimpleTagSupport{
    public static final String[] TEACHER_TDEPT = {"计算机系", "自动化系", "电子信息系","信息计算机系","数学计算机系"};
    private String tdept;

    public String getTdept() {
        return tdept;
    }

    public void setTdept(String tdept) {
        this.tdept = tdept;
    }

    @Override
    public void doTag() throws JspException, IOException {
        JspWriter out = getJspContext().getOut();
        StringBuilder str = new StringBuilder();
        str.append("<select class=\"input\" name=\"tdept\" id=\"tdept\" data-validate=\"required:请选择教师系部\">");
        str.append("<option value=\"\">请选择教师系部</option>");
        for (String t : TEACHER_TDEPT) {
            if (t.equals(tdept)) {
                str.append("<option value='").append(t).append("' selected>").append(t).append("</option>");
            } else {
                str.append("<option value='").append(t).append("'>").append(t).append("</option>");
            }
        }
        str.append("</select>");
        out.print(str.toString());
    }
}
