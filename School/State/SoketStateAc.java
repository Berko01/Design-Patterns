public class SoketStateAc implements ISoketState{

    @Override
    public void handle(Soket s) {
        
        System.out.println("{0} Port soket acildi." + s.getPort());

        s.setSoketState(new SokateStateDinle());
    }
    
}
