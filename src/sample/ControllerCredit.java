package sample;

import com.jfoenix.controls.JFXButton;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import java.io.IOException;

public class ControllerCredit {
    @FXML
    private JFXButton Back;

    public void Minimize(MouseEvent mouseEvent) {
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

    public void close(MouseEvent mouseEvent) {
        System.exit(0);
    }


}
