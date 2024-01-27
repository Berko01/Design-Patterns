public class Designer extends Personel{

    
    String name;
    int id;
    

    public Designer(String name, int id) {
        this.name = name;
        this.id = id;
    }


    @Override
    public void showInfos() {
        System.out.println(name + " " + id );
    }
    
}