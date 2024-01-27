public class MsSqlAdapter implements IDB {

    MsSql msSql = new MsSql();

    @Override
    public User selectUserById(int id) {
       return msSql.userById(id);
        
    }

    @Override
    public void insertUser(User user) {
        msSql.user(user);
    }



}
