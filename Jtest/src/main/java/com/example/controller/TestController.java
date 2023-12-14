package com.example.controller;

import com.example.mapper.PersonMapper;
import com.example.pojo.Person;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class TestController {
    @Resource
    private PersonMapper personMapper;

    @RequestMapping("selectAll")
    @ResponseBody
    //查询全部
    public List<Person> selectAll() {
        List<Person> personList =  personMapper.selectPerson();
        return personList;
    }
}
