package com.nissan.service;

import java.util.List;

import com.nissan.model.Vendor;

public interface IVendorService {
	
	//Get All Vendor
	public List<Vendor> getAllVendor();
	
	//Get By Vendor Id
	public Vendor getByVendorId(Integer id);
	
	//Add Vendor
	public Vendor addVendor(Vendor vendor);
	
	//update Vendor
	public Vendor updateVendor(Vendor vendor);
	
	//Delete Vendor
	public void deleteVendor(Integer id);

}
