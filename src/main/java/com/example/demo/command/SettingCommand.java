package com.example.demo.command;

import com.example.demo.setting.Setting;

public abstract class SettingCommand extends SaveFileCommand {
    public Setting setting ;
    public SettingCommand(Setting setting){
        this.setting = setting;
    }

}
