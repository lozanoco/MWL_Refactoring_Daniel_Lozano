package intervals;

public class ClosedPoint extends Point{

	public ClosedPoint(double value) {
		super(value);
	}

	@Override
	public boolean isGreater(Point point) {
		return point.isGreater(this);
	}

	@Override
	public boolean isLower(Point point) {
		return point.isLower(this);
	}

	@Override
	public boolean isGreater(ClosedPoint maximum) {
		return this.getValue() <= maximum.getValue();
	}

	@Override
	public boolean isLower(ClosedPoint minimum) {
		return this.getValue() >= minimum.getValue();
	}

	@Override
	public boolean isGreater(OpenedPoint maximum) {
		return this.getValue() < maximum.getValue();
	}

	@Override
	public boolean isLower(OpenedPoint minimum) {
		return this.getValue() > minimum.getValue();
	}

}
