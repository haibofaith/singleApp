package com.faith.singleapp.controller;

import com.faith.singleapp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author:haibo.xiong
 * @date:2018/12/31
 * @description:
 */
@RestController
public class HelloController {
    @Value("${spring.application.name}")
    private String name;

    @RequestMapping("/hello")
    public String hello() {
        return name;
    }

    @Autowired
    private ProductService productService;

    @RequestMapping("/mysqlData")
    public ResponseEntity<Object> mysqlData() {
        return new ResponseEntity<>(productService.getList(), HttpStatus.OK);
    }
}
