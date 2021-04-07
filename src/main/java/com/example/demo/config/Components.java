package com.example.demo.config;

import com.example.demo.model.ResultModel;
import com.example.demo.model.UserModel;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Components {
    @Bean
    public UserModel userModel(){
        return new UserModel();
    }

    @Bean
    public ResultModel errorModel(){
        return new ResultModel();
    }
}
