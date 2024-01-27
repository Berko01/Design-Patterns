public class ConcreteHandlerMp4 extends PlayerHandler {



    @Override
    public void play(String filePath) {
        if(filePath.endsWith(".mp4"))
            System.out.println(filePath + " dosyasi oynatiliyor(mp4 player)...");
        else{
            if(nextHandler != null)
                nextHandler.play(filePath);
        }
    }
    
}
