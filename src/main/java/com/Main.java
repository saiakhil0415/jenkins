package com;

import com.model.Company;
import com.model.Laptop;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Laptop laptop=new Laptop();
		laptop.setPrice(65000);
//		laptop.setCompany("Hp pavilion");
		Company company=new Company();
		company.setCompany("Hp pavilion");
		laptop.setCompany(company);
		System.out.println(laptop);
	}

}
