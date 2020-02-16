package Command.Example3;

import java.util.Deque;
import java.util.LinkedList;

public class Wizard {

    private Deque<Command> undoStack = new LinkedList<>();
    private Deque<Command> redoStack = new LinkedList<>();

    public Wizard(){

    }

    public void castSpell(Command command, Target target){
        System.out.println(this.toString() + " casts " + command.toString() + " " + target);
        command.execute(target);
        undoStack.offerLast(command);
    }

    public void undoLastSpell(){
        if (!undoStack.isEmpty()){
            var previousSpell = undoStack.pollLast();
            redoStack.offerLast(previousSpell);
            System.out.println(this.toString() + " undoes " + previousSpell.toString());
            previousSpell.undo();
        }
    }

    public void redoLastSpell() {
        if (!redoStack.isEmpty()) {
            var previousSpell = redoStack.pollLast();
            undoStack.offerLast(previousSpell);
            System.out.println(this.toString() + " redoes " + previousSpell);
            previousSpell.redo();
        }
    }

    @Override
    public String toString() {
        return "Wizard";
    }
}
