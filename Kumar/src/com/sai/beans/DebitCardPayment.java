package com.sai.beans;

public class DebitCardPayment implements IPayment {
	public DebitCardPayment() {
		System.out.println("Debit Card: 0-param constructor");
	}
	@Override
	 public boolean pay(double amount ,  int pin) {
	    	System.out.println("Conecting to paybil");
	    	return true; 
	
	    }

}