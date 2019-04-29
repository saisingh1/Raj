package com.sai.beans;

public class CreditCardPayment implements IPayment {
	    public CreditCardPayment() {
	    	System.out.println("CCD:0-param constructor");
	    }
	  @Override
	    public boolean pay(double amount ,  int pin) {
	    	System.out.println("Conecting to paybil");
	    	return true; 
	  
	
	    }

}
