package com.example.demo.service;

import com.example.demo.model.ResultModel;
import com.example.demo.model.UserModel;
import com.example.demo.repositories.Repositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImplementationService implements com.example.demo.service.Service {

    @Autowired
    private Repositories repositories;
    @Autowired
    private UserModel model;
    @Autowired
    private ResultModel result;

    @Override
    public UserModel saveUser(UserModel model) {
        this.model = repositories.save(model);
        return this.model;
    }

    @Override
    public UserModel selectUser(Integer id) {
        this.model = repositories.getOne(id);
        return this.model;
    }

    @Override
    public List<UserModel> allUser() {
        return repositories.findAll();
    }

    @Override
    public UserModel updateUser(UserModel model) {
        this.model = repositories.save(model);
        return this.model;
    }

    @Override
    public ResultModel deleteUser(Integer id) {
        repositories.deleteById(id);
        result.setSuccess("User Successfully Deleted");
        return result;
    }
}
