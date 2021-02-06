package CoffeeShop;

public class TestOrder1 {

	public static void main(String[] args) {
		// 第一筆訂單 Expresso
		Beverage beverage = new Expresso();
		System.out.println(beverage.getDescription() + " $" + beverage.getcost() + "NT.");

		// 第二筆訂單 深度烘焙＋奶泡＋摩卡
		Beverage beverage2 = new DarkRoast();
		beverage2 = new Mocha(beverage2);
		beverage2 = new whip(beverage2);
		System.out.println(beverage2.getDescription() + " $" + beverage2.getcost() + "NT.");
	}

}
