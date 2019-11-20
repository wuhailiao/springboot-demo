package com.wiggin.springboot.demo.controller;

import com.wiggin.springboot.demo.model.Student;
import com.wiggin.springboot.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
asfsd
/**
 * copyright 2015-2020
 *
 * @author wiggin
 * @date 2017/9/26 22:48
 * @Description: 控制器
 */
@Controller
public class StudentController {

    @Autowired
    private StudentService service;
asdfsdff
    @RequestMapping(value = "/qryById")
    public Student qry(int id){
   //再次志超冲突
    System.out.println("修改123");
        return service.queryById(id);
    }
}
