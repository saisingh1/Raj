package com.sai.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import com.sai.beans.PaymentContext;

public class PaymentContextTest {
	public static void main(String[] args) {
		try {
			ClassPathResource res= new ClassPathResource("com/sai/cfgs/application-Context.xml");
			BeanFactory factory=new XmlBeanFactory(res);
			
			/* PaymentContext ctx=factory.getBean("paymentCtx",PaymentContext.class); 
			ctx.payBill(1000.00,8675); */
			
			
			Object obj = factory.getBean("paymentCtx");
			((PaymentContext) obj).payBill(1000.00,8675); 
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
