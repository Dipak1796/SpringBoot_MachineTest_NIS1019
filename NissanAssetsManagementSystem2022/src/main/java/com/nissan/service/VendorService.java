package com.nissan.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nissan.dao.IVendorDAO;
import com.nissan.model.Vendor;

@Service
public class VendorService implements IVendorService {

	@Autowired
	IVendorDAO vendordao;
	
	@Override
	public List<Vendor> getAllVendor() {
		
		return vendordao.findAll();
	}

	@Override
	public Vendor getByVendorId(Integer id) {
		
		return vendordao.findById(id).get();
	}

	@Override
	public Vendor addVendor(Vendor vendor) {
		
		return vendordao.save(vendor);
	}

	@Override
	public Vendor updateVendor(Vendor vendor) {
		
		return vendordao.save(vendor);
	}

	@Override
	public void deleteVendor(Integer id) {
		vendordao.deleteById(id);

	}

}
