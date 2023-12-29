package controller;

import javafx.collections.*;
import javafx.event.*;
import javafx.fxml.*;
import javafx.scene.text.*;
import javafx.scene.control.*;
import javafx.stage.*;
import javafx.beans.property.*;
import java.io.*;
import java.text.*;
import au.edu.uts.ap.javafx.*;
import model.*;

public class StoreController extends Controller<Store> {
    @FXML private ListView<Product> productsLv;
    @FXML private Text cashTxt;

    public final Store getStore() { return model; }
    private Product getSelectedProduct() { return productsLv.getSelectionModel().getSelectedItem(); }

    @FXML private void initialize() {
        productsLv.setItems(model.getProducts());
        productsLv.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
        
        cashTxt.textProperty().bind(getStore().getCashRegister().cashProperty().asString("$%.2f"));
    }

    @FXML private void handleSale(ActionEvent event) throws Exception {
        ViewLoader.showStage(getSelectedProduct(), "/view/product.fxml", "Store", new Stage());
        
//        cashTxt.textProperty().bind(getStore().getCashRegister().cashProperty().asString("$%.2f"));
        
//        new Store().getProducts().sell(amount);
//        int amount = getAmount();
//        
//        if (store.getProduct().has(getAmount())) {
//            store.getProduct().sell(amount);
//            setAmount(0);
//        }
//        Product product = new Product("", 0, 0.0);
//        cashTxt.setText(product.sell(n));
    }
}