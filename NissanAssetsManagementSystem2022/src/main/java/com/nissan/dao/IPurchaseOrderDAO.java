package com.nissan.dao;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import com.nissan.model.PurchaseOrder;
@Repository
public interface IPurchaseOrderDAO extends JpaRepositoryImplementation<PurchaseOrder, Integer> {

}
