package ch07;

class Point{
	private int x, y;

	int getX() {
		return x;
	}

	int getY() {
		return y;
	}

	Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "x=" + x + ",y=" + y;
	}
}

class Point3D extends Point {
	int z;

	public Point3D(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}
	@Override
	public String toString() {
		return super.toString() + ",z="+z;
	}
}

public class SuperConstructorTest {
	public static void main(String[] args) {
		Point3D point = new Point3D(2, 7, 17);
		System.out.println(point);
	}
}
