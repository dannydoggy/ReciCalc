package food;

public class OrganicGarlic extends Produce implements Food{

	@Override
	public double getPrice() {
		return 0.67;
	}

	@Override
	public double getDiscount() {
		return 0.05;
	}

}
