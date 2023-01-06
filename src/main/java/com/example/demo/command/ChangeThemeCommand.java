package com.example.demo.command;

import com.example.demo.setting.theme.Theme;

public class ChangeThemeCommand extends EditorCommand {
    private Theme theme;
    public ChangeThemeCommand(Theme setting) {
        super(); this.theme = setting;
    }

    @Override
    public void execute() {
        this.editorCareTaker.changeTheme(this.theme);

    }
}
