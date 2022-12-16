package com.nissan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nissan.model.AssetType;
import com.nissan.service.IAssetTypeService;

@CrossOrigin
@RestController
@RequestMapping("api/")
public class AssetTypeController {
	
	@Autowired
	IAssetTypeService assetTypeService;
	
	@GetMapping("assettypes")
	public List<AssetType> getAllAssetType(){
		return assetTypeService.getAllAssetType();
	}
	
	@PostMapping("assettypes")
	public AssetType addAssetType(AssetType assettype) {
		return assetTypeService.addAssetType(assettype);
	}
	
	@GetMapping("assettypes/{_atId}")
	public AssetType getByAssetid(@PathVariable Integer id) {
		return assetTypeService.getByAsetTypeId(id);
	}
	
	@DeleteMapping("assettypes/{_atId}")
	public void deleteAssetType(@PathVariable Integer id) {
		assetTypeService.deleteByAsetTypeId(id);
	}
	
	@PutMapping("assettypes")
	public AssetType updateAssetType(@RequestBody AssetType assetype) {
		return assetTypeService.updateAssetType(assetype);
	}

}
