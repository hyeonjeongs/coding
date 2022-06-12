package com.technicalinterview.instagramclone.Repository;

import com.technicalinterview.instagramclone.Entity.Users;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface UserRepo extends CrudRepository<Users, Integer> { //<entity, primary key의 타입>
    Users save(Users user);

    Users findByUserId(String userId);

    ArrayList<Users> findAll();
}
