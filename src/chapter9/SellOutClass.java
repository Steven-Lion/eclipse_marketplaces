package chapter9;

public class SellOutClass {
	private String name ;
	public SellOutClass() {
		name = "Apple";
	}
	public void sell(int price) {
		class Apple{
			int innerPrice = 0;
			public  Apple(int price) {
				innerPrice = price;
			}
			public void price() {
				System.out.println("now going to selling : "+name);
				System.out.println("price is :"+price);
			}
		}
		Apple apple = new Apple(price);
		apple.price();
	}
	public static void main(String[] args) {
		SellOutClass sample = new SellOutClass();
//    方法内部的类不能被外部访问.
//		System.out.println(innerPrice);
		sample.sell(100);

	}

}
