package food;

public class ChickenBreast extends Meat implements Food {

	@Override
	public double getPrice() {
		return 2.19;
	}

	@Override
	public double getDiscount() {
		return 0;
	}

}
