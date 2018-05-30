package bjtu.bigjunoba.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicProxy implements InvocationHandler {
	
	private Object subject;
	
	public DynamicProxy(Object subject) {
		this.subject = subject;
	}

	@Override
	public Object invoke(Object arg0, Method arg1, Object[] arg2) throws Throwable {
		System.out.println("我是你的朋友，即代理类，(事前处理)朋友选好了商品，准备把钱付给店家。");
		arg1.invoke(subject, arg2);
		System.out.println("我是你的朋友，即代理类，(事后处理)朋友拿到了商品，并把商品发了快递。");
		return null;
	}
	
}
