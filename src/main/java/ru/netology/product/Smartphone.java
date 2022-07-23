package ru.netology.product;

public class Smartphone extends Product {

    private final String manufacturer;


    public Smartphone(int id, String name, int price, String manufacturer) {
        super(id, name, price);
        this.manufacturer = manufacturer;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    @Override
    public boolean matches(Product product, String search) {
        super.matches(product, search);
        return getManufacturer().contains(search);
    }


}
