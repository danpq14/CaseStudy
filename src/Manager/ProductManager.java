package Manager;

import Methods.*;
import Product.Product;

import java.io.IOException;
import java.util.ArrayList;


public class ProductManager implements Manager {
    private ArrayList<Product> products;

    public ProductManager(ArrayList<Product> products) {
        this.products = products;
    }

    public ProductManager() {
        this.products = new ArrayList<Product>();
    }

    @Override
    public void addProduct() throws IOException {
        AddProduct.add(products);
        Save.saveToFile(products);
    }

    @Override
    public void editProduct() throws IOException {
        EditProduct.edit(products);
        Save.saveToFile(products);
    }

    @Override
    public void removeProduct() throws IOException {
        RemoveProduct.remove(products);
        Save.saveToFile(products);
    }

    @Override
    public void purchase() throws IOException {
        PurchaseToInventory.purchase(products);
        Save.saveToFile(products);
    }

    @Override
    public void release() throws IOException {
        ReleaseFromInventory.release(products);
        Save.saveToFile(products);
    }

    @Override
    public void find() {
        Find.find(products);
    }

    @Override
    public void checkInventory() {
        CheckInventory.checkInventory(products);
    }
}
