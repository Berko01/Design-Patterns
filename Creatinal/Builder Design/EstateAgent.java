public class EstateAgent {

    public static void main(String[] args) {

        Home home1 = new Home();

        home1.setCity("Istanbul");
        home1.setDistrict("Atasehir");
        home1.setNeighbourhood("Ataturk");
        home1.setNumberOfRoom(3);
        home1.setYearOfBuilding(2010);
        home1.setHasAirConditioning(true);

        Home home2 = new Home("Istanbul", "Umraniye", "Tatlisu", 2008, 2, 3, 2, 0, false, false, true, true, true,
                false);

        printHome(home1);
        printHome(home2);

    }

    private static void printHome(Home home) {
        System.out.println();
        System.out.println("Ev eklendi -> " + home);
    }

}
