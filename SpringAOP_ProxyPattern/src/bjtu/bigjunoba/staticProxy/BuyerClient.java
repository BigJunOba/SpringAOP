package bjtu.bigjunoba.staticProxy;

public class BuyerClient {
	public static void main(String[] args) {
		
		ShoesSeller sSeller = new ShoesSeller();
		PhoneSeller pSeller = new PhoneSeller();
		
		SellerProxy sSellerProxy = new SellerProxy(sSeller);
		SellerProxy pSellerProxy = new SellerProxy(pSeller);
		
		System.out.println("我是客户方，我要买鞋！");
		sSellerProxy.BuyTheShoes();
		
		System.out.println("我是客户方，我要买手机！");
		pSellerProxy.BuyThePhone();
	}
}
