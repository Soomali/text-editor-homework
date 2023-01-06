package com.example.demo.setting.theme;

import com.example.demo.setting.TextSetting;

public class ThemeFactory {
    static public Theme getInstance(String themeName){
        if(themeName.equals("Light")){
            return new LightTheme();
        }
        return new DarkTheme();
    }
    static public Theme getInstance(String themeName, TextSetting textSetting) {
        Theme theme = getInstance(themeName);
        theme.setTextSetting(textSetting);
        return theme;
    }
}
