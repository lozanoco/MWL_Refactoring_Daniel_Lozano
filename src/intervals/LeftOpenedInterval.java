package intervals;

public class LeftOpenedInterval extends Interval{

	public LeftOpenedInterval(Point minimum, Point maximum, Opening opening) {
		super(minimum, maximum, opening);
	}


	@Override
	public boolean evaluateLimits(Interval interval) {
		if (getMinimum().getValue() == interval.getMaximum().getValue()) {
			return false;
		}
		else if(getMaximum().getValue() == interval.getMinimum().getValue()){
			return interval.getOpening() == Opening.UNOPENED
					|| interval.getOpening() == Opening.RIGHT_OPENED;
		}
		return false;
	}

}
