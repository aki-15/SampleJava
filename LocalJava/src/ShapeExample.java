interface HasGetAreaMethod {
	double getArea();
}

abstract class Shape2 {
	abstract void draw();
}

class Rectangle2 extends Shape2 implements HasGetAreaMethod {
	void draw() {
		System.out.println("◼️");
	}
	public double getArea() {
		System.out.println("RectangleクラスのgetAreaメソッドが呼ばれました");
		return 1.0;
	}
}

class Circle2 extends Shape2 implements HasGetAreaMethod {
	void draw() {
		System.out.println("◯️");
	}
	public double getArea() {
		System.out.println("Circle2クラスのgetAreaメソッドが呼ばれました");
		return 2.0;
	}
}

class Polygon2 extends Shape2 implements HasGetAreaMethod {
	void draw() {
		System.out.println("凸️");
	}
	public double getArea() {
		System.out.println("PolygonクラスのgetAreaメソッドが呼ばれました");
		return 3.0;
	}
}

public class ShapeExample {
	public static void main(String[] args) {
		HasGetAreaMethod[] closedShapes = new HasGetAreaMethod[3];
		closedShapes[0] = new Rectangle2();
		closedShapes[1] = new Circle2();
		closedShapes[2] = new Polygon2();
		
		for (int i = 0; i < 3; i++) {
			closedShapes[i].getArea();
		}
		
		Shape2[] shs = new Shape2[3];
		shs[0] = new Rectangle2();
		shs[1] = new Circle2();
		shs[2] = new Polygon2();
		
		for ( int i = 0; i < 3; i++) {
			shs[i].draw();
		}
		
	}
}
