public class Finder {
    public String title;
    private WindowSystem winSys = new WindowSystem();

    public Finder(){
       this.title = this.winSys.windowDraw();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    
}
