class Shape {

    void area() {
        System.out.println("Area of Shape");
    }
}

class Circle extends Shape {

    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    void area() {
        System.out.println("Area of Circle: " +
                (3.14 * radius * radius));
    }
}

class Rectangle extends Shape {

    double length, breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    void area() {
        System.out.println("Area of Rectangle: " +
                (length * breadth));
    }
}

class Triangle extends Shape {

    double base, height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    void area() {
        System.out.println("Area of Triangle: " +
                (0.5 * base * height));
    }
}

public class code3 {

    public static void main(String[] args) {

        Shape s;

        s = new Circle(5);
        s.area();

        s = new Rectangle(10, 5);
        s.area();

        s = new Triangle(8, 6);
        s.area();
    }
}