package com.nissan.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="tblpurchaseorder")
public class PurchaseOrder {
	//Instance variable
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer pdId;
	private String pdOrderNo;
	private Integer adId;
	@JoinColumn(name="adId",insertable=false,updatable=false)
	@ManyToOne
	private AssetDefination assetdef;
	
	private Integer atId;
	@JoinColumn(name="atId",insertable=false,updatable=false)
	@ManyToOne
	private AssetType assettype;
	private Integer qnt;
	private Integer vdId;
	@JoinColumn(name="vdId",insertable=false,updatable=false)
	@ManyToOne
	private Vendor vendor;
	
	private LocalDate pdOrderDate;
	private LocalDate pdDeliveryDate;
	private String status;
	
	//Getter and Setter
	public Integer getPdId() {
		return pdId;
	}
	public void setPdId(Integer pdId) {
		this.pdId = pdId;
	}
	public String getPdOrderNo() {
		return pdOrderNo;
	}
	public void setPdOrderNo(String pdOrderNo) {
		this.pdOrderNo = pdOrderNo;
	}
	public Integer getAdId() {
		return adId;
	}
	public void setAdId(Integer adId) {
		this.adId = adId;
	}
	public AssetDefination getAssetdef() {
		return assetdef;
	}
	public void setAssetdef(AssetDefination assetdef) {
		this.assetdef = assetdef;
	}
	public Integer getAtId() {
		return atId;
	}
	public void setAtId(Integer atId) {
		this.atId = atId;
	}
	public AssetType getAssettype() {
		return assettype;
	}
	public void setAssettype(AssetType assettype) {
		this.assettype = assettype;
	}
	public Integer getQnt() {
		return qnt;
	}
	public void setQnt(Integer qnt) {
		this.qnt = qnt;
	}
	public Integer getVdId() {
		return vdId;
	}
	public void setVdId(Integer vdId) {
		this.vdId = vdId;
	}
	public Vendor getVendor() {
		return vendor;
	}
	public void setVendor(Vendor vendor) {
		this.vendor = vendor;
	}
	public LocalDate getPdOrderDate() {
		return pdOrderDate;
	}
	public void setPdOrderDate(LocalDate pdOrderDate) {
		this.pdOrderDate = pdOrderDate;
	}
	public LocalDate getPdDeliveryDate() {
		return pdDeliveryDate;
	}
	public void setPdDeliveryDate(LocalDate pdDeliveryDate) {
		this.pdDeliveryDate = pdDeliveryDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	

}
