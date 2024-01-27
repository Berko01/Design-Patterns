import java.util.ArrayList;
import java.util.List;

public class MsSql {
    private final List<User> userList;
    private int idCounter;

    public MsSql(){
        idCounter = 0;
        userList = new ArrayList<>();
    }

    
    public User userById(int id) {
        for(User user: userList){
            if(user.getId() == id)
             return user;

        }
        return null;
    
    }


    public void user(User user) {
        user.setId((idCounter++));
        userList.add(user);
    }
    
}
