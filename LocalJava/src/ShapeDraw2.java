abstract class Shape {
	abstract void draw();
}

class Polyline extends Shape {
	void draw() {
		System.out.println("N");
	}
}

class Rectangle extends Shape {
	void draw() {
		System.out.println("◼️");
	}
}

class Circle extends Shape {
	void draw() {
		System.out.println("⚪︎");
	}
}

public class ShapeDraw2 {
	public static void main(String[] args) {
		Shape[] sh = new Shape[3];
		sh[0] = new Polyline();
		sh[1] = new Rectangle();
		sh[2] = new Circle();
		
		for(int i = 0; i < 3; i++) {
			sh[i].draw();
		}
	}
}