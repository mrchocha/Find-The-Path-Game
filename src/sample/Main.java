package sample;

import javafx.animation.FadeTransition;
import javafx.animation.PauseTransition;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;

import java.io.File;
import java.io.IOException;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root1 = FXMLLoader.load(getClass().getResource("MainScreeen.fxml"));
        primaryStage.initStyle(StageStyle.UNDECORATED);
        primaryStage.setTitle("Buttons");
        primaryStage.setScene(new Scene(root1, 1300, 700));
       // primaryStage.show();
        StartFirst(primaryStage);
    }
    public void StartFirst(Stage SecondStage) throws IOException {
        Stage FirstStage=new Stage(StageStyle.TRANSPARENT);
        Parent root1 = FXMLLoader.load(getClass().getResource("SplashScreen.fxml"));
        FirstStage.setScene(new Scene(root1));
        FirstStage.show();
        PauseTransition transition= new PauseTransition(Duration.millis(3000));
        transition.setOnFinished(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                 FirstStage.close();
                 SecondStage.show();
            }
        });
        transition.play();
  }
    public static void main(String[] args) {
        /*PlaySoundBAckGround ply=new PlaySoundBAckGround();
        ply.PlaySoundBAckGround();*/
        String musicFile = "C:\\Users\\i\\Documents\\Maze\\pro1-20200104T053634Z-001\\pro1\\src\\sample\\melodyloops-preview-simple-happy-2m30s.mp3";     // For example
        Media sound = new Media(new File(musicFile).toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(sound);
        mediaPlayer.setCycleCount(MediaPlayer.INDEFINITE);
        mediaPlayer.play();
        launch(args);


    }
}
