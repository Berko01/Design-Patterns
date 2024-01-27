public class SingletonDeseni
{
    private static SingletonDeseni nesne;

    private static Object kanalKontrol = new Object();

    private SingletonDeseni(){

    }

    public static SingletonDeseni Nesne(){
        if(nesne == null)
        {
            synchronized(kanalKontrol)
            {
                if(nesne == null)
                {
                    nesne = new SingletonDeseni();
                }
            }
        }
        return nesne;
    }

}