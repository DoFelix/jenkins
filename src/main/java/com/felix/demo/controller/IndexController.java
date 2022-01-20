package com.felix.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Description:
 * @author: ZhenYu Zhao
 * @date: 2022/1/20 11:03
 */
@Controller
public class IndexController {

    @RequestMapping("/hi")
    @ResponseBody
    public String sayHi(){

        return "hi world";
    }

    public static void main(String[] args) {

    }
}
