package intervals;

public class BothOpenedInterval extends Interval{

	public BothOpenedInterval(Point minimum, Point maximum, Opening opening) {
		super(minimum, maximum, opening);
	}

	@Override
	public boolean includes(Interval interval) {
		boolean minimumIncluded = this.includes(interval.getMinimum().getValue());
		boolean maximumIncluded = this.includes(interval.getMaximum().getValue());
		switch (interval.getOpening()) {
		case BOTH_OPENED:
			return (minimumIncluded || getMinimum().getValue() == interval.getMinimum().getValue())
					&& (maximumIncluded || getMaximum().getValue() == interval.getMaximum().getValue());
		case LEFT_OPENED:
			return (minimumIncluded || getMinimum().getValue() == interval.getMinimum().getValue())
					&& (maximumIncluded);
		case RIGHT_OPENED:
			return (minimumIncluded)
					&& (maximumIncluded || getMaximum().getValue() == interval.getMaximum().getValue());
		case UNOPENED:
			return (minimumIncluded)
					&& (maximumIncluded);
		default:
			assert false;
			return false;
		}

	}

	@Override
	public boolean intersectsWith(Interval interval) {
		if(getMinimum().getValue() == interval.getMaximum().getValue()
				|| getMaximum().getValue() == interval.getMinimum().getValue()){
			return false;
		}
		else return this.includes(interval.getMinimum().getValue())
				|| this.includes(interval.getMaximum().getValue());
	}
}
