package com.example.demo.controller;

import com.example.demo.dao.MobileInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Title: TestController
 * Description: TODO
 *
 * @author hfl
 * @version V1.0
 * @date 2020-05-01
 */
@Controller
public class TestController {

    @Autowired
    private MobileInterface mobileInterface;

    @GetMapping("/")
    public String index(Model model) {
        return "index";
    }

    @GetMapping("/query")
    @ResponseBody
    public String query(String  phoneNum) {
        String s = mobileInterface.queryMobile(phoneNum);
        System.out.println(s);
        return s;
    }

}
