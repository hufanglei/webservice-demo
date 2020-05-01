package com.example.wscxfrest.entity;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

/**
 * Title: Student
 * Description: TODO
 *
 * @author hfl
 * @version V1.0
 * @date 2020-05-01
 */
//可以实现XML和对象之间的转换，name属性指定根元素
@XmlRootElement(name="student")
public class Student {
    private int id;
    private String name;
    private Date birthday;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Date getBirthday() {
        return birthday;
    }
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

}
