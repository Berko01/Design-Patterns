import java.util.ArrayList;

public class Composite  extends Component{
    
    ArrayList<Component> componentList = new ArrayList<>();

    @Override
    public void operation() {
        System.out.println("Component Operation");
    }

    @Override
    public void add(Component comp) {
        componentList.add(comp);
    }

    @Override
    public void remove(Component comp) {
        componentList.remove(comp);
    }

    @Override
    public void getChild(int index) {
        componentList.get(index);
    }
    
}
