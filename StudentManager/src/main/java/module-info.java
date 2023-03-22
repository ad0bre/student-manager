module com.example.studentmanager {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.studentmanager to javafx.fxml;
    exports com.example.studentmanager;
}