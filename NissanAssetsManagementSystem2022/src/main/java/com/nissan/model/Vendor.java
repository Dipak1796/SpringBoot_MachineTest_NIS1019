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
@Table(name="tblvendor")
public class Vendor {

	//Instance Variable
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer vdId;
	private String vdName;
	private String vdType;
	
	private Integer atId;
	@JoinColumn(name="atId",insertable=false,updatable=false)
	@ManyToOne
	private AssetType assettype;
	
	private LocalDate vdFrom;
	private LocalDate vdTo;
	private String address;
	
	//Getter and Setter
	public Integer getVdId() {
		return vdId;
	}
	public void setVdId(Integer vdId) {
		this.vdId = vdId;
	}
	public String getVdName() {
		return vdName;
	}
	public void setVdName(String vdName) {
		this.vdName = vdName;
	}
	public String getVdType() {
		return vdType;
	}
	public void setVdType(String vdType) {
		this.vdType = vdType;
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
	public LocalDate getVdFrom() {
		return vdFrom;
	}
	public void setVdFrom(LocalDate vdFrom) {
		this.vdFrom = vdFrom;
	}
	public LocalDate getVdTo() {
		return vdTo;
	}
	public void setVdTo(LocalDate vdTo) {
		this.vdTo = vdTo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
