package bjtu.bigjunoba.staticProxy;

public class PhoneSeller implements BuyShoes {

	@Override
	public void BuyTheShoes() {
		System.out.println("我是手机店老板，即目标类，你把钱给我就可以拿走你要的手机了！");
	}

}
