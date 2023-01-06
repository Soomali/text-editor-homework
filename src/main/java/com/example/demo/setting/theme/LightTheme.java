package com.example.demo.setting.theme;

import com.example.demo.editor.EditorCareTaker;
import com.example.demo.setting.PaletteSetting;
import com.example.demo.setting.TextSetting;
import javafx.scene.paint.Color;

public class LightTheme extends Theme {
    private TextSetting textSetting = new TextSetting(20,Color.BLACK);
    private PaletteSetting paletteSetting = new PaletteSetting(Color.SNOW);
    @Override
    public TextSetting getTextSetting(){
        return textSetting;
    }

    @Override
    public PaletteSetting getPaletteSetting() {
        return paletteSetting;
    }

    @Override
    public void setTextSetting(TextSetting setting) {
        this.textSetting = setting;
    }

    @Override
    public void setPaletteSetting(PaletteSetting setting) {
        this.paletteSetting = setting;
    }



}
