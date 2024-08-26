package Oops;

class Circle1 {
    public double radius;

    public double area(){
        return Math.PI * radius * radius;
    }
}

class Rectangle{
    public int length;
    public int width;

    public int areaOfRectangle(){
        int area = length * width;
        return area;
    }

    public boolean isSquare() {
        return length == width;
    }
}

public class Circle {
    public static void main(String[] args) {
        Circle1 c = new Circle1();
        c.radius = 7.5;
//        System.out.println("Area of circle: " + c.area(c.radius));

        Rectangle r1 = new Rectangle();

        r1.length = 5;
        r1.width = 5;

        System.out.println(r1.areaOfRectangle());
        System.out.println( r1.isSquare());
    }
}
