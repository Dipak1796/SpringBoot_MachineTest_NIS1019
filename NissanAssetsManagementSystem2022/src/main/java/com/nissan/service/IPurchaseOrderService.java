package com.nissan.service;

import java.util.List;

import com.nissan.model.PurchaseOrder;

public interface IPurchaseOrderService {
	
	//Get All Purchase Order
	public List<PurchaseOrder> getAllPurchaseOrder();
	
	//Save Purchase Order
	public PurchaseOrder addPurchaseOrder(PurchaseOrder purchaseorder);

}
