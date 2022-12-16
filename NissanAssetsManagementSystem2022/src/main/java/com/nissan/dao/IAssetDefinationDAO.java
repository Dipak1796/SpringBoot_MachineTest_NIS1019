package com.nissan.dao;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import com.nissan.model.AssetDefination;

@Repository
public interface IAssetDefinationDAO extends JpaRepositoryImplementation<AssetDefination, Integer> {

}
