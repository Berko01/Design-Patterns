public class SokateStateDinle implements ISoketState {

    @Override
    public void handle(Soket s) {
        System.out.println("{0} Port soket dinleniyor." + s.getPort());
        s.setSoketState(new SoketStateKapat());
    }
    
}
