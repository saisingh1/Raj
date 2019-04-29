package com.sai.beans;

public class PaymentContext {
	private IPayment paymentService;

	public void setPaymentService(IPayment paymentService) {
		this.paymentService = paymentService;
	}

	public void payBill(double amount, int pin) {
		boolean status = paymentService.pay(amount, pin);

		System.out.println("paymentCompleted:" + status);
	}
}
