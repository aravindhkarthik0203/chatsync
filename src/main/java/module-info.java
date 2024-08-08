module com.springak.chatsynchronaisation {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.springak.chatsynchronaisation to javafx.fxml;
    exports com.springak.chatsynchronaisation;
}