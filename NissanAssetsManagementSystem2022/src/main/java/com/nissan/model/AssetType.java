package com.nissan.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="tblassettype")
public class AssetType {
	//instance variable
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer atId;
	private String atName;
	
	@OneToMany(mappedBy="assetType",cascade=CascadeType.ALL)
	private List<AssetDefination> assetDef;
	
	//getter and Setters
	public Integer getAtId() {
		return atId;
	}
	public void setAtId(Integer atId) {
		this.atId = atId;
	}
	public String getAtName() {
		return atName;
	}
	public void setAtName(String atName) {
		this.atName = atName;
	}
	@JsonManagedReference
	public List<AssetDefination> getAssetDef() {
		return assetDef;
	}
	public void setAssetDef(List<AssetDefination> assetDef) {
		this.assetDef = assetDef;
	}
	
	
	

}
