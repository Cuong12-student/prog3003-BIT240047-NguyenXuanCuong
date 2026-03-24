module main.bai4 {
    requires javafx.controls;
    requires javafx.fxml;

    opens main.bai4 to javafx.fxml;
    exports main.bai4;
}
