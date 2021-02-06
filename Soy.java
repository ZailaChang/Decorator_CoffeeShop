package CoffeeShop;

public class Soy extends CondimentDecorator{
	Beverage beverage;
	
	public Soy(Beverage beverage) {
		this.beverage=beverage;
	}

	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription();
	}

	public int getcost() {

		return 16 + beverage.getcost();

	}

	@Override
	public int getsize() {
		return beverage.getsize();
	}

}
