package website.nickb.cs476demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import jfxtras.styles.jmetro.JMetro;
import jfxtras.styles.jmetro.Style;

import java.io.IOException;

public class DemoApplication extends Application
{
    // Temporary
    private static final boolean isWindows = true;

    @Override
    public void start(Stage stage) throws IOException
    {
        FXMLLoader fxmlLoader = new FXMLLoader(DemoApplication.class.getResource("demo-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 800, 600);
        stage.setTitle("CS-476 Demo");
        stage.setScene(scene);
        stage.show();

        if (isWindows) {
            // Use Windows-style UI style
            JMetro jMetro = new JMetro(Style.LIGHT);
            jMetro.setScene(scene);
        }
    }

    public static void main(String[] args)
    {
        launch();
    }
}