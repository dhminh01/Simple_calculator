module calculator.calculator {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    exports calculator.calculator.controller;
    opens calculator.calculator.controller to javafx.fxml;

    opens calculator.calculator to javafx.fxml;
    exports calculator.calculator;
}