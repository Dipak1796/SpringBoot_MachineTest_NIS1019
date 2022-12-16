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

import com.nissan.model.Vendor;
import com.nissan.service.IVendorService;

@CrossOrigin
@RestController
@RequestMapping("api/")
public class VendorController {
	
	@Autowired
	IVendorService vendorservice;
	
	@GetMapping("vendors")
	public List<Vendor> getAllVendor(){
		return vendorservice.getAllVendor();
	}
	
	@GetMapping("vendors/{_vdId}")
	public Vendor getByVendorId(@PathVariable Integer _vdId)
	{
		return vendorservice.getByVendorId(_vdId);
	}
	
	
	@PostMapping("vendors")
	public Vendor addVendor(@RequestBody Vendor vendor) {
		return vendorservice.addVendor(vendor);
	}
	
	@PutMapping("vendors")
	public Vendor updateVendor(@RequestBody Vendor vendor) {
		return vendorservice.updateVendor(vendor);
	}
	
	@DeleteMapping("vendors/{_vdId}")
	public void deleteVendor(@PathVariable Integer _vdId) {
		vendorservice.deleteVendor(_vdId);
	}
	

}
