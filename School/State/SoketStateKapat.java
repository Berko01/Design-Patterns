public class SoketStateKapat implements ISoketState {

    @Override
    public void handle(Soket s) {

        System.out.println("{0} Port soket kapatildi. " + s.getPort());
        s.setSoketState(new SoketStateAc());
    }


    
}
