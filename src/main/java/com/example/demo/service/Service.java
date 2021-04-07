package com.example.demo.service;

import com.example.demo.model.ResultModel;
import com.example.demo.model.UserModel;

import java.util.List;

public interface Service {

    UserModel saveUser(UserModel model);
    UserModel selectUser(Integer id);
    List<UserModel> allUser();
    UserModel updateUser(UserModel model);
    ResultModel deleteUser(Integer id);
}
