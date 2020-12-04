package com.example.demo.controller;

import com.example.demo.entity.ResponseBean;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/test")
@RestController
public class HelloWorldController {

    @GetMapping("/hello")
    @ResponseBody
    public  ResponseBean hello(@RequestParam(value = "param",required = false)String param){
       ResponseBean responseBean =new ResponseBean(200,param+":访问成功！");

        return responseBean;
    }
}
