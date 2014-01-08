/**Lindley Lee
 * January 6, 2013
 * CS211 Assignment 2
 */

import java.awt.Point;

public class Line {
	
	private double slope;
	private double intercept;
	
	public Line(Point p1, Point p2) {		
		slope = (double) (p1.y - p2.y) / (p1.x - p2.x);	//m = dy/dx	
		intercept = p1.y - slope * p1.x;				//b = y - mx
	}
	public double getSlope() {
		return slope;
	}
	public boolean intersect(Line other) {
		return !(this.slope == other.slope); 		
	}
	public String toString() {
		return "y = " + slope + "x + " + intercept;
	}
}
