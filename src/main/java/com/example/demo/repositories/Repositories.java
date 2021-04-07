package com.example.demo.repositories;

import com.example.demo.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Repositories extends JpaRepository<UserModel,Integer> {
}
