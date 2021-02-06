package CoffeeShop;

public class whip extends CondimentDecorator {

	Beverage beverage;

	public whip(Beverage beverage) {
		this.beverage = beverage;
	}

	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription() + ", Whip";
	}

	public int getcost() {
		return 10 + beverage.getcost();
	}

}
