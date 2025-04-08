package com.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.stage.Stage;

public class DialogController {

    MainController mainController;

    @FXML
    void onClickCloseButton(ActionEvent event) {
        // Stage stage = (Stage) ((javafx.scene.Node) event.getSource())
        // .getScene()
        // .getWindow();
        // stage.close();
        mainController.stage.close();
    }

    public void setMainController(MainController mainController) {
        this.mainController = mainController;
    }
}
