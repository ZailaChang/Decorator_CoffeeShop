//利用繼承達到“型態相符“
//所有了品都必需繼承此抽象類別

package CoffeeShop;

//讓配料重新實踐 getDescription()
public abstract class CondimentDecorator extends Beverage {
	public abstract String getDescription();




}
