package com.technicalinterview.instagramclone.Entity;

import org.springframework.context.annotation.ComponentScan;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Timestamp;

public class Status {
    @Id
    @GeneratedValue
    private int id;

    private String statusId;
    private String userId;
    private String path;
    private Timestamp timestamp;

    public Status(int id, String statusId, String userId, String path, Timestamp timestamp) {
        this.id = id;
        this.statusId = statusId;
        this.userId = userId;
        this.path = path;
        this.timestamp = timestamp;
    }

    public Status() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStatusId() {
        return statusId;
    }

    public void setStatusId(String statusId) {
        this.statusId = statusId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }
}
