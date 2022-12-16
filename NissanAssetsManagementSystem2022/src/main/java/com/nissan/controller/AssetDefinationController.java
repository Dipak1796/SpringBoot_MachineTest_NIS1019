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
import com.nissan.model.AssetDefination;
import com.nissan.service.IAssetDefinationService;

@CrossOrigin
@RestController
@RequestMapping("api/")
public class AssetDefinationController {
	
	@Autowired
	IAssetDefinationService assetDefService;
	
	@GetMapping("assetdefinations")
	public List<AssetDefination> getAllAssetDefination(){
		return assetDefService.getAllAssetDefination();
	}
	
	@GetMapping("assetdefinations/{_adId}")
	public AssetDefination getByAssetDefId(@PathVariable Integer id)
	{
		return assetDefService.findByAssetDefId(id);
	}
	
	@PostMapping("assetdefinations")
	public AssetDefination addAssetDefination(@RequestBody AssetDefination assetdef)
	{
		return assetDefService.addAssetDefination(assetdef);
	}
	
	@PutMapping("assetdefinations")
	public AssetDefination updateAssetDefination(@RequestBody AssetDefination astDef) {
		return assetDefService.updateAssetdefination(astDef);
	}
	
	@DeleteMapping("assetdefinations/{_adId}")
	public void deleteAssetDefination(@PathVariable Integer id) {
		assetDefService.deleteAssetDEfination(id);
	}

}
