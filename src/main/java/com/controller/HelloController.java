package com.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Zhou YingTao
 * @Date: 2019/3/28
 * @Description:
 */
@RestController
public class HelloController {

    @ResponseBody
    @RequestMapping(value = "getMethod", method = RequestMethod.GET)
    public String getMethod(Integer id) {
        System.out.println("dfdsfsd"+id);
        return "dfdfd";
    }
}
