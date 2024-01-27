import java.util.LinkedList;
import java.util.Queue;

public class Invoker {
    Queue<ICommand> commandList = new LinkedList<>();

    public void addCommand(ICommand command){
        commandList.add(command);
    }

    public void executeAll(){
        while(commandList.size() > 0){
            commandList.poll().execute();
        }
    }
}
