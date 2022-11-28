package com.example.moziapp;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class MoziappController implements Initializable {

    @FXML
    private Button btnDelete;

    @FXML
    private Button btnInsert;

    @FXML
    private Button btnUpdate;

    @FXML
    private TableColumn<?, ?> colFilmcim;

    @FXML
    private TableColumn<?, ?> colFilmk;

    @FXML
    private TableColumn<?, ?> colHossz;

    @FXML
    private TableColumn<?, ?> colMufaj;

    @FXML
    private TableColumn<?, ?> colSzarmazas;

    @FXML
    private TableColumn<?, ?> colSzines;

    @FXML
    private TableColumn<?, ?> colSzinkron;

    @FXML
    private TextField tfFcim;

    @FXML
    private TextField tfFkod;

    @FXML
    private TextField tfHossz;

    @FXML
    private TextField tfMufaj;

    @FXML
    private TextField tfSzarmazas;

    @FXML
    private TextField tfSzines;

    @FXML
    private TextField tfSzinkron;

    @FXML
    private TableView<?> tvFilm;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}

