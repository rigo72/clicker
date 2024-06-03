module com.clicker.pcto {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.clicker.pcto to javafx.fxml;
    exports com.clicker.pcto;
}
