package bigjun.bjtu.XMLBased;

import org.springframework.stereotype.Service;

@Service("BuyerHelper")
public class BuyerHelper {

	public void before() {
		System.out.println("我是你的朋友，即代理类，(事前处理)朋友选好了商品，准备把钱付给店家。");
	}
	
	public void after() {
		System.out.println("我是你的朋友，即代理类，(事后处理)朋友拿到了商品，并把商品发了快递。");
	}
}
