
public class Service {

    IDB db;

    public Service(IDB db) {
        setDb(db);
    }

    public User getUser(int ID) {
        return db.selectUserById(ID);
    }

    public void addUser(User user) {
        db.insertUser(user);

    }

    public IDB getDB() {
        return db;
    }

    public void setDb(IDB db) {
        this.db = db;
    }
}
