package com.example.demo.editor;

import com.example.demo.setting.PaletteSetting;
import com.example.demo.setting.TextSetting;
import com.example.demo.setting.theme.Theme;

import java.util.ArrayList;

public class EditorCareTaker {

    private Editor editor;
    private final ArrayList<EditorState> history = new ArrayList<>();
    public Editor getEditor() {
        return this.editor;
    }
    public void  setEditor(Editor editor){
        this.editor = editor;
    }

    private static EditorCareTaker instance = null;
    private EditorCareTaker() {
        this.editor = new Editor();
    }
    public void undo(){
        int size = history.size();
        if(size == 0) return;
        EditorState previous = history.get(size - 1);
        this.editor.restore(previous);
        history.remove(history.size() - 1);
    }

    public void save(){
        this.history.add(editor.save()) ;
    }
    public void changeTheme(Theme newTheme) {
        EditorState currentState = editor.getEditorState();
        Theme currentTheme = currentState.getTheme();
        if(currentTheme.getClass() == newTheme.getClass()) {
            return;
        }

        TextSetting currentTextSetting = currentTheme.getTextSetting().clone();
        currentTextSetting.fontColor = newTheme.getTextSetting().fontColor;
        newTheme.setTextSetting(currentTextSetting);
        updateTheme(newTheme);
    }
    private void updateTheme(Theme theme) {
        EditorState currentState = editor.getEditorState();
        save();
        EditorState nextState = currentState.clone();
        nextState.setTheme(theme);
        editor.restore(nextState);
    }
    public void changeTextSetting(TextSetting textSetting) {
        Theme theme = this.editor.getEditorState().getTheme().clone();
        theme.setTextSetting(textSetting);
        updateTheme(theme);
    }
    public void changePaletteSetting(PaletteSetting paletteSetting) {
        Theme theme = this.editor.getEditorState().getTheme().clone();
        theme.setPaletteSetting(paletteSetting);
        updateTheme(theme);
    }

    public void changeText(String text) {
        EditorState state = this.editor.getEditorState();

        String newText;
        if( text == null){
            newText = "";
        }else {
            newText = text;
        }
        if(newText.equals(state.getText())) {
            return ;
        }
        EditorState clone = state.clone();
        clone.setText(text);
        save();
        this.editor.restore(clone);
    }
    public void changeFilepath( String filePath) {
        EditorState clone = this.editor.getEditorState().clone();
        clone.setFilePath(filePath);
        save();
        this.editor.restore(clone);
    }
    public static EditorCareTaker getInstance() {
        if(instance == null){
            instance = new EditorCareTaker();
        }
        return instance;
    }



}
