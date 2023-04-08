package editor.commands;

import editor.Command;
import editor.history.ConsoleEditorHistory;
import editor.history.History;
import editor.history.Memento;

import java.util.ArrayList;

public class UndoCommand implements Command {

  History consoleEditorHistory = ConsoleEditorHistory.getInstance();

  public UndoCommand() {}

  @Override
  public void execute(ArrayList<String> documentLines) {
    Memento memento = consoleEditorHistory.undo();
    documentLines.clear();
    if (memento != null){
      documentLines.addAll(memento.getState());
    }
  }
}
