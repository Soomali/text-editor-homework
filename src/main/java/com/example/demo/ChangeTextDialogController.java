package com.example.demo;

import com.example.demo.command.ChangeTextSettingCommand;
import com.example.demo.command.EditorCommand;
import com.example.demo.editor.EditorCareTaker;
import com.example.demo.setting.TextSetting;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class ChangeTextDialogController{
    @FXML
    public ColorPicker TextColorPicker;
    @FXML
    public TextField tfFontSize;
    @FXML
    private void onSave(ActionEvent event) {
        Color newColor =  TextColorPicker.getValue();
        int fontSize;
    try {
        fontSize = Integer.parseInt(tfFontSize.getText());

    }catch(Exception e){
        fontSize = EditorCareTaker.getInstance().getEditor().getEditorState().getTheme().getTextSetting().fontSize;
    }
        TextSetting setting = new TextSetting(fontSize,newColor);

        EditorCommand command = new ChangeTextSettingCommand(setting);
        command.execute();

        Node source = (Node)  event.getSource();
        Stage stage  = (Stage) source.getScene().getWindow();
        stage.close();
    }


}
