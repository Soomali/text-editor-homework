package com.example.demo.command;

import com.example.demo.setting.TextSetting;

public class ChangeTextSettingCommand extends EditorCommand {
    private TextSetting setting;
    public ChangeTextSettingCommand(TextSetting setting) {
        super(); this.setting = setting;
    }

    @Override
    public void execute() {
        this.editorCareTaker.changeTextSetting( setting);
    }
}
