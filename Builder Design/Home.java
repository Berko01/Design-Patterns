public class Home {
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

    public Home(String city, String district, String neighbourhood, int yearOfBuilding, int numberOfbalconies,
            int numberOfRoom, int numberOfBath, int numberOfToilet, boolean isFurnished, boolean isDublex,
            boolean hasOtopark, boolean hasPool, boolean hasChildPark, boolean hasAirConditioning) {
        this.city = city;
        this.district = district;
        this.neighbourhood = neighbourhood;
        this.yearOfBuilding = yearOfBuilding;
        this.numberOfbalconies = numberOfbalconies;
        this.numberOfRoom = numberOfRoom;
        this.numberOfBath = numberOfBath;
        this.numberOfToilet = numberOfToilet;
        this.isFurnished = isFurnished;
        this.isDublex = isDublex;
        this.hasOtopark = hasOtopark;
        this.hasPool = hasPool;
        this.hasChildPark = hasChildPark;
        this.hasAirConditioning = hasAirConditioning;
    }

    public Home() {

    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getNeighbourhood() {
        return neighbourhood;
    }

    public void setNeighbourhood(String neighbourhood) {
        this.neighbourhood = neighbourhood;
    }

    public int getYearOfBuilding() {
        return yearOfBuilding;
    }

    public void setYearOfBuilding(int yearOfBuilding) {
        this.yearOfBuilding = yearOfBuilding;
    }

    public int getNumberOfbalconies() {
        return numberOfbalconies;
    }

    public void setNumberOfbalconies(int numberOfbalconies) {
        this.numberOfbalconies = numberOfbalconies;
    }

    public int getNumberOfRoom() {
        return numberOfRoom;
    }

    public void setNumberOfRoom(int numberOfRoom) {
        this.numberOfRoom = numberOfRoom;
    }

    public int getNumberOfBath() {
        return numberOfBath;
    }

    public void setNumberOfBath(int numberOfBath) {
        this.numberOfBath = numberOfBath;
    }

    public int getNumberOfToilet() {
        return numberOfToilet;
    }

    public void setNumberOfToilet(int numberOfToilet) {
        this.numberOfToilet = numberOfToilet;
    }

    public boolean isFurnished() {
        return isFurnished;
    }

    public void setFurnished(boolean isFurnished) {
        this.isFurnished = isFurnished;
    }

    public boolean isDublex() {
        return isDublex;
    }

    public void setDublex(boolean isDublex) {
        this.isDublex = isDublex;
    }

    public boolean isHasOtopark() {
        return hasOtopark;
    }

    public void setHasOtopark(boolean hasOtopark) {
        this.hasOtopark = hasOtopark;
    }

    public boolean isHasPool() {
        return hasPool;
    }

    public void setHasPool(boolean hasPool) {
        this.hasPool = hasPool;
    }

    public boolean isHasChildPark() {
        return hasChildPark;
    }

    public void setHasChildPark(boolean hasChildPark) {
        this.hasChildPark = hasChildPark;
    }

    public boolean isHasAirConditioning() {
        return hasAirConditioning;
    }

    public void setHasAirConditioning(boolean hasAirConditioning) {
        this.hasAirConditioning = hasAirConditioning;
    }

    @Override
    public String toString() {
        return "Home [city=" + city + ", district=" + district + ", neighbourhood=" + neighbourhood
                + ", yearOfBuilding=" + yearOfBuilding + ", numberOfbalconies=" + numberOfbalconies + ", numberOfRoom="
                + numberOfRoom + ", numberOfBath=" + numberOfBath + ", numberOfToilet=" + numberOfToilet
                + ", isFurnished=" + isFurnished + ", isDublex=" + isDublex + ", hasOtopark=" + hasOtopark
                + ", hasPool=" + hasPool + ", hasChildPark=" + hasChildPark + ", hasAirConditioning="
                + hasAirConditioning + "]";
    }
}
