package com.example.demo.command;

import java.io.*;
public class SaveFileCommand extends EditorCommand{
    String filePath;
    String fileName;

    public SaveFileCommand(String filePath,String fileName){
        this.filePath = filePath;
        this.fileName = fileName;
    }
    public SaveFileCommand(){

    }
    @Override
    public void execute() {
        try
        {
            File file;
            if(this.filePath != null) {
                file = new File(this.filePath +  "\\" + this.fileName);

            }else {
                file = new File(this.editorCareTaker.getEditor().getEditorState().getFilePath());
            }
            FileWriter fileWriter = new FileWriter(file.getAbsolutePath());
            fileWriter.write(editorCareTaker.getEditor().getEditorState().getText());
            fileWriter.close();          //opens the specified file
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }


    }
}
