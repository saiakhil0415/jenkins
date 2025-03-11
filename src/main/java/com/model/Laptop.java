package com.model;

public class Laptop {

	private Company company;
	private int price;

	public Company getCompany() {
		return company;
	}

	
	public void setCompany(Company company) {
		this.company = company;
	}

	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Laptop(Company company, int price) {
		super();
		this.company = company;
		this.price = price;
	}

//	public String getCompany() {
//		return company;
//	}
//
//	public void setCompany(String company) {
//		this.company = company;
//	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Laptop [company=" + company + ", price=" + price + "]";
	}
}
