

public class Post  {

    String photo;
    String Content;


    public Post(String photo, String content) {
        this.photo = photo;
        Content = content;
    }



    public String getPhoto() {
        return photo;
    }



    public void setContent(String content) {
        Content = content;
    }



    public void setPhoto(String photo) {
        this.photo = photo;
    }



    public String getContent() {
        return Content;
    }



}
