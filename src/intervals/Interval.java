package intervals;

public abstract class Interval {

	private double minimum;
	private double maximum;
	private Opening opening;
	public Point minPoint;
	public Point maxPoint;

	public Interval(double minimum, double maximum, Opening opening) {
		this.minimum = minimum;
		this.maximum = maximum;
		this.opening = opening;
	}

	public double midPoint() {
		return (maximum + minimum) / 2;
	}

	public boolean includes(double value){
		return this.minPoint.isLower(value) && this.maxPoint.isGreater(value);
	}

	public abstract boolean includes(Interval interval);		

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
	
	public double getMinimum() {
		return minimum;
	}

	public void setMinimum(double minimum) {
		this.minimum = minimum;
	}

	public double getMaximum() {
		return maximum;
	}

	public void setMaximum(double maximum) {
		this.maximum = maximum;
	}

	public Opening getOpening() {
		return opening;
	}

	public void setOpening(Opening opening) {
		this.opening = opening;
	}
	

}
