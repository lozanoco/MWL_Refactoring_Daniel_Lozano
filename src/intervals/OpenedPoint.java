package intervals;

public class OpenedPoint extends Point{

	public OpenedPoint(double value) {
		super(value);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isGreater(double value) {
		return this.getValue() > value;
	}

	@Override
	public boolean isLower(double value) {
		return this.getValue() < value;
	}

}
