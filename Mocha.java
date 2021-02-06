package CoffeeShop;

public class Mocha extends CondimentDecorator {

	Beverage beverage; // 用實體變數紀錄Beverage物件(被裝飾者)

	// 讓被裝飾者（Beverage）被記錄到實體變數中作建構子的參數
	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}

	// 委派作法 以得到敘述
	public String getDescription() {
		return beverage.getDescription() + ", Mocha";
	}

	// 委派作法 得到價格
	public int getcost() {
		return 5 + beverage.getcost();
	}

}
