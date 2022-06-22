package com.technicalinterview.instagramclone.Repository;

import com.technicalinterview.instagramclone.Entity.Users;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends CrudRepository<Users, Integer> { //<entity, primary key의 타입>
    Users save(Users user);
    Users findByUserId(String userId);


}
