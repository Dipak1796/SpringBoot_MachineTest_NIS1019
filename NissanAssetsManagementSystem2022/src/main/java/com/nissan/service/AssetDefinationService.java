package com.nissan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nissan.dao.IAssetDefinationDAO;
import com.nissan.model.AssetDefination;

@Service
public class AssetDefinationService implements IAssetDefinationService {

	@Autowired
	IAssetDefinationDAO assetDefDao;
	
	
	@Override
	public List<AssetDefination> getAllAssetDefination() {
		return assetDefDao.findAll();
	}

	@Override
	public AssetDefination addAssetDefination(AssetDefination assetDef) {
		return assetDefDao.save(assetDef);
	}

	@Override
	public AssetDefination findByAssetDefId(Integer adId) {
		
		return assetDefDao.findById(adId).get();
	}

	@Override
	public AssetDefination updateAssetdefination(AssetDefination astDef) {
		
		return assetDefDao.save(astDef);
	}

	@Override
	public void deleteAssetDEfination(Integer adId) {
		assetDefDao.deleteById(adId);
		
	}

}
