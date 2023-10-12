public class TelephoneEAAdapter implements ElectricalAppliances {

    //Diyelimki bir servisten veri alıp başka bir servise pushlayan bir uygulama yazıyoruz.
    //XML ile veri aldık diyelim. Paslancak servis ise json istiyor.
    //XML alınıp json'a çevirilmeli. İşte bu noktada Xml-Json Adapter'a ihtiyacımız var.

    private Telephone telephone;

    public TelephoneEAAdapter(Telephone telephone){
        this.telephone = telephone;
    }
    @Override
    public int plugAndPlay() {
       return telephone.chargeIt();
    }

    
    
}
