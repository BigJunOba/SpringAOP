package bjtu.bigjunoba.annotationBased1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBasedTest {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext cfg = new ClassPathXmlApplicationContext("classpath:bjtu/bigjunoba/annotationBased1/AnnotationBased1.xml");
		
		System.out.println("我要买手机！");
		BuyPhone pSeller = cfg.getBean("phoneSeller", BuyPhone.class);
		pSeller.BuyThePhone();
		
		System.out.println();
		
		System.out.println("我要买鞋子！");
		BuyShoes sSeller = cfg.getBean("shoesSeller", BuyShoes.class);
		sSeller.BuyTheShoes();
	}
}
