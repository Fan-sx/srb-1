package com.fsx;

import com.fsx.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class Demo01 {

    @Autowired
    UserMapper userMapper;

    @Test
    public void test(){
        System.out.println(userMapper.selectList(null));
    }
}
