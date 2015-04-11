package intervals;

public class UnopenedInterval extends Interval{

	public UnopenedInterval(Point minimum, Point maximum, Opening opening) {
		super(minimum, maximum, opening);
	}

	@Override
	public boolean evaluateLimits(Interval interval) {
		if(getMaximum().getValue() == interval.getMinimum().getValue()){
			return interval.getOpening() == Opening.UNOPENED
					|| interval.getOpening() == Opening.RIGHT_OPENED;
		}
		else if(getMinimum().getValue() == interval.getMaximum().getValue()){
			return interval.getOpening() == Opening.UNOPENED
					|| interval.getOpening() == Opening.LEFT_OPENED;
		}
		return false;
	}

}
