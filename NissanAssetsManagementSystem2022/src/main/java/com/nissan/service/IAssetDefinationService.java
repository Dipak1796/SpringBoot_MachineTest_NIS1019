package com.nissan.service;

import java.util.List;

import com.nissan.model.AssetDefination;

public interface IAssetDefinationService {
	
	//getAll Asset definition
	public List<AssetDefination> getAllAssetDefination();
	
	//add Asset Definition
	public AssetDefination addAssetDefination(AssetDefination assetDef);
	
	//find by assetdefination id
	public AssetDefination findByAssetDefId(Integer adId);
	
	//Update AssetDefination
	public AssetDefination updateAssetdefination(AssetDefination astDef);
	
	//delete AssetDefination By id
	public void deleteAssetDEfination(Integer adId);

}
