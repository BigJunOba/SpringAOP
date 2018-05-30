package bigjun.bjtu.fiveAdvices;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component("Aspect")
public class FiveAdviceAspect {

	@Pointcut("execution(* bigjun.bjtu.fiveAdvices.*.*(..))")
	public void DoSomething() {
	}

    @Before("DoSomething()")
    public void before(JoinPoint joinpoint) 
    {
        System.out.print("这是前置通知 : ");
        for (int i = 0; i < joinpoint.getArgs().length; i++) {
            System.out.print(joinpoint.getArgs()[i]+" ");
        }
        System.out.println(joinpoint.getSignature().getName());
    }

    @After("DoSomething()")
    public void after(JoinPoint joinpoint)
    {
        System.out.print("这是后置通知 : ");
        for (int i = 0; i < joinpoint.getArgs().length; i++) {
            System.out.print(joinpoint.getArgs()[i]+" ");
        }
        System.out.println(joinpoint.getSignature().getName());
    }
    
    @AfterReturning(pointcut="DoSomething()",returning="result")
    public void afterReturning(JoinPoint jointpoint ,String result)
    {
        System.out.print("这是返回通知  : "+"result= "+result+" ");
        for (int i = 0; i < jointpoint.getArgs().length; i++) {
            System.out.print(jointpoint.getArgs()[i]+" ");
        }
        System.out.println(jointpoint.getSignature().getName());
    }
    
    @AfterThrowing(pointcut="DoSomething()",throwing="e")
    public void exception(Exception e)
    {
        System.out.println("这是异常通知 : "+e);
    }
    
    @Around("DoSomething()")
    public Object doBasicProfiling(ProceedingJoinPoint pjp) throws Throwable
    {
        //可以在环绕通知之下进行权限判断
        System.out.print("这是环绕通知 : ");
        for (int i = 0; i < pjp.getArgs().length; i++) {
            System.out.print(pjp.getArgs()[i]+" ");
        }
        System.out.println(pjp.getSignature().getName());
        System.out.println("proceed()方法执行前");
        Object result=pjp.proceed();
        System.out.println("proceed()方法执行后");
        return result;
    }
    
}
