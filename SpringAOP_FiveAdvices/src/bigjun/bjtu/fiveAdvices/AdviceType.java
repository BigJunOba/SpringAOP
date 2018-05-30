package bigjun.bjtu.fiveAdvices;

import org.springframework.stereotype.Component;

@Component("adviceType")
public class AdviceType implements AdviceTypeITF {

	@Override
	public String Method1(String name) {
		System.out.println("方法1的输出");
		return "方法1的返回值";
	}

	@Override
	public void Method2(String name, String id) {
		System.out.println("方法2的输出");
	}

}
