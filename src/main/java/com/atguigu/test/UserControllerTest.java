package com.atguigu.test;

import com.atguigu.pojo.User;
import com.atguigu.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.bind.annotation.ResponseBody;
import sun.reflect.generics.scope.Scope;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserControllerTest {

    @Autowired
    private UserService userService;

    @Test
    public void testFindAll(){
        List<User> users = userService.findAll();
        System.err.println(users);
    }
}
