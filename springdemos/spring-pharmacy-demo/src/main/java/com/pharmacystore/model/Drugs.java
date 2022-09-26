package com.pharmacystore.model;

public class Drugs {
	private String name;
	private String category;
	private int drugId;
	private String type;
	public Drugs(String name, String category, int drugId, String type) {
		super();
		this.name = name;
		this.category = category;
		this.drugId = drugId;
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getDrugId() {
		return drugId;
	}
	public void setDrugId(int drugId) {
		this.drugId = drugId;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Drug [name=" + name + ", category=" + category + ", drugId=" + drugId + ", type=" + type + "]";
	}
	

}
