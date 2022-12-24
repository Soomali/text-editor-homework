package com.example.demo.setting.theme;

import com.example.demo.setting.PalletteSetting;
import com.example.demo.setting.TextSetting;
import javafx.scene.paint.Color;

public class DarkTheme extends Theme {
    public TextSetting getTextSetting(){
        TextSetting a= new TextSetting(20,  Color.GRAY);
        return a;
    }

    @Override
    public PalletteSetting getPalletteSetting() {
        PalletteSetting b= new PalletteSetting(Color.BLANCHEDALMOND);
        return b;
    }
}
