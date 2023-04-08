package editor.history;

import java.util.ArrayList;

public abstract class EditorHistoryBase implements History {
  private ArrayList<Memento> mementos = new ArrayList<>();

  @Override
  public void push(Memento memento){
    mementos.add(memento);
  }

  @Override
  public Memento undo(){
    if (!mementos.isEmpty()) {
      deleteLast();
      return mementos.isEmpty() ? null : mementos.get(mementos.size() - 1);
    }
    return null;
  }


  @Override
  public void deleteLast(){
    mementos.remove(mementos.size()-1);
  }
}
