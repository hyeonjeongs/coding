package com.technicalinterview.instagramclone.Service;

import com.technicalinterview.instagramclone.Entity.Status;
import com.technicalinterview.instagramclone.Repository.StatusRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class StatusService {

    private final StatusRepo statusRepo;

    @Autowired
    public StatusService(StatusRepo statusRepo) {
        this.statusRepo = statusRepo;
    }

    public Status submitDataIntoDB(Status status){
        return statusRepo.save(status);
    }

    public ArrayList<Status> retrieveStatus(){
        return statusRepo.findAll();
    }
}
