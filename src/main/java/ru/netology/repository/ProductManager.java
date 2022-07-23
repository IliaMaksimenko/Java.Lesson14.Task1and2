package ru.netology.repository;

import ru.netology.product.Product;

public class ProductManager {

    private final ProductRepository repository;

    public ProductManager(ProductRepository repository) {

        this.repository = repository;

    }

    public void addProduct(Product product) {

        repository.addNewProduct(product);

    }

    public Product[] getAddProduct() {
        return repository.getProducts();
    }

    public Product[] searchBy(String text) {
        Product[] result = new Product[0];
        for (Product product : repository.getProducts()) {
            if (product.matches(product, text)) {
                Product[] tmp = new Product[result.length + 1];
                System.arraycopy(result, 0, tmp, 0, result.length);
                tmp[tmp.length - 1] = product;
                result = tmp;
            }
        }
        return result;
    }


}