package Oops;

//Data Hiding

class Rectangle2{
    private int length;
    private int width;

    public int getLength(){
        return length;
    }

    public int getWidth(){
        return width;
    }

    public void setLength(int l){
        if(l > 0){
            length = l;
        }
        else{
            length = 0;
        }
    }

    public void setWidth(int w){
        if(w > 0){
            width = w;
        }else{
            width = 0;
        }
    }
}

public class DataHiding {
    public static void main(String[] args) {
        Rectangle2 r2 = new Rectangle2();

        r2.setLength(5);
        r2.setWidth(6);

        System.out.println(r2.getLength());
        System.out.println(r2.getWidth());

    }
}
