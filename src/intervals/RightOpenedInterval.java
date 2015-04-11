package intervals;

public class RightOpenedInterval extends Interval{

	public RightOpenedInterval(Point minimum, Point maximum, Opening opening) {
		super(minimum, maximum, opening);
	}

	@Override
	public boolean evaluateLimits(Interval interval) {
		if (getMaximum().getValue() == interval.getMinimum().getValue()) {
			return false;
		}
		else if(getMinimum().getValue() == interval.getMaximum().getValue()){
			return interval.getOpening() == Opening.UNOPENED
					|| interval.getOpening() == Opening.LEFT_OPENED;
		}
		return false;
	}

}
