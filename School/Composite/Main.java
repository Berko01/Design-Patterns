public class Main {
    public static void main(String[] args) {
        Designer designer = new Designer("Jack", 2);
        Executive executive = new Executive("Micheal", 1);
        Developer developer = new Developer("Sarah", 0, "Frontend Developer");
        HumanResources humanResources = new HumanResources();

        humanResources.add(developer);
        humanResources.add(executive);
        humanResources.add(designer);

        humanResources.showInfos();

    }
}
