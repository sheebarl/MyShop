public class Product {
    String productName;
    double productPrice;
    String productDescription;
    double total_amount;
    int product_quantity;
    double wallet;

    public Product(String name,double price,String description,int quantity){
        this.productName=name;
        this.productPrice=price;
        this.productDescription=description;
        this.product_quantity=quantity;
    }
    public Product(double amount){
        this.wallet=amount;
    }


    public String getName(){
        return productName;
    }

    public void setName(String name){
        this.productName=name;
    }

    public double getPrice(){
        return total_amount;
    }

    public void setPrice(double price){
        this.productPrice=price;
        total_amount=total_amount+price;
    }

    public String getDescription(){
        return productDescription;
    }

    public void setDescription(String description){
        this.productDescription=description;
    }

    public int getProduct_quantity(){
        return product_quantity;
    }

    public void setProduct_quantity(int quantity){
        this.product_quantity=quantity;
     }
}
