import java.awt.Point;

public class main {
	public static void main(String[] args) {
		Point p1 = new Point(1, 3);
		Point p2 = new Point (3, 5);
		Line a = new Line(p1, p2);
		System.out.println(a.toString());
	}
}
