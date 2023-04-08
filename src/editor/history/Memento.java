package editor.history;
import java.util.ArrayList;

public class Memento {
  private ArrayList<String> state;

  public Memento(ArrayList<String> state) {
    this.state = new ArrayList<>(state);
  }

  public ArrayList<String> getState() {
    return state;
  }

}
