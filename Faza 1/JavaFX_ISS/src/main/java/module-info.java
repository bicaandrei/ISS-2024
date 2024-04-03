module ro.iss2024.javafx_iss {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens ro.iss2024.javafx_iss to javafx.fxml;
    exports ro.iss2024.javafx_iss;
}