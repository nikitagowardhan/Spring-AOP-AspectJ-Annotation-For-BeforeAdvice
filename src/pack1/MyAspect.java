package pack1;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {
	
	
	@Before("execution(* model.PaymentService.b())")
	public void printBefore()
	{
		System.out.println("Payment Started");
	}
	

}
