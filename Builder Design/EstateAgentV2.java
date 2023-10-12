public class EstateAgentV2 {
    public static void main(String[] args) {
        Home home1 = HomeBuilder.startNormalHouseBuild("Istanbul", "Umraniye", "Tatlisu", 2008, 3)
                .setHasChildPark(true)
                .setHasOtopark(true)
                .build();

        Home home2 = HomeBuilder.startHouseWithPoolBuild("Istanbul", "Atasehir", "Ataturk", 2010, 4)
                .setHasChildPark(true)
                .setHasOtopark(true)
                .build();
        printHome(home1);
    }

    private static void printHome(Home home) {
        System.out.println();
        System.out.println("Ev eklendi -> " + home);
    }

}
