package editor.history;

public interface History {
  void push(Memento memento);
  Memento undo();
  void deleteLast();
}
