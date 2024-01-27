import java.util.ArrayList;
import java.util.List;

public class ChanelActivity implements Activity {

    
    private static ArrayList<Chanel> list;



    public void addChanel(Chanel chanel) {
        list.add(chanel);
    }

    @Override
    public void onCreate() {

        list = new ArrayList<Chanel>();
    }

}
