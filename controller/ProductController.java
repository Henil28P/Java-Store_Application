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

public class ProductController extends Controller<Product> {
    @FXML private TextField amountTf;
//    @FXML private Text cashTxt;
    
//    @FXML private Text productName;
//    @FXML private Text stockNum;
//    @FXML private Text productPrice;
//    @FXML private TextField sell;
//   
//    @FXML public void initialize() {
//        productName.setText(model.getName());
//        stockNum.setText(String.valueOf(model.getStock()));
//        productPrice.setText(String.valueOf(model.getPrice()));
//        
//        // need to bind each corresponding product name //
//        productName.textProperty().bind(getStore().getCashRegister().cashProperty().asString("$%.2f"));
//    }

    public final Product getProduct() { return model; }
    private int getAmount() { return Integer.parseInt(amountTf.getText()); }
    private void setAmount(int amount) { amountTf.setText("" + amount); }

    @FXML private void handleSell(ActionEvent event) {
        int amount = getAmount();
        if (getProduct().has(getAmount())) {
            getProduct().sell(amount);
            setAmount(0);
        }
        
//        if (store.getProduct().has(getAmount())) {
//            store.getProduct().sell(amount);
//            setAmount(0);
//        }
//        Product product = new Product("", 0, 0.0);
//        product.sell(getAmount());
    }
}
