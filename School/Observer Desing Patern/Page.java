

public class Page extends Observable implements IShareAbility{

    @Override
    public void share(Post post) {
        System.out.println("Gonderi paylasildi.");
        notifyObservers(post);
        
    }



    







}
