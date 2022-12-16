package com.nissan.dao;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import com.nissan.model.User;

@Repository
public interface IUserDAO extends JpaRepositoryImplementation<User, Integer> {

}
