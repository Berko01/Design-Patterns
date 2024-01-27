import java.util.Stack;

public class CommandManager {
    public Stack<ICommand> commands;

    public CommandManager() {
        this.commands = new Stack<ICommand>();
    }

    public Stack<ICommand> getCommands() {
        return commands;
    }

    public void setCommands(Stack<ICommand> commands) {
        this.commands = commands;
    }

    public void executeAll(){
        while(commands.size() > 0){
            commands.pop().execute();
        }
    }
}
