module com.example.gof {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.gof to javafx.fxml;
    exports com.example.gof;
}