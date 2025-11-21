module com.mycompany.provamaven {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.provamaven to javafx.fxml;
    exports com.mycompany.provamaven;
}
