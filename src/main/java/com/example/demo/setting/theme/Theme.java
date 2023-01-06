package com.example.demo.setting.theme;

import com.example.demo.setting.PaletteSetting;
import com.example.demo.setting.TextSetting;
import javafx.scene.text.Text;

public abstract class Theme implements Cloneable  {

    public abstract TextSetting getTextSetting();
    public abstract PaletteSetting getPaletteSetting();
    public abstract void setTextSetting(TextSetting setting);
    public abstract void setPaletteSetting(PaletteSetting setting);

    @Override
    public Theme clone() {
        try {
            Theme clone = (Theme) super.clone();
            clone.setTextSetting(getTextSetting().clone());
            clone.setPaletteSetting(getPaletteSetting().clone());
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
