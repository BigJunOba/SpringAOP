package bjtu.bigjunoba.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;


public class BuyerClient {

    public static void main(String[] args) {

        ShoesSeller shoesSeller = new ShoesSeller();
        PhoneSeller phoneSeller = new PhoneSeller();

        InvocationHandler shoeshandler = new DynamicProxy(shoesSeller);
        InvocationHandler phonehandler = new DynamicProxy(phoneSeller);
              
        BuyShoes buyTheShoes = (BuyShoes) Proxy.newProxyInstance
        		(shoeshandler.getClass().getClassLoader(),shoesSeller.getClass().getInterfaces(), shoeshandler);
        System.out.println("我想要买鞋子。");
        buyTheShoes.BuyTheShoes();
        
        System.out.println();
        
        BuyPhone buyThePhone=(BuyPhone)Proxy.newProxyInstance
        		(phonehandler.getClass().getClassLoader(), phoneSeller.getClass().getInterfaces(),phonehandler);
        System.out.println("我想要买手机。");
        buyThePhone.BuyThePhone();


    }

}