package com.example;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

public class MainController {

    Stage stage = new Stage();

    @FXML
    public ListView<String> carList;

    @FXML
    void initialize() {
        System.out.println("initialize");
        App._stage.setOnCloseRequest(event -> {
            System.out.println("onCloseRequest");
            StringBuilder content = new StringBuilder();
            for (String car : carList.getItems()) {
                content.append(car).append("\n");
            }
            Store.writeCars(content.toString());
        });
    }

    @FXML
    void onClickAddButton(ActionEvent event) {
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

        stage.setScene(scene);
        stage.show();
        DialogController dialogController = loader.getController();
        dialogController.setMainController(this); // vagy MainController.this

    }
}
