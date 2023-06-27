module com.example.mfi2praktika {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.mfi2praktika to javafx.fxml;
    exports com.example.mfi2praktika;
}