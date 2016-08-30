/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.academi.service;

import com.leapfrog.academi.entity.Course;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author amar
 */
public interface CourseService {
        List<Course> getALL()throws SQLException;
    int insert (Course c) throws SQLException;
    int update (Course c) throws SQLException;
    int delete (int id) throws SQLException;
    Course getById (int id) throws SQLException;
    
}
