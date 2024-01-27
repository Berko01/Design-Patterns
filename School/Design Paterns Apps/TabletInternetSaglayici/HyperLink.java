public class HyperLink extends DocumentPart {

    public String url;

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    
}
