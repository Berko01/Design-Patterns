package prototype;

public class Category implements Cloneable {
    
    @Override
    protected Category clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return  (Category) super.clone();
    }

    private Long id;
    private String name;

    public Category(Long id){
        this.id = id;
        
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
    public String toString() {
        return "Category [id=" + id + ", name=" + name + "]";
    }
}
