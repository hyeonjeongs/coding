package com.technicalinterview.instagramclone.Repository;

import com.technicalinterview.instagramclone.Entity.Status;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
@ComponentScan(basePackages = "com.technicalinterview.instagramclone")
@Repository
public interface StatusRepo extends CrudRepository<Status, Long> {

    Status save(Status save);
    ArrayList<Status> findAll();

}
