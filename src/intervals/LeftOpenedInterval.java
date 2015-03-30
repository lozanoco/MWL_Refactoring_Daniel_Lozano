package intervals;

public class LeftOpenedInterval extends Interval{

	public LeftOpenedInterval(double minimum, double maximum, Opening opening) {
		super(minimum, maximum, opening);
		// TODO Auto-generated constructor stub
	}
	@Override
	public boolean includes(double value) {
		return minimum < value && value <= maximum;
	}

}
