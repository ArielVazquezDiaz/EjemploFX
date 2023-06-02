module com.example.ejemplofx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ejemplofx to javafx.fxml;
    exports com.example.ejemplofx;
}