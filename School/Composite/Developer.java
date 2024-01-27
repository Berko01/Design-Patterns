public class Developer extends Personel {

    String name;
    int id;
    String developerType;

    public Developer(String name, int id, String developerType) {
        this.name = name;
        this.id = id;
        this.developerType = developerType;
    }

    @Override
    public void showInfos() {
        System.out.println(name + " " + id + " " + developerType);
    }
    
}
