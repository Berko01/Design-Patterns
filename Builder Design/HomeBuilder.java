public class HomeBuilder {
    private String city;
    private String district;
    private String neighbourhood;

    private int yearOfBuilding;
    private int numberOfbalconies;
    private int numberOfRoom;
    private int numberOfBath;
    private int numberOfToilet;

    private boolean isFurnished;
    private boolean isDublex;
    private boolean hasOtopark;
    private boolean hasPool;
    private boolean hasChildPark;
    private boolean hasAirConditioning;

    public static HomeBuilder startNormalHouseBuild(String city, String district, String neighboorhood,
            int yearOfBuilding,
            int numberOfRoom) {

        HomeBuilder homeBuilder = new HomeBuilder();
        homeBuilder.city = city;
        homeBuilder.district = district;
        homeBuilder.neighbourhood = neighboorhood;
        homeBuilder.yearOfBuilding = yearOfBuilding;
        homeBuilder.numberOfRoom = numberOfRoom;
        return new HomeBuilder();
    }

    public static HomeBuilder startHouseWithPoolBuild(String city, String district, String neighboorhood,
            int yearOfBuilding,
            int numberOfRoom) {

        HomeBuilder homeBuilder = new HomeBuilder();
        homeBuilder.city = city;
        homeBuilder.district = district;
        homeBuilder.neighbourhood = neighboorhood;
        homeBuilder.yearOfBuilding = yearOfBuilding;
        homeBuilder.numberOfRoom = numberOfRoom;
        homeBuilder.hasPool = true;
        return new HomeBuilder();
    }

    public Home build() {
        Home home = new Home();

        home.setCity(city);
        home.setDistrict(district);
        home.setDublex(isDublex);
        home.setFurnished(isFurnished);
        home.setHasAirConditioning(hasAirConditioning);
        home.setHasChildPark(hasChildPark);
        home.setHasOtopark(hasOtopark);
        home.setHasPool(hasPool);
        home.setNeighbourhood(neighbourhood);
        home.setNumberOfBath(numberOfBath);
        home.setNumberOfRoom(numberOfRoom);
        home.setNumberOfToilet(numberOfToilet);

        return home;
    }

    public HomeBuilder setNumberOfbalconies(int numberOfbalconies) {
        this.numberOfbalconies = numberOfbalconies;
        return this;

    }

    public HomeBuilder setNumberOfBath(int numberOfBath) {
        this.numberOfBath = numberOfBath;
        return this;

    }

    public HomeBuilder setNumberOfToilet(int numberOfToilet) {
        this.numberOfToilet = numberOfToilet;
        return this;

    }

    public HomeBuilder setFurnished(boolean isFurnished) {
        this.isFurnished = isFurnished;
        return this;

    }

    public HomeBuilder setDublex(boolean isDublex) {
        this.isDublex = isDublex;
        return this;

    }

    public HomeBuilder setHasOtopark(boolean hasOtopark) {
        this.hasOtopark = hasOtopark;
        return this;

    }

    public HomeBuilder setHasPool(boolean hasPool) {
        this.hasPool = hasPool;
        return this;

    }

    public HomeBuilder setHasChildPark(boolean hasChildPark) {
        this.hasChildPark = hasChildPark;
        return this;

    }

    public HomeBuilder setHasAirConditioning(boolean hasAirConditioning) {
        this.hasAirConditioning = hasAirConditioning;
        return this;

    }
}