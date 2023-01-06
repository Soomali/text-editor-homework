package com.example.demo.editor;

import com.example.demo.command.ChangePaletteSettingCommand;
import com.example.demo.command.ChangeTextCommand;
import com.example.demo.command.ChangeTextSettingCommand;
import com.example.demo.command.UndoCommand;
import com.example.demo.setting.PaletteSetting;
import com.example.demo.setting.TextSetting;
import javafx.scene.paint.Color;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EditorTest {

    @Test
    void textChangeTest() {

        EditorCareTaker careTaker = EditorCareTaker.getInstance();
        new ChangeTextCommand("changed text").execute();
        assertEquals("changed text",careTaker.getEditor().getEditorState().getText());
    }
    @Test
    void textSettingChangeTest() {

        EditorCareTaker careTaker = EditorCareTaker.getInstance();
        TextSetting setting = new TextSetting(25, Color.LIGHTGRAY);
        new ChangeTextSettingCommand(setting).execute();
        TextSetting current = careTaker.getEditor().getEditorState().getTheme().getTextSetting();
        assertEquals(setting.fontSize,current.fontSize);
        assertEquals(setting.fontColor,current.fontColor);

    }
    @Test
    void paletteSettingChangeTest() {

        EditorCareTaker careTaker = EditorCareTaker.getInstance();
        PaletteSetting setting = new PaletteSetting(Color.LIGHTGRAY);
        new ChangePaletteSettingCommand(setting).execute();
        PaletteSetting current = careTaker.getEditor().getEditorState().getTheme().getPaletteSetting();
        assertEquals(setting.backgroundColor,current.backgroundColor);
    }

    @Test
    void undoTest() {
        EditorCareTaker careTaker = EditorCareTaker.getInstance();
        new ChangeTextCommand("changed text").execute();
        new ChangeTextCommand("second changed text").execute();
        new UndoCommand().execute();
        assertEquals("changed text",careTaker.getEditor().getEditorState().getText());

    }
}