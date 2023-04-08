package editor.commands;


import editor.Command;
import editor.history.ConsoleEditorHistory;
import editor.history.History;
import editor.history.Memento;

import java.util.ArrayList;

public class UpdateCommand implements Command {

    History consoleEditorHistory = ConsoleEditorHistory.getInstance();
    private final String text;
    private final int lineNumber;

    public UpdateCommand(String text, int lineNumber) {
        this.text = text;
        this.lineNumber = lineNumber;
    }

    @Override
    public void execute(ArrayList<String> documentLines) {
        if (documentLines.size() > lineNumber){
          documentLines.set(lineNumber, text);
        }else {
          documentLines.add(text);
        }
      consoleEditorHistory.push(new Memento(documentLines));
    }
}
