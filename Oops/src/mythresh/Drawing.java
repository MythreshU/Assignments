package mythresh;

abstract class Shape {
	abstract void draw();
}

class Line extends Shape {
	@Override
	void draw() {
		System.out.println("It is in straigth line");
	}
}

class Rectangle extends Shape {
	@Override
	void draw() {
		System.out.println("It is in Rectangle shape");
	}
}

class cube extends Shape {
	@Override
	void draw() {
		System.out.println("It is in cube shape");
	}
}

public class Drawing {
	public static void main(String[] args) {
		Shape obj = new cube();
		obj.draw();
	}
}
