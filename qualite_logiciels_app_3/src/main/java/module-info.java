module fr.ldumay.qualite_logiciels_app_4 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens fr.ldumay to javafx.fxml;
    exports fr.ldumay;
    exports fr.ldumay.views;
    opens fr.ldumay.views to javafx.fxml;
}