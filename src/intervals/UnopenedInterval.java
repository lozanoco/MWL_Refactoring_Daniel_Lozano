package intervals;

public class UnopenedInterval extends Interval{

	public UnopenedInterval(double minimum, double maximum, Opening opening) {
		super(minimum, maximum, opening);
		minPoint = new ClosedPoint(minimum);
		maxPoint = new ClosedPoint(maximum);
	}

	@Override
	public boolean includes(Interval interval) {
		boolean minimumIncluded = this.includes(interval.getMinimum());
		boolean maximumIncluded = this.includes(interval.getMaximum());
		switch (interval.getOpening()) {
		case BOTH_OPENED:
			return (minimumIncluded || getMinimum() == interval.getMinimum())
					&& (maximumIncluded || getMaximum() == interval.getMaximum());
		case LEFT_OPENED:
			return (minimumIncluded || getMinimum() == interval.getMinimum())
					&& (maximumIncluded || getMaximum() == interval.getMaximum());
		case RIGHT_OPENED:
			return (minimumIncluded || getMinimum() == interval.getMinimum())
					&& (maximumIncluded || getMaximum() == interval.getMaximum());
		case UNOPENED:
			return (minimumIncluded || getMinimum() == interval.getMinimum())
					&& (maximumIncluded || getMaximum() == interval.getMaximum());
		default:
			assert false;
			return false;
		}
	}

	@Override
	public boolean intersectsWith(Interval interval) {
		if(getMaximum() == interval.getMinimum()){
			return interval.getOpening() == Opening.UNOPENED
					|| interval.getOpening() == Opening.RIGHT_OPENED;
		}
		else if(getMinimum() == interval.getMaximum()){
			return interval.getOpening() == Opening.UNOPENED
					|| interval.getOpening() == Opening.LEFT_OPENED;
		}
		else return this.includes(interval.getMinimum()) 
				|| this.includes(interval.getMaximum());
	}

}
