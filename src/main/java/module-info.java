module website.nickb.cs476demo {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.jfxtras.styles.jmetro;

    opens website.nickb.cs476demo to javafx.fxml;
    exports website.nickb.cs476demo;
}