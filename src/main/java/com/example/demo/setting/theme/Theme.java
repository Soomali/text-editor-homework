package com.example.demo.setting.theme;

import com.example.demo.setting.PalletteSetting;
import com.example.demo.setting.TextSetting;
import javafx.scene.paint.Color;

public abstract class Theme {
    abstract TextSetting getTextSetting();
    abstract PalletteSetting getPalletteSetting();
}
