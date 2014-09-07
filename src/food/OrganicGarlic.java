package food;

public class OrganicGarlic implements Food{

	@Override
	public double getPrice() {
		return 0.67;
	}

	@Override
	public double getDiscount() {
		return 0.05;
	}

}
