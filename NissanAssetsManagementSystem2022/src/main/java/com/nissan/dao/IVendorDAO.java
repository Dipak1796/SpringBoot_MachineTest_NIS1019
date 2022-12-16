package com.nissan.dao;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import com.nissan.model.Vendor;

@Repository
public interface IVendorDAO extends JpaRepositoryImplementation<Vendor, Integer> {

}
