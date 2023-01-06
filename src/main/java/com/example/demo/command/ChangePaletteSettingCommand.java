package com.example.demo.command;

import com.example.demo.setting.PaletteSetting;

public class ChangePaletteSettingCommand extends EditorCommand {
    PaletteSetting paletteSetting;
    public ChangePaletteSettingCommand(PaletteSetting setting) {
        super(); this.paletteSetting = setting;
    }

    @Override
    public void execute() {
        this.editorCareTaker.changePaletteSetting(paletteSetting);
    }
}
