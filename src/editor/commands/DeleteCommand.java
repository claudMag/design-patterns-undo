package editor.commands;


import editor.Command;
import editor.history.ConsoleEditorHistory;
import editor.history.History;
import editor.history.Memento;

import java.util.ArrayList;

public class DeleteCommand implements Command {

  History consoleEditorHistory = ConsoleEditorHistory.getInstance();
  private final int lineNumber;

  public DeleteCommand(int lineNumber) {
    this.lineNumber = lineNumber;
  }

  @Override
  public void execute(ArrayList<String> documentLines) {
    documentLines.remove(lineNumber);
    consoleEditorHistory.push(new Memento(documentLines));
  }
}
