package website.nickb.cs476demo;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SplitPane;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

import java.net.URL;
import java.util.ResourceBundle;

import static javafx.application.Application.STYLESHEET_MODENA;

public class DemoController implements Initializable
{
    @FXML
    public AnchorPane rootPane;
    @FXML
    public StackPane imageContainer;
    @FXML
    public ImageView sampleImage;
    @FXML
    public SplitPane infoPane;
    @FXML
    public AnchorPane calcInfoPane;
    @FXML
    public AnchorPane controlInfoPane;
    @FXML
    public VBox infoVBox;
    @FXML
    public MenuItem changeThemeItem;

    @Override
    public void initialize(URL location, ResourceBundle resources)
    {
        // JavaFX views are not null here

        sampleImage.fitWidthProperty().bind(imageContainer.widthProperty());
        sampleImage.fitHeightProperty().bind(imageContainer.heightProperty());

        infoVBox.setFillWidth(true);
    }
}