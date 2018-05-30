package bjtu.bigjunoba.staticProxy;

public class SellerProxy implements BuyShoes, BuyPhone {

	private ShoesSeller shoesSeller;
	private PhoneSeller phoneSeller;
	
	public SellerProxy(ShoesSeller shoesSeller) {
		this.shoesSeller = shoesSeller;
	}
	
	
	public SellerProxy(PhoneSeller phoneSeller) {
		this.phoneSeller = phoneSeller;
	}
	
	@Override
	public void BuyTheShoes() {
		System.out.println("我是你的朋友，即代理类，(事前处理)朋友选好了商品，准备把钱付给店家。");
		shoesSeller.BuyTheShoes();
		System.out.println("我是你的朋友，即代理类，(事后处理)朋友拿到了商品，并把商品发了快递。");
	}
	@Override
	public void BuyThePhone() {
		System.out.println("我是你的朋友，即代理类，(事前处理)朋友选好了商品，准备把钱付给店家。");
		phoneSeller.BuyTheShoes();
		System.out.println("我是你的朋友，即代理类，(事后处理)朋友拿到了商品，并把商品发了快递。");
	}
	
}
