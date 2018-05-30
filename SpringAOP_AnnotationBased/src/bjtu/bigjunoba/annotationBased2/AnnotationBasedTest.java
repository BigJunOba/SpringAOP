package bjtu.bigjunoba.annotationBased2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBasedTest {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext cfg = new ClassPathXmlApplicationContext("classpath:bjtu/bigjunoba/annotationBased2/AnnotationBased2.xml");
		
		System.out.println("我要买手机！");
		BuyPhone pSeller = (BuyPhone) cfg.getBean("phoneSeller");
		pSeller.BuyThePhone();
		
		System.out.println();
		
		System.out.println("我要买鞋子！");
		BuyShoes sSeller = (BuyShoes) cfg.getBean("shoesSeller");
		sSeller.BuyTheShoes();
	}
}
