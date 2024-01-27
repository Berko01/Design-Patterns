public class Dock{
    private static Dock dock;

    private static Object lockObject = new Object();

    private Finder finder;

    private Dock(){
    }

    public static Dock Instance()
    {
        
        if(dock == null)
        {
            synchronized(lockObject)

            {
                if(dock == null)
                {
                    dock = new Dock();
                }

            }
        }
        return dock;
    
    }

    public void clickDock(){
        System.out.println("Panele tiklandi.");

        finder = new Finder();

        System.out.println("Finder:"+ finder.title);
    }

}