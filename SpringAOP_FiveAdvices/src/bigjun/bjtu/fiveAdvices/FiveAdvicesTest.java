package bigjun.bjtu.fiveAdvices;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FiveAdvicesTest {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext cfg = new ClassPathXmlApplicationContext("FiveAdvices.xml");
		
		AdviceType aType = cfg.getBean("adviceType", AdviceType.class);
		
		System.out.println("我要运行方法1！");
		aType.Method1("来自方法1的QiaoJiang");
		
		System.out.println();
		
		System.out.println("我要运行方法2！");
		aType.Method2("来自方法2的LianJiang", "No.2");
		
	}
}
