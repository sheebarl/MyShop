import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class MyShop {
    ArrayList<Product> myProduct=new ArrayList<Product>();
    Product ProductObj=new Product("Apple",25.00,"Apple is a Fruit",100);
    Product ProductObj1=new Product("CuCumber",35.00,"CumCumber  is a Vegetable",50);
    Product ProductObj2=new Product("Milk",15.00,"Milk is a Diary Product",25);
    Product ProductObj3=new Product("Juice",20.00,"Juice is a Soft Drink",30);
    Product ProductObj4=new Product("Semper",70.00,"Semper is a baby Food Product",150);
    Product ProductObj5=new Product(10000.00);
    //Product ProductObj4=new Product(getUserString(),getUserInt(),getUserString());

    public  int PrintMenu(){
        boolean menuOption=true;
        int menuChoice=0;
        while(menuOption){
            System.out.println("The Menu Options are");
            System.out.println("1.Purchased Product");
            System.out.println("2.Price of the Product");
            System.out.println("3.Remove Product");
            System.out.println("4.Product Description");
            System.out.println("5.Available Product");
            System.out.println("6.Quantity");
            System.out.println("7.Exit");
            System.out.println("================================");
            System.out.print("Select the Menu > ");
            menuChoice=getUserInt();

            switch(menuChoice){
                case 1:
                    myProduct.add(ProductObj);
                    myProduct.add(ProductObj2);
                    double total=0;
                    System.out.println("============================");
                    for(int i=0;i<myProduct.size();i++){
                        System.out.println("Product : " + myProduct.get(i).productName);
                        total=total+myProduct.get(i).productPrice;
                    }
                    System.out.println("Total Price of the Product : " + total);
                    if(ProductObj5.wallet>=total){
                        System.out.println("You can purchase the product");
                    }else{
                        System.out.println("You cannot purchase the product");
                    }
                    System.out.println("============================");
                    break;
                case 2:
                    System.out.print("Enter the Purchased Product : ");
                    String pro1=getUserString();
                    System.out.println("================================");
                    System.out.print("Price of  the Product : ");
                     total=0;

                    for(int i=0;i<myProduct.size();i++) {
                        for (int j = i; j < myProduct.size(); j++) {
                            //if (pro1.equals(myProduct.get(i).productName)) {
                            if(myProduct.get(i).productName==myProduct.get(j).productName){
                                total = total + myProduct.get(i).productPrice;
                            }
                        }
                    }
                    System.out.println(total);
                    System.out.println("================================");
                    break;
                case 3:
                    System.out.println("==================================");
                    System.out.print("Enter the Product to be removed : ");
                    String product1=getUserString();

                    for(int i=0;i<myProduct.size();i++){
                        if(product1.equals(myProduct.get(i).productName)){
                            myProduct.remove(myProduct.get(i));
                            System.out.println("It is Successfully removed");
                        }
                        //System.out.println("Product : " + myProduct.get(i).productName);

                    }
                    System.out.println("================================");
                    break;
                case 4:
                    System.out.println("===============================");
                    System.out.print("Enter the Product : ");
                    String name=getUserString();

                    for(int i=0;i<myProduct.size();i++){
                        if(name.equals(myProduct.get(i).productName)){
                            System.out.println("Product Description : " + myProduct.get(i).productDescription);
                        }
                    }
                    System.out.println("================================");
                    break;
                case 5:
                    items();
                    break;
                case 6:
                    int quantity=QuantityMethod();
                    break;
                case 7:
                    System.out.println("============================");
                    System.out.println("Exit the Program");
                    menuOption=false;
                    break;

            }

        }
        return menuChoice;
    }

    public  int getUserInt(){
        Scanner scan=new Scanner(System.in);
        int values=scan.nextInt();
        return values;
    }

    public String getUserString(){
        Scanner scan=new Scanner(System.in);
        String myString=scan.nextLine();
        String[] s1=myString.split(",");
        return myString;
    }
    public void items(){
        String randomItem="";
        System.out.print("Enter the item : ");
        String item1=getUserString();
        myProduct.add(ProductObj);
        myProduct.add(ProductObj1);
        myProduct.add(ProductObj2);
        myProduct.add(ProductObj3);
        myProduct.add(ProductObj4);
        for(int i=0;i< myProduct.size();i++){
            if(item1.equals(myProduct.get(i).productName)){
                System.out.println("User Entered item : " + myProduct.get(i).productName);
                System.out.println("============================");
                break;
            }
            else{
                Random rand=new Random();
                //int item=rand.nextInt(myProduct.size());
                //randomItem=myProduct.get(item).productName;
                randomItem=myProduct.get(i).productName;
                System.out.println("Available item :" + randomItem);

            }

        }


    }

    public int QuantityMethod(){
        int remaining_quantity=0;
        System.out.println("Available Quantity  ");
        myProduct.add(ProductObj);
        myProduct.add(ProductObj1);
        myProduct.add(ProductObj2);
        myProduct.add(ProductObj3);
        myProduct.add(ProductObj4);
        for(int i=0;i<myProduct.size();i++){
            System.out.println(myProduct.get(i).productName + " : " + myProduct.get(i).product_quantity);
        }
        System.out.println("============================");
        System.out.print("Product Purchased : ");
        String product_purchased=getUserString();
        System.out.print("Quantity Purchased : ");
        int purchased_quantity=getUserInt();
        for(int i=0;i< myProduct.size();i++){

            if(myProduct.get(i).product_quantity==0){
                System.out.println("Sorry there are no item available in this product");
            }
            else if(product_purchased.equals(myProduct.get(i).productName)) {
                if (purchased_quantity <= myProduct.get(i).product_quantity) {
                    remaining_quantity = myProduct.get(i).product_quantity - purchased_quantity;
                }
            }
        }
        System.out.println("The quantity left : " + remaining_quantity);
        System.out.println("==================================");
        return remaining_quantity;
    }
}



//System.out.print(" Product Description : ");
//String desc=ProductObj.getDescription();
//myProduct.add(ProductObj);