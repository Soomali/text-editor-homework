package com.example.demo.setting;

import com.example.demo.editor.EditorCareTaker;
import javafx.fxml.JavaFXBuilderFactory;

public interface Setting {
    public void Save();

    public void Apply(EditorCareTaker taker);
}
