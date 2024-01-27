public class App {
    public static void main(String[] args) {
        User user = new User();

        Service service = new Service(new Oracle());
        Service service2 = new Service(new MsSqlAdapter());

        service.addUser(user);
        service.getUser(0);

        service2.getUser(0);
        service2.addUser(user);
        

    }
}
