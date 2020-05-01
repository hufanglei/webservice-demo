package com.example.wscxfrest.impl;

import com.example.wscxfrest.dao.StudentInterface;
import com.example.wscxfrest.entity.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Title: StudentInterfaceImpl
 * Description: TODO
 *
 * @author hfl
 * @version V1.0
 * @date 2020-05-01
 */
@Service
public class StudentInterfaceImpl implements StudentInterface {
    @Override
    public Student queryStudent(int id) {
        Student s = new Student();
        s.setId(666);
        s.setName("张三");
        s.setBirthday(new Date());
        return s;
    }

    @Override
    public List<Student> queryList(String name) {
        Student s = new Student();
        s.setId(666);
        s.setName("张三");
        s.setBirthday(new Date());

        Student s2 = new Student();
        s2.setId(888);
        s2.setName("李四");
        s2.setBirthday(new Date());

        List<Student> l = new ArrayList<Student>();
        l.add(s);
        l.add(s2);
        return l;
    }
}
