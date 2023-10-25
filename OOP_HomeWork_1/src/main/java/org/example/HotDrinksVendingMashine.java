package org.example;

import java.util.List;

public class HotDrinksVendingMashine implements VendingMashine{

    private final List<Product> productList;
    private int money;

    public HotDrinksVendingMashine(List<Product> productList) {
        this.productList = productList;
    }

    @Override
    public Product getProduct(String name) {
        return null;
    }

    public HotDrinks getProduct(String name, int volume, int temperature){
        for (Product product: productList){
            if(product instanceof HotDrinks){
                if(product.getName().equals(name) && ((HotDrinks) product).getVolume() == volume && ((HotDrinks) product).getTemperature() == temperature)
                    return (HotDrinks) product;
            }
        }
        return null;
    }

}
