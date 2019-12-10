package in.org.subh.learn.ocjp6;
class Line {
	public class Point {
		public int x, y;
	}

	public Point getPoint() {
		return new Point();
	}
}

class Triangle {
	public Triangle() {
		Line l = new Line();
//		Line.Point lp = l. new Point();
		Line.Point lp = new Line().new Point();
	}
}
