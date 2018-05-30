package bjtu.bigjunoba.annotationBased3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration(classes = AnnotationBased3Config.class)
public class AnnotationBasedTest {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext cfg = new AnnotationConfigApplicationContext(AnnotationBased3Config.class);
		
		System.out.println("我要买手机！");
		BuyPhone pSeller = (BuyPhone) cfg.getBean("phoneSeller");
		pSeller.BuyThePhone();
		
		System.out.println();
		
		System.out.println("我要买鞋子！");
		BuyShoes sSeller = (BuyShoes) cfg.getBean("shoesSeller");
		sSeller.BuyTheShoes();
				
	}
}
