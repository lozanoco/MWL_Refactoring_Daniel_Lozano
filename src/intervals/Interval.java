package intervals;

public abstract class Interval {

	private Point minimum;
	private Point maximum;
	private Opening opening;


	public Interval(Point minimum, Point maximum, Opening opening) {
		this.minimum = minimum;
		this.maximum = maximum;
		this.opening = opening;
	}

	public double midPoint() {
		return (maximum.getValue() + minimum.getValue()) / 2;
	}

	public boolean includes(double value){
		Point point = new ClosedPoint(value);
		return this.minimum.isLower(point) && this.maximum.isGreater(point);
	}

	public boolean includes(Interval interval){
		return this.minimum.isLower(interval.minimum) && this.maximum.isGreater(interval.maximum);
	}	

	public abstract boolean intersectsWith(Interval interval);
	
	@Override
	public String toString() {
		// TODO
		return null;
	}

	@Override
	public boolean equals(Object object) {
		// TODO
		return false;
	}
	
	public Point getMinimum() {
		return minimum;
	}

	public void setMinimum(Point minimum) {
		this.minimum = minimum;
	}

	public Point getMaximum() {
		return maximum;
	}

	public void setMaximum(Point maximum) {
		this.maximum = maximum;
	}

	public Opening getOpening() {
		return opening;
	}

	public void setOpening(Opening opening) {
		this.opening = opening;
	}
	

}
