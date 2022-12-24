package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class EditorController {
    @FXML
    private Label welcomeText;
    @FXML

    void openThemeDialog(ActionEvent event) throws IOException {
        onOpenDialog(event,"change-theme-dialog.fxml");
    }
@FXML
    void openTextDialog(ActionEvent event) throws IOException {
        onOpenDialog(event,"change-text-dialog.fxml");
    }

    void onOpenDialog(ActionEvent event,String resName) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(resName));
        Parent parent = fxmlLoader.load();

        Scene scene = new Scene(parent, 300, 200);
        Stage stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setScene(scene);
        stage.showAndWait();
    }

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}