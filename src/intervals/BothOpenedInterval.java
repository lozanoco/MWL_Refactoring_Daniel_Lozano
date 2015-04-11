package intervals;

public class BothOpenedInterval extends Interval{

	public BothOpenedInterval(Point minimum, Point maximum, Opening opening) {
		super(minimum, maximum, opening);
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
