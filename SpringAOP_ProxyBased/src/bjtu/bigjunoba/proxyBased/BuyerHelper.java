package bjtu.bigjunoba.proxyBased;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;

public class BuyerHelper implements AfterReturningAdvice, MethodBeforeAdvice {

	@Override
	public void before(Method arg0, Object[] arg1, Object arg2) throws Throwable {
		System.out.println("我是你的朋友，即代理类，(事前处理)朋友选好了商品，准备把钱付给店家。");
	}

	@Override
	public void afterReturning(Object arg0, Method arg1, Object[] arg2, Object arg3) throws Throwable {
		System.out.println("我是你的朋友，即代理类，(事后处理)朋友拿到了商品，并把商品发了快递。");
	}
}
