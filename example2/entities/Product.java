package example2.entities;

public class Product {
    public String name;
    public double price;
    public int quantity;

    public double totalValueInStock(){
        return quantity * price;
    }

    public void addProducts(int quantity){
        this.quantity += quantity;
    }
    public void removeProducts(int quantity){
        this.quantity -= quantity;
    }

    @Override
    public String toString() {
        return "Product Data: "
                + name
                + " $ " + String.format("%.2f", price)
                +", "
                +  quantity
                + " units, total: $ "
                + String.format("%.2f",totalValueInStock());
    }
}
