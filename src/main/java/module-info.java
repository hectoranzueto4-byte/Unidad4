module com.yazidsystems.unidad4 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.yazidsystems.unidad4 to javafx.fxml;
    exports com.yazidsystems.unidad4;
    exports com.yazidsystems.unidad4.controller;
    opens com.yazidsystems.unidad4.controller to javafx.fxml;
}