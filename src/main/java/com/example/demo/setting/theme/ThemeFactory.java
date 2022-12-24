package com.example.demo.setting.theme;

public class ThemeFactory {
    static public Theme getInstance(String themeName ){
        if( themeName=="LightTheme"){
            return new LightTheme();
        }
        return new DarkTheme();
    }
}
