package com.example.springboottemplate;

import com.example.entity.User;
import com.example.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
public class MBTest {

    @Autowired
    private UserService userService;

    @Test
    public void testCount() {
        System.out.println(userService.count());
    }

    @Test
    public void testInsert() {
        boolean b = userService.save(new User(null,"carl",21,"123@qq.com"));
        System.out.println(b);
    }
}
