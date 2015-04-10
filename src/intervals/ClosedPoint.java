package intervals;

public class ClosedPoint extends Point{

	public ClosedPoint(double value) {
		super(value);
	}

	@Override
	public boolean isGreater(double value) {
		return this.getValue() >= value;
	}

	@Override
	public boolean isLower(double value) {
		return this.getValue() <= value;
	}

}
