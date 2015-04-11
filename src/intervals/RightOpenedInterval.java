package intervals;

public class RightOpenedInterval extends Interval{

	public RightOpenedInterval(Point minimum, Point maximum, Opening opening) {
		super(minimum, maximum, opening);
	}

	@Override
	public boolean intersectsWith(Interval interval) {
		if (getMaximum().getValue() == interval.getMinimum().getValue()) {
			return false;
		}
		else if(getMinimum().getValue() == interval.getMaximum().getValue()){
			return interval.getOpening() == Opening.UNOPENED
					|| interval.getOpening() == Opening.LEFT_OPENED;
		}
		else return this.includes(interval.getMinimum().getValue())
				|| this.includes(interval.getMaximum().getValue());
	}

}
