package com.example.wscxfrest.server;

import com.example.wscxfrest.impl.StudentInterfaceImpl;
import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;

/**
 * Title: StudentServer
 * Description: TODO
 *
 * @author hfl
 * @version V1.0
 * @date 2020-05-01
 *
 * 访问地址
 * 访问query方法
 *     http://127.0.0.1:12345/Class/Student/query/001
 * 访问queryList方法
 *     http://127.0.0.1:12345/Class/Student/queryList/xxx
 */
public class StudentServer {

    public static void main(String[] args) {
        JAXRSServerFactoryBean jaxrsServerFactoryBean=new JAXRSServerFactoryBean();
        //设置服务实现类
        jaxrsServerFactoryBean.setServiceBean(new StudentInterfaceImpl());
        //设置资源类，如果有多个资源类，可以以“,”隔开，例如Student.class StudentInterface.class都是资源类，但是StudentInterfaceImpl里面已经包含了Student.class StudentInterface.class，所以不用重复指定
        jaxrsServerFactoryBean.setResourceClasses(StudentInterfaceImpl.class);

        //设置服务地址
        jaxrsServerFactoryBean.setAddress("http://127.0.0.1:12345/Class");
        //发布服务
        jaxrsServerFactoryBean.create();

    }

}
