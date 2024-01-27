public class ConcreteHandlerAvi extends PlayerHandler{

    @Override
    public void play(String filePath) {
        if(filePath.endsWith(".avi"))
            System.out.println(filePath + " dosyasi oynatiliyor(avi player)...");
        else{
            
            if(nextHandler != null)
            {
                nextHandler.play(filePath);
            }
                
        }
    }
    
}
