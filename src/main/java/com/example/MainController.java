package com.example;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainController {

    @FXML
    void onClickShowButton(ActionEvent event) {
        showDialog();

    }

    void showDialog() {
        try {
            tryshowDialog();
        } catch (IOException e) {
            System.err.println(e.getMessage());

        }
    }

    void tryshowDialog() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("dialogScene.fxml"));
        Scene scene = new Scene(loader.load());
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();

    }
}
