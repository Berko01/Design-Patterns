

public class Group implements IObserver {



    @Override
    public void update(Post post) {
        System.out.println("Post alindi." + post.getContent() + " " + post.getPhoto());
    }



    
    
}
