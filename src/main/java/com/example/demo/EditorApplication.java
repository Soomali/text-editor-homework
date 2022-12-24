package com.example.demo;

import com.example.demo.editor.EditorCareTaker;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Observable;
import java.util.Observer;

public class EditorApplication extends Application implements Observer {
    @Override
    public void start(Stage stage) throws IOException, InterruptedException {
        //EditorCareTaker.getInstance().
        FXMLLoader fxmlLoader = new FXMLLoader(EditorApplication.class.getResource("editor-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1000, 600);
        stage.setTitle("Hello!");

        stage.setScene(scene);
        stage.show();
    }


    public static void main(String[] args) {
        launch();
    }

    @Override
    public void update(Observable o, Object arg) {


    }
}