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
	    	return "改变一下是否有冲突";
	    }
        Student student = new Student();
        student.setSex("nannnnnnn");
        student.setDepartment("运维");
        student.setName("xdclass-wiggin");

        student.setBirth(new Date());
		List<> list=new ArrayList();
		//添加代码再次自造冲突
        String sss="sdfsadf";
        return student;
    }
}
