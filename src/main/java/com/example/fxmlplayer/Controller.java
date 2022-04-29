package com.example.fxmlplayer;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller {

    @FXML
    private MediaView mediaView;
    private MediaPlayer player;

    @FXML
    public void initialize() {
        String video = getClass().getResource("crushing_snakes.mp4").toExternalForm();
        Media media = new Media(video);
        player = new MediaPlayer(media);
        mediaView.setMediaPlayer(player);
    }

    @FXML
    void playVideo(MouseEvent event) {
        player.play();
    }

    @FXML
    void stopVideo(MouseEvent event) {
        player.stop();
    }

    @FXML
    void exitApplication(MouseEvent event) {
        Platform.exit();
    }
}
