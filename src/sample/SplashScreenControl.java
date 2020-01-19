package sample;
import javafx.animation.FadeTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.StageStyle;

import javax.swing.text.html.ImageView;
import java.net.URL;
import javafx.util.Duration;
import java.util.ResourceBundle;

public class SplashScreenControl implements Initializable {
    @FXML
    private Label lab;
    @FXML
    private AnchorPane Parant;

    @FXML
    private ImageView img;

    void setid(){
        for (int i = 0; i <10; i++) {
           lab.setText(i+"%");
        }
    }
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        System.out.println("in conrrolar first");
    }
}