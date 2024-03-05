module com.example.minipr {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires javafx.media;


    opens com.example.minipr to javafx.fxml;
    exports com.example.minipr;
}