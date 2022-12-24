package com.example.demo.command;

import java.io.*;
public class SaveFileCommand extends EditorCommand{
    String filePath;
    String fileName;
    public SaveFileCommand(String filePath,String fileName){
        this.filePath = filePath;
        this.fileName = fileName;
    }

    @Override
    public void execute() {
        try
        {
            File file = new File(this.filePath +  "\\" + this.fileName);
            FileWriter fileWriter = new FileWriter(file.getAbsolutePath());
            fileWriter.write(editorCareTaker.getEditor().getState().getText());
            fileWriter.close();          //opens the specified file
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }


    }
}
