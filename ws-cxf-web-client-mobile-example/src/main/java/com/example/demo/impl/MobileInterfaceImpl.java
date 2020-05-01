package com.example.demo.impl;

import com.cad.mobile.MobileCodeWSSoap;
import com.example.demo.dao.MobileInterface;
import org.springframework.stereotype.Service;

/**
 * Title: MobileInterfaceImpl
 * Description: TODO
 *
 * @author hfl
 * @version V1.0
 * @date 2020-05-01
 */
@Service("mobileServer")
public class MobileInterfaceImpl implements MobileInterface {

    //公网客户端，提供set方法 以便注入
    private MobileCodeWSSoap mobileClient;

    @Override
    public String queryMobile(String phoneNum) {
        return mobileClient.getMobileCodeInfo(phoneNum, "");
    }

    public MobileCodeWSSoap getMobileClient() {
        return mobileClient;
    }

    public void setMobileClient(MobileCodeWSSoap mobileClient) {
        this.mobileClient = mobileClient;
    }
}
