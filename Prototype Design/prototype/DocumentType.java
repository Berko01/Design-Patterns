package prototype;

public class DocumentType implements Cloneable {
    private Long id;
    private String name;
    public DocumentType(Long id) {
        this.id = id;
    }
    @Override
    public String toString() {
        return "DocumentType [id=" + id + ", name=" + name + "]";
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    protected DocumentType clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return (DocumentType) super.clone();
    }
}
