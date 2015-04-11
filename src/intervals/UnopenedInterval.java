package intervals;

public class UnopenedInterval extends Interval{

	public UnopenedInterval(Point minimum, Point maximum, Opening opening) {
		super(minimum, maximum, opening);
	}

	@Override
	public boolean includes(Interval interval) {
		boolean minimumIncluded = this.includes(interval.getMinimum().getValue());
		boolean maximumIncluded = this.includes(interval.getMaximum().getValue());
		return (minimumIncluded || getMinimum().getValue() == interval.getMinimum().getValue())
				&& (maximumIncluded || getMaximum().getValue() == interval.getMaximum().getValue());
		
	}

	@Override
	public boolean intersectsWith(Interval interval) {
		if(getMaximum().getValue() == interval.getMinimum().getValue()){
			return interval.getOpening() == Opening.UNOPENED
					|| interval.getOpening() == Opening.RIGHT_OPENED;
		}
		else if(getMinimum().getValue() == interval.getMaximum().getValue()){
			return interval.getOpening() == Opening.UNOPENED
					|| interval.getOpening() == Opening.LEFT_OPENED;
		}
		else return this.includes(interval.getMinimum().getValue()) 
				|| this.includes(interval.getMaximum().getValue());
	}

}
