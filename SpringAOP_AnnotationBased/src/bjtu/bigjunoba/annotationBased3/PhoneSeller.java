package bjtu.bigjunoba.annotationBased3;

import org.springframework.stereotype.Component;

@Component("phoneSeller")
public class PhoneSeller implements BuyPhone {

	@Override
	public void BuyThePhone() {
		System.out.println("我是手机店老板，即目标类，你把钱给我就可以拿走你要的手机了！");
	}
}
