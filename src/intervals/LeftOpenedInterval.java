package intervals;

public class LeftOpenedInterval extends Interval{

	public LeftOpenedInterval(double minimum, double maximum, Opening opening) {
		super(minimum, maximum, opening);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean includes(double value) {
		return this.getMinimum() < value && value <= this.getMaximum();
	}

	@Override
	public boolean includes(Interval interval) {
		// TODO Auto-generated method stub
		return false;
	}

}
