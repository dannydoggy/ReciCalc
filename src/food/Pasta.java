package food;

public class Pasta extends Pantry implements Food {

	@Override
	public double getPrice() {
		return 0.31;
	}

	@Override
	public double getDiscount() {
		return 0;
	}


}
