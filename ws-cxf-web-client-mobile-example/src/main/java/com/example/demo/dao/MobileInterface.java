package com.example.demo.dao;

import javax.jws.WebService;

/**
 * Title: MobileInterface
 * Description: TODO
 *
 * @author hfl
 * @version V1.0
 * @date 2020-05-01
 */
@WebService
public interface MobileInterface {
    String  queryMobile(String phoneNum);
}
