package editor.commands;
import editor.Command;
import editor.history.ConsoleEditorHistory;
import editor.history.History;
import editor.history.Memento;

import java.util.ArrayList;

public class AppendCommand implements Command {
  History consoleEditorHistory = ConsoleEditorHistory.getInstance();
  private final String text;

  public AppendCommand(String text) {
    this.text = text;
  }

  @Override
  public void execute(ArrayList<String> documentLines) {
    documentLines.add(text);
    consoleEditorHistory.push(new Memento(documentLines));
  }
}
