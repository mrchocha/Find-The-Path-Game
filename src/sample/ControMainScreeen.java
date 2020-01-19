package sample;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.media.Media;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;

public class ControMainScreeen {
    public void PlaySound(){
        String musicFile = "C:\\Users\\i\\Documents\\Maze\\pro1-20200104T053634Z-001\\pro1\\src\\sample\\button-3.mp3";     // For example
        Media sound = new Media(new File(musicFile).toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(sound);
        mediaPlayer.play();
    }
    public void Playclicked(MouseEvent mouseEvent) throws IOException, SQLException, ClassNotFoundException {
        PlaySound();
        FXMLLoader fxmlLoader=new FXMLLoader(getClass().getResource("Stage.fxml"));
        Parent root =(Parent)fxmlLoader.load();
        StageController st=fxmlLoader.getController();
        st.MakeStages();
        Stage stage =new Stage();
        stage.setScene(new Scene(root,1300,700));
        stage.initStyle(StageStyle.UNDECORATED);
        stage.show();
        ((Node)(mouseEvent.getSource())).getScene().getWindow().hide();
    }

    @FXML
    void MakeYourOwnLevelclicked(MouseEvent event) throws IOException {
        PlaySound();
        FXMLLoader fxmlLoader=new FXMLLoader(getClass().getResource("/sample/fxmls/VBtns.fxml"));
        Parent root =(Parent)fxmlLoader.load();
        Controller ps=fxmlLoader.getController();
        ps.InitilizerBtn();
        ps.make_pair();
        Stage stage =new Stage();
        stage.setScene(new Scene(root,1300,730));
        stage.initStyle(StageStyle.UNDECORATED);
        stage.show();
        ((Node)(event.getSource())).getScene().getWindow().hide();
    }
    @FXML
    void ScoreTableClk(MouseEvent event) throws IOException {
        PlaySound();
        FXMLLoader fxmlLoader=new FXMLLoader(getClass().getResource("ScoreTable.fxml"));
        Parent root =(Parent)fxmlLoader.load();
        Stage stage =new Stage();
        stage.setScene(new Scene(root,1300,700));
        stage.initStyle(StageStyle.UNDECORATED);
        stage.show();
        ((Node)(event.getSource())).getScene().getWindow().hide();
    }
    @FXML
    void Credits(MouseEvent event) throws IOException, SQLException, ClassNotFoundException {
        PlaySound();
        FXMLLoader fxmlLoader=new FXMLLoader(getClass().getResource("Credts.fxml"));
        Parent root =(Parent)fxmlLoader.load();
        Stage stage =new Stage();
        stage.setScene(new Scene(root,1300,700));
        stage.initStyle(StageStyle.UNDECORATED);
        stage.show();
        ((Node)(event.getSource())).getScene().getWindow().hide();
    }
    @FXML
    void HowToPlay(MouseEvent event) throws IOException {
        PlaySound();
        FXMLLoader fxmlLoader=new FXMLLoader(getClass().getResource("HowToPlay.fxml"));
        Parent root =(Parent)fxmlLoader.load();
        Stage stage =new Stage();
        stage.setScene(new Scene(root,1300,700));
        stage.initStyle(StageStyle.UNDECORATED);
        stage.show();
        ((Node)(event.getSource())).getScene().getWindow().hide();
    }

    public void Minimize(MouseEvent mouseEvent) {
        Stage s= (Stage) ((Node)mouseEvent.getSource()).getScene().getWindow();
        s.setIconified(true);
    }

    public void close(MouseEvent mouseEvent) {
            System.exit(0);
    }


}
