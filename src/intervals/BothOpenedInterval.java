package intervals;

public class BothOpenedInterval extends Interval{

	public BothOpenedInterval(double minimum, double maximum, Opening opening) {
		super(minimum, maximum, opening);
		minPoint = new OpenedPoint(minimum);
		maxPoint = new OpenedPoint(maximum);
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
					&& (maximumIncluded);
		case RIGHT_OPENED:
			return (minimumIncluded)
					&& (maximumIncluded || getMaximum() == interval.getMaximum());
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
		if(getMinimum() == interval.getMaximum() 
				|| getMaximum() == interval.getMinimum()){
			return false;
		}
		else return this.includes(interval.getMinimum())
				|| this.includes(interval.getMaximum());
	}
}
