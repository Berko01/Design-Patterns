public class Test {
    public static void main(String[] args) {
        PowerPoint powerPoint = new PowerPoint();

        Iron iron = new Iron();

        Freezer freezer = new Freezer();

        powerPoint.giveElectricity(freezer);
        powerPoint.giveElectricity(iron);

        SamsungTelephone samsungTelephone = new SamsungTelephone();
        TelephoneEAAdapter adapter = new TelephoneEAAdapter(samsungTelephone);

        powerPoint.giveElectricity(adapter);

    }
}
