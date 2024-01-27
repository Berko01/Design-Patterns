import java.util.ArrayList;
import java.util.List;

public class Oracle implements IDB {

    private final List<User> userList;
    private int idCounter;

    public Oracle() {
        idCounter = 0;
        userList = new ArrayList<>();
    }

    public User selectUserById(int id) {
        for (User user : userList) {
            if (user.getId() == id)
                return user;

        }
        return null;
    }

    public void insertUser(User user) {
        count();
        user.setId(idCounter);
        userList.add(user);

    }

    private void count() {
        idCounter = idCounter + 1;
    }
}