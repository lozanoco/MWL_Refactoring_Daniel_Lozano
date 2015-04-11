package intervals;

public class ClosedPoint extends Point{

	public ClosedPoint(double value) {
		super(value);
	}

	@Override
	public boolean isGreater(Point point) {
		return this.getValue() >= point.getValue();
	}

	@Override
	public boolean isLower(Point point) {
		return this.getValue() <= point.getValue();
	}

}
