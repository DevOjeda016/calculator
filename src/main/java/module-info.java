module org.utl.dsm.calculator {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.utl.dsm.calculator to javafx.fxml;
    exports org.utl.dsm.calculator;
}