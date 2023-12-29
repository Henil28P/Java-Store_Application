package model;

import java.util.*;
import javafx.beans.property.*;
import javafx.collections.*;

public class Store {
    private CashRegister cashRegister;
    private ObservableList<Product> products = FXCollections.observableArrayList();

    public Store() {
        cashRegister = new CashRegister();
        products.add(new Product("Whiteboard Marker", 85, 1.50));
        products.add(new Product("Whiteboard Eraser", 45, 5.00));
        products.add(new Product("Black Pen", 100, 1.50));
        products.add(new Product("Red Pen", 100, 1.50));
        products.add(new Product("Blue Pen", 100, 1.50));
        for (Product p: products)
        {
            p.addProductObserver(cashRegister);
        }
    }

    public void addProduct(String name, int stock, double price) {
        Product product = new Product(name, stock, price);
        product.addProductObserver(cashRegister);
        products.add(product);
    }

    public final CashRegister getCashRegister() {
        return cashRegister;
    }

    public ObservableList<Product> getProducts() {
        return products;
    }
}