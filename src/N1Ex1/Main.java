package N1Ex1;

public class Main {

    public static void main(String[] args) {
      Undo undo = Undo.getInstance();
      undo.addOrder("jump");
      undo.addOrder("talk");
      undo.addOrder("sing");
      undo.deleteOrder("talk");
      undo.readList();
    }
}