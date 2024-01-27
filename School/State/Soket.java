public class Soket {
    private ISoketState soketState;
    private int port;
    

    public void Do(){
     soketState.handle(this);
    }


    public ISoketState getSoketState() {
        return soketState;
    }


    public int getPort() {
        return port;
    }

    public Soket(int port){
        this.port = port;
        soketState = new SoketStateAc();
    }


    public void setSoketState(ISoketState soketState) {
        this.soketState = soketState;
    }


    public void setPort(int port) {
        this.port = port;
    }

}
