package com.example;

import com.example.mapper.UserMapper;
import com.example.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Tests {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void contextLoads() {
//        UserExample example = new UserExample();
//        List<User> list = userMapper.selectByExample(example);
//        for (User u : list) {
//            System.out.println(u.getUsername());
//        }
        List<User> list = userMapper.selectAll();
        for (User u : list) {
            System.out.println(u.getUsername());
        }
    }
}

