package com.example.demo;

import com.example.demo.command.*;
import com.example.demo.editor.Editor;
import com.example.demo.editor.EditorCareTaker;
import com.example.demo.editor.EditorState;
import com.example.demo.setting.PaletteSetting;
import com.example.demo.setting.TextSetting;
import com.example.demo.setting.theme.Theme;
import javafx.beans.InvalidationListener;
import javafx.beans.Observable;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Cursor;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;


public class EditorController  implements InvalidationListener {
    public EditorController() {

        Editor editor = EditorCareTaker.getInstance().getEditor();
        editor.addListener(this);

    }
    @FXML
    private TextArea mainTextArea;
    @FXML

    void openThemeDialog(ActionEvent event) throws IOException {
        onOpenDialog(event,"change-theme-dialog.fxml");
    }
@FXML
    void openTextDialog(ActionEvent event) throws IOException {
        onOpenDialog(event,"change-text-dialog.fxml");
    }
    @FXML
    void openEditorDialog(ActionEvent event) throws IOException {
        onOpenDialog(event,"change-palette-dialog.fxml");
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


    public void chooseFile(ActionEvent event) {
        OpenFileCommand command = new OpenFileCommand(new FileOpenHandler() {
            @Override
            public void onFileOpened(String text) {
                mainTextArea.setText(text);
            }
        });
        command.execute();
    }
    @FXML
    private void undo(ActionEvent event) {

        UndoCommand command = new UndoCommand();
        command.execute();

    }
    @FXML
    private void saveToFile(ActionEvent event) {
        new SaveFileCommand().execute();
    }
    @FXML
    private void initialize(){
        mainTextArea.textProperty().addListener((observableValue, oldValue, newValue) -> new ChangeTextCommand(newValue).execute());

        mainTextArea.addEventFilter(KeyEvent.ANY, e -> {
            if (e.getCode() == KeyCode.Z && e.isShortcutDown()) {
                new UndoCommand().execute();
                e.consume();
            }
        });
    }

    @Override
    public void invalidated(Observable observable) {
        if(observable instanceof Editor) {
            EditorState state = ((Editor) observable).getEditorState();
            Theme theme = state.getTheme();
            TextSetting textSetting = theme.getTextSetting();
            PaletteSetting paletteSetting = theme.getPaletteSetting();

            String style = "-fx-text-fill: " + EditorApplication.toHexString(textSetting.fontColor) + ";" +
                    "-fx-font-size: " + textSetting.fontSize + ";";

            mainTextArea.lookup(".content").setStyle( "-fx-background-color: " + EditorApplication.toHexString(paletteSetting.backgroundColor) + ";");
            mainTextArea.setStyle(style);
            mainTextArea.setText(state.getText());
            mainTextArea.positionCaret(state.getText().length());

        }
    }

}