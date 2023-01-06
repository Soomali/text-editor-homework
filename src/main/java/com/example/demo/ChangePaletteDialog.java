package com.example.demo;

import com.example.demo.command.ChangePaletteSettingCommand;
import com.example.demo.editor.EditorCareTaker;
import com.example.demo.setting.PaletteSetting;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.ColorPicker;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class ChangePaletteDialog {


    public ColorPicker PaletteColorPicker;

    @FXML
    private void onSave(ActionEvent event){

        Color color = PaletteColorPicker.getValue();
        PaletteSetting newPaletteSetting = EditorCareTaker.getInstance().getEditor().getEditorState().getTheme().getPaletteSetting().clone();
        newPaletteSetting.backgroundColor = color;
        ChangePaletteSettingCommand command = new ChangePaletteSettingCommand(newPaletteSetting);
        command.execute();

        Node source = (Node)  event.getSource();
        Stage stage  = (Stage) source.getScene().getWindow();
        stage.close();
    }
}
