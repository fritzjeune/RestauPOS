module com.ayitigenius.restaupos {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.ayitigenius.restaupos to javafx.fxml;
    exports com.ayitigenius.restaupos;
}