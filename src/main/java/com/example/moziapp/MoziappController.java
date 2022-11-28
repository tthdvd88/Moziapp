package com.example.moziapp;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class MoziappController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Üdvözöllek pici hobbit");
    }

    @FXML
    protected void exitApplicationButton() {}
}