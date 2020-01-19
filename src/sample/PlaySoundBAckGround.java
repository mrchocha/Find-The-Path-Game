package sample;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import java.io.File;

public class PlaySoundBAckGround {
    public void PlaySoundBAckGround() {
        String musicFile = "D:\\pro1\\src\\sample\\melodyloops-preview-simple-happy-2m30s.mp3";     // For example
        Media sound = new Media(new File(musicFile).toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(sound);
        mediaPlayer.play();
    }

}
