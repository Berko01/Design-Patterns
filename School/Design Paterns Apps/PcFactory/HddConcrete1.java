public class HddConcrete1 implements HddAbstract{

    @Override
    public void HddIslem() {
        System.out.println("HddConcrete1 birlestirildi.");
    }

    @Override
    public String HddTur() {
        return "Bu hdd türü: HddConcrete1";
    }
    
}
