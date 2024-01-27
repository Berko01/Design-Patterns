

public class User extends Observable implements IShareAbility, IObserver{

    @Override
    public void share(Post post) {
        System.out.println("Patylasim yapildi");
        notifyObservers(post);
    }


    @Override
    public void update(Post post){
        System.out.println("Aaa biri paylasim yapti.\n" + "Post: " + post.Content + " " + post.photo);
    }



}