package com.nissan.dao;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;
import com.nissan.model.AssetType;

@Repository
public interface IAssetTypeDAO extends JpaRepositoryImplementation<AssetType, Integer> {

}
