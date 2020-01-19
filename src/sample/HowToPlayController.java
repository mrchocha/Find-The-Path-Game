package sample;

import com.jfoenix.controls.JFXButton;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class HowToPlayController implements Initializable {

    @FXML
    private ImageView imageview;
    @FXML
    private Label labins;

    @FXML
    private JFXButton Back;
    int imagecount=0;

    public void Minimize(MouseEvent mouseEvent)  {
        Stage s= (Stage) ((Node)mouseEvent.getSource()).getScene().getWindow();
        s.setIconified(true);

    }
    @FXML
    void GoBack(MouseEvent event) throws IOException {
        Stage BackStage=new Stage(StageStyle.TRANSPARENT);
        Parent root1 = FXMLLoader.load(getClass().getResource("MainScreeen.fxml"));
        BackStage.setScene(new Scene(root1));
        BackStage.show();
        ((Node)(event.getSource())).getScene().getWindow().hide();

    }
    @FXML
    void NextClicked(MouseEvent event) {
        imagecount++;
        String strins[]={"ClICK ON PLAY BUTTON!","SELECT ANY STAGE"," GREEN: START POINT   RED:END POINT   GRAY:WALLS","TRY TO REACH START TO END WITH MINIMUM DISTANCE","GET SCORE", "REGISTER THE NAME"};
        if(imagecount==6){imagecount=0;}
        File imageFile = new File("C:\\Users\\i\\Documents\\Maze\\pro1-20200104T053634Z-001\\pro1\\src\\sample\\"+imagecount+".jpg");
        if (imageFile.exists()) {
            Image image = new Image(imageFile.toURI().toString());
            imageview.setImage(image);
            labins.setText(strins[imagecount]);
        }
        else {
            System.out.println("NOOOOOOOO!!!!!!!!!!!!!!!!!!!!");
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        File imageFile = new File("C:\\Users\\i\\Documents\\Maze\\pro1-20200104T053634Z-001\\pro1\\src\\sample\\0.jpg");
        labins.setText("ClICK ON PLAY BUTTON!");
        System.out.println(imageFile.getAbsolutePath());
        if (imageFile.exists()) {
            Image image = new Image(imageFile.toURI().toString());
            imageview.setImage(image);
        }
        else {
            System.out.println("NOOOOOOOO!!!!!!!!!!!!!!!!!!!!");
        }
    }
    public void close(MouseEvent mouseEvent) {
        System.exit(0);
    }
}
