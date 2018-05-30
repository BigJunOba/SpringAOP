package bjtu.bigjunoba.AutoScanAdvisor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutoScanAdvisorTest {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext cfg = new ClassPathXmlApplicationContext("Spring-AOP.xml");
		
		System.out.println("我要买手机！");
		BuyPhone pSeller = cfg.getBean("phoneSeller", BuyPhone.class);
		pSeller.BuyThePhone();
		
		System.out.println();
		
		System.out.println("我要买鞋子！");
		BuyShoes sSeller = cfg.getBean("shoesSeller", BuyShoes.class);
		sSeller.BuyTheShoes();
	}
}
