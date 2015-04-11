package intervals;

public class OpenedPoint extends Point{

	public OpenedPoint(double value) {
		super(value);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isGreater(Point point) {
		return this.getValue() > point.getValue();
	}

	@Override
	public boolean isLower(Point point) {
		return this.getValue() < point.getValue();
	}

}
