import java.util.ArrayList;
import java.util.List;

public class Memory {

    
    private List<NotePadMemento> list;

    public Memory() {
        list = new ArrayList<>();
    }

    public void add(NotePadMemento memento){
        list.add(memento);
    }

    public NotePadMemento getLatestVersion(){

        if (!list.isEmpty()){

            NotePadMemento latestVersion = list.get(list.size() - 1);

            list.remove(latestVersion);

            return latestVersion;
        } else {
            throw new ArrayIndexOutOfBoundsException("No loaded versions found!");
        }
    }
}