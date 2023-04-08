package editor.history;

public class ConsoleEditorHistory extends EditorHistoryBase {
  private static volatile ConsoleEditorHistory instance = null;
  private ConsoleEditorHistory() {
    if (instance != null){
      throw new RuntimeException("Usage getInstance() method to create");
    }
  }

  public static ConsoleEditorHistory getInstance() {
    if (instance == null) {
      synchronized(ConsoleEditorHistory.class) {
        if (instance == null) {
          instance = new ConsoleEditorHistory();
        }
      }
    }
    return instance;
  }
}
