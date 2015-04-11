package intervals;

public class BothOpenedInterval extends Interval{

	public BothOpenedInterval(Point minimum, Point maximum, Opening opening) {
		super(minimum, maximum, opening);
	}

	@Override
	public boolean evalueLimits(Interval interval) {
		return false;
	}
}
