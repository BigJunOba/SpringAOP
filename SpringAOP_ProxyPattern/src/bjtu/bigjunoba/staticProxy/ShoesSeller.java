package bjtu.bigjunoba.staticProxy;

public class ShoesSeller implements BuyShoes {

	@Override
	public void BuyTheShoes() {
		System.out.println("我是鞋店老板，即目标类，你把钱给我就可以拿走你要的鞋了！");
	}

}
