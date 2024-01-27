public class ConcreteHandlerMpg extends PlayerHandler {


    @Override
    public void play(String filePath) {
        if(filePath.endsWith(".mpg"))
            System.out.println(filePath + " dosyasi oynatiliyor(mpg player)...");
        else{
            if(nextHandler != null)
                nextHandler.play(filePath);
                
        }
    }
    
}
