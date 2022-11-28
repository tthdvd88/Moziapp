module com.example.moziapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.moziapp to javafx.fxml;
    exports com.example.moziapp;
}