package grocery;


import java.util.*;



public class Product {
    List<Product> products = new ArrayList<Product>();

    public Product (Integer par, String productName, Double par1, Integer par2) {
        this.initStoreItems();
    }
          
    public void initStoreItems() {
        Integer [] productID = {1,2,3,4,5};
        String [] productNames = {"fish", "egg", "chicken","mutton","prawn"};
        Double [] productPrice = {40.00, 60.00, 30.00,50.00,40.00};
        Integer [] quantity = {50, 60, 100,80,50};
        
        for (int i=0; i < productNames.length; i++) {
            this.products.add(new Product(productID[i], productNames[i], productPrice[i], quantity[i]));
        }
    }
    
     public List<Product> getProducts() {
        return products;
    }  
        
}