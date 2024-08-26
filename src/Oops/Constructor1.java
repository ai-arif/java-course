package Oops;

class Rectangle3{
    public int length;
    public int width;

    public Rectangle3(){
        length = width = 2;
    }
}

public class Constructor1 {
    public static void main(String[] args) {
        Rectangle3 r3 = new Rectangle3();

        System.out.println(r3.length);
        System.out.println(r3.width);
    }
}
