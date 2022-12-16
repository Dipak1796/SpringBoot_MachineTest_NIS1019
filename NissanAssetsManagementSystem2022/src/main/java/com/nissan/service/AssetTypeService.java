package com.nissan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nissan.dao.IAssetTypeDAO;
import com.nissan.model.AssetType;

@Service
public class AssetTypeService implements IAssetTypeService {

	@Autowired
	IAssetTypeDAO assetTypeDao;
	
	@Override
	public List<AssetType> getAllAssetType() {
		return assetTypeDao.findAll();
	}

	@Override
	public AssetType addAssetType(AssetType assetType) {
		return assetTypeDao.save(assetType);
	}

	@Override
	public AssetType getByAsetTypeId(Integer atId) {
		return assetTypeDao.findById(atId).get();
	}

	@Override
	public AssetType updateAssetType(AssetType assettype) {
		return assetTypeDao.save(assettype);
	}

	@Override
	public void deleteByAsetTypeId(Integer atId) {
		assetTypeDao.deleteById(atId);
	}

}
