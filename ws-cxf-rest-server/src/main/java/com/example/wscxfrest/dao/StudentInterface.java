package com.example.wscxfrest.dao;

import com.example.wscxfrest.entity.Student;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Title: StudentInterface
 * Description: TODO
 *
 * @author hfl
 * @version V1.0
 * @date 2020-05-01
 */
@Path("/Student")
public interface StudentInterface {

    //指定请求方式，如果服务端发布的时候指定的是GET（POST），那么客户端访问时必须使用GET（POST
    @GET
    //指定服务数据类型，可以是XML，json等数据类型
    @Produces(MediaType.APPLICATION_XML)
    //@Path("/query/{id}")指定该方法的路径，“{id}”指参数，多个参数，以“/”隔开，放到“{}”中
    @Path("/query/{id}")
    Student queryStudent(@PathParam("id") int id);

    @GET
    @Produces(MediaType.APPLICATION_XML)
    //@Path("/query/{id}")指定该方法的路径，“{id}”指
    @Path("/queryList/{name}")
    List<Student> queryList(@PathParam("name") String name);

}
