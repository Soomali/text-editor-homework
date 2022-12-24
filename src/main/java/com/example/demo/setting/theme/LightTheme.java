package com.example.demo.setting.theme;

import com.example.demo.setting.PalletteSetting;
import com.example.demo.setting.TextSetting;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;

public class LightTheme extends Theme {
    public TextSetting getTextSetting(){
        TextSetting a= new TextSetting(20, Color.BLACK);
        return a;
    }

    @Override
    public PalletteSetting getPalletteSetting() {
        PalletteSetting b= new PalletteSetting(Color.SNOW);
        return null;
    }

}
