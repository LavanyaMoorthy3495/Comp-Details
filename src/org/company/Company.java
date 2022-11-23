package org.company;

public class Company extends Client {
	
	private void compName() {
		
		System.out.println("CompanyName : WIPRO");
	}
	public static void main(String[] args) {
		
		Company c = new Company();
		c.compName();
		c.clientName();
	}

}
