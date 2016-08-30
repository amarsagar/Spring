/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.academi.entity;

import java.util.Date;

/**
 *
 * @author amar
 */
public class Course {
     
    private int id;
    private String name,description;
    private int duration;
    private String duration_Type;
    private double fees;
    private Date addedDate,modifiedDate,deletedDate;
    private boolean deletedFlag,status;

    public Course() {
    }

    public Course(int id, String name, String description, int duration, String duration_Type, double fees, boolean status) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.duration = duration;
        this.duration_Type = duration_Type;
        this.fees = fees;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getDuration_Type() {
        return duration_Type;
    }

    public void setDuration_Type(String duration_Type) {
        this.duration_Type = duration_Type;
    }

    public double getFees() {
        return fees;
    }

    public void setFees(double fees) {
        this.fees = fees;
    }

    public Date getAddedDate() {
        return addedDate;
    }

    public void setAddedDate(Date addedDate) {
        this.addedDate = addedDate;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public Date getDeletedDate() {
        return deletedDate;
    }

    public void setDeletedDate(Date deletedDate) {
        this.deletedDate = deletedDate;
    }

    public boolean isDeletedFlag() {
        return deletedFlag;
    }

    public void setDeletedFlag(boolean deletedFlag) {
        this.deletedFlag = deletedFlag;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Course{" + "id=" + id + ", name=" + name + ", description=" + description + ", duration=" + duration + ", duration_Type=" + duration_Type + ", fees=" + fees + ", addedDate=" + addedDate + ", modifiedDate=" + modifiedDate + ", deletedDate=" + deletedDate + ", deletedFlag=" + deletedFlag + ", status=" + status + '}';
    }

    
    
}