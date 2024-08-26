package Oops;

class Product{
    private String itemNo;
    private String name;
    private double price;
    private int qty;

    public Product(String _itemNo, String _name, double _price, int _qty){
        itemNo = _itemNo;
        name = _name;
        price = _price;
        qty = _qty;
    }

    public String getItemNo(){
        return itemNo;
    }

    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }

    public int getQty(){
        return qty;
    }


}

public class Constructor2 {
    public static void main(String[] args) {
        Product p = new Product("10", "Mobile", 100.55, 1);

        System.out.println(p.getItemNo());
        System.out.println(p.getName());
        System.out.println(p.getPrice());
        System.out.println(p.getQty());
    }
}
