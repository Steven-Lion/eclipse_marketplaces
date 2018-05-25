package chapter8;

import java.awt.Point;

public class GPSCar extends Car implements GPS{

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append(super.toString());
		sb.append("location is :"+getlocation().x+","+getlocation().y);
		return sb.toString();
	}

	@Override
	public Point getlocation() {
		Point point = new Point();
		point.setLocation(super.getSpeed(), super.getSpeed());
		return point;
	}
	

}
