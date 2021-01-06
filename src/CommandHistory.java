import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class CommandHistory {

    private Stack<Command> history = new Stack<>();

    public void push(Command command){
        this.history.add(command);
    }

    public Command pop () {
        return this.history.pop();
    }

}
