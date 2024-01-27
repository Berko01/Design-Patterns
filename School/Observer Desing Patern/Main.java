public class Main {
    public static void main(String[] args) {
        User user1 = new User();       
        User user2 = new User();
        User user3 = new User();
        Group group = new Group();

        Post post = new Post("Beko.png","Selamlar!!!");

        user1.add(user3);
        user1.add(user2);
        user1.add(group);

        user1.share(post);




        



    }
}
