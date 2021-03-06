/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.academi.dao.impl;

import com.leapfrog.academi.constant.SQLConstant;
import com.leapfrog.academi.entity.Course;
import com.leapfrog.academi.entity.dao.CourseDAO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

/**
 *
 * @author amar
 */
@Repository (value="CourseDAO")
public class CourseDAOImpl implements CourseDAO {
    
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Course> getALL() throws SQLException {
     return  jdbcTemplate.query(SQLConstant.COURSE_GETALL,new RowMapper<Course>() {

         @Override
         public Course mapRow(ResultSet rs, int i) throws SQLException {
            
            return mapData(rs);
         }
     });
    }

    @Override
    public int insert(Course c) throws SQLException {
        return jdbcTemplate.update(SQLConstant.COURSE_INSERT,new Object[]{c.getName(),c.getDescription(),c.getDuration(),c.getDuration_Type(),c.getFees(),c.getStatus()});
      
    }
    
    private Course mapData(ResultSet rs)throws SQLException{
               Course course=new Course();      
               course.setId(rs.getInt("id"));
               course.setName(rs.getString("name"));
               course.setDescription(rs.getString("description"));
               course.setDuration(rs.getInt("duration"));
               course.setDuration_Type(rs.getString("duration_type"));
               course.setFees(rs.getDouble("fees"));
               course.setAddedDate(rs.getDate("added_date"));
               course.setModifiedDate(rs.getDate("modified_date"));
               course.setDeletedDate(rs.getDate("delete_date"));
               course.setDeletedFlag(rs.getBoolean("delete_flag"));
               course.setStatus(rs.getBoolean("status"));
               
            return course;
        
    }
    @Override
    public int update(Course c) throws SQLException {
        return jdbcTemplate.update(SQLConstant.COURSE_UPDATE,new Object[]{c.getName(),c.getDescription(),c.getDuration(),c.getDuration_Type(),c.getFees(),c.getStatus(),c.getModifiedDate(),c.getId()});
    }

    @Override
    public int delete(int id) throws SQLException {
       return jdbcTemplate.update(SQLConstant.COURSE_DELETE,new Object[]{id});
    }

    @Override
    public Course getById(int id) throws SQLException {
        return (Course)jdbcTemplate.queryForObject(SQLConstant.COURSE_GETById,new Object[]{id},new RowMapper<Course>() {

            @Override
            public Course mapRow(ResultSet rs, int i) throws SQLException {
                return mapData(rs);
            }
        });
    }
    
}
