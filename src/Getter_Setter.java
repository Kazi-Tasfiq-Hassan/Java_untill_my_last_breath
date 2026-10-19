class Product{
    private String product_name;
    private double price;
    Product(String product_name, double price){
        this.product_name = product_name;
        setPrice(price);
    }

    public String getProduct_name() {
        return product_name;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price){
        if(price>=0.0){
            this.price = price;
        }else{
            System.out.println("It is not a product which can be sold");
        }
    }
}
public class Getter_Setter {
    public static void main(String[] args){
        Product item = new Product("Sneaker", 500);
        System.out.println("The name of the product is " + item.getProduct_name() + " And the price of the product is " + item.getPrice());
        item.setPrice(1000);
        System.out.println("The name of the product is " + item.getProduct_name() + " And the updated price of the product is " + item.getPrice());
    }
}
