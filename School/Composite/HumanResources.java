public class HumanResources extends Personel {

    @Override
    public void showInfos() {
        for(Personel personel : personelList){
            personel.showInfos();
        }
    }

    

    

}
