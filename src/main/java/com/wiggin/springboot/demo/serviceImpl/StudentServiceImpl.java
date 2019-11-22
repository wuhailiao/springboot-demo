package com.wiggin.springboot.demo.serviceImpl;

import com.wiggin.springboot.demo.dao.StudentMapper;
import com.wiggin.springboot.demo.model.Student;
import com.wiggin.springboot.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * copyright 2015-2020
 *
 * @author wiggin
 * @date 2017/9/26 22:43
 * @Description: 接口方法实现
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public Student queryById(int id) {
	    if(true){
	    	return true;
	    }
        Student student = new Student();
        student.setSex("女");
        student.setDepartment("运维");
        student.setName("xdclass-wiggin");
sdfsdfasdfsdfsdfsfsdf
        student.setBirth(new Date());
		List<Student> list=new ArrayList();
        return student;
    }
}
