package org.orol.bank;

public class AxisBank extends CommonBank {

	public void deposit() {
		System.out.println("14%");
	}
	
	public static void main(String[] args) {
		AxisBank cr = new AxisBank();
		cr.deposit();
		cr.savings();
		cr.fixed();
	}
	}


