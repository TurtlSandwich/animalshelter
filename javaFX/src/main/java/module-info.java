module org.openjfx {
    requires animalshelterlogic;
    requires javafx.controls;
    requires javafx.fxml;

    opens org.openjfx to javafx.fxml;
    exports org.openjfx;
}