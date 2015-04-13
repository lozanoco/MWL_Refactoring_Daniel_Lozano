package intervals;

public class OpenedPoint extends Point{

	public OpenedPoint(double value) {
		super(value);
		// TODO Auto-generated constructor stub
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
		return this.getValue() <= maximum.getValue();
	}

	@Override
	public boolean isLower(OpenedPoint minimum) {
		return this.getValue() >= minimum.getValue();
	}

	@Override
	public boolean isExact() {
		return false;
	}

}
