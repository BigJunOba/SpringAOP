package bjtu.bigjunoba.annotationBased2;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component("BuyerHelperAspect")
public class BuyerHelper {

	@Pointcut("execution(* bjtu.bigjunoba.annotationBased2.*.*(..))")
	public void BuySomething() {
	}

	@Before("BuySomething()")
	public void before() {
		System.out.println("我是你的朋友，即代理类，(事前处理)朋友选好了商品，准备把钱付给店家。");
	}

	@AfterReturning("BuySomething()")
	public void after() {
		System.out.println("我是你的朋友，即代理类，(事后处理)朋友拿到了商品，并把商品发了快递。");
	}
}
