package com.sec.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by xuchun on 2017/5/2.
 */
@Controller
@RequestMapping("/index")
public class IndexController {

    @RequestMapping("/home")
    public String index(){
        return "index";
    }
}
