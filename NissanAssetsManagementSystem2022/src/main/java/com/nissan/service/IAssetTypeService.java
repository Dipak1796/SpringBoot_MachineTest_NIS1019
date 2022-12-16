package com.nissan.service;

import java.util.List;

import com.nissan.model.AssetType;

public interface IAssetTypeService {
	
	//getAll Asset type
	public List<AssetType> getAllAssetType();
	
	//Add AssetType
	public AssetType addAssetType(AssetType assetType);
	
	//get by id
	public AssetType getByAsetTypeId(Integer atId);
	
	//update AssetType
	public AssetType updateAssetType(AssetType assettype);

	//delete Asset type
	public void deleteByAsetTypeId(Integer atId);
}
