package com.example.demo;

import com.example.demo.command.ChangeThemeCommand;
import com.example.demo.editor.EditorCareTaker;
import com.example.demo.setting.theme.LightTheme;
import com.example.demo.setting.theme.ThemeFactory;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

public class ChangeThemeDialogController {

    @FXML
    private ToggleGroup toggleGroup;
    @FXML
    private RadioButton lightThemeRadioButton;

    @FXML
    private RadioButton darkThemeRadioButton;

    @FXML
    private void initialize(){
        if(EditorCareTaker.getInstance().getEditor().getEditorState().getTheme() instanceof LightTheme) {
            lightThemeRadioButton.setSelected(true);
        } else {
            darkThemeRadioButton.setSelected(true);
        }
    }

    @FXML
    private void closeStage(ActionEvent event) {
        RadioButton selectedRadioButton = (RadioButton) toggleGroup.getSelectedToggle();
        String toggleGroupValue = selectedRadioButton.getText();
        ChangeThemeCommand command = new ChangeThemeCommand(ThemeFactory.getInstance(toggleGroupValue));
        command.execute();
        Node source = (Node)  event.getSource();
        Stage stage  = (Stage) source.getScene().getWindow();
        stage.close();
    }

}
