package Oops;

class Circle2{
    public int radius;

    public Circle2(){
        radius = 1;
    }

    public double area(){
        return Math.PI * radius * radius;
    }

    public double perimeter(){
        return 2 * Math.PI * radius;
    }
}

class Cylinder extends Circle2{
    public int height;

    public Cylinder(){
        height = 2;
    }

    public double volume(){
       double cylinderVolume = area()*height;
        System.out.println(cylinderVolume);
        return cylinderVolume;
    }
}


public class Inheritance {
    public static void main(String[] args) {
        Circle2 c1 = new Circle2();
        c1.radius = 5;
        System.out.println(c1.area());

        Cylinder c = new Cylinder();
        c.radius = 5;
        c.height = 2;
        System.out.println(c.volume());
    }
}
