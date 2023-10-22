public class SbmShipping {
    public static ShippingCompany getShippingCompany() {
        CankiriBranch cankiriBranch = new CankiriBranch();
        AnkaraBranch ankaraBranch = new AnkaraBranch();
        IstanbulBranch istanbulBranch = new IstanbulBranch();
        AntalyaBranch antalyaBranch = new AntalyaBranch();

        ShippingCompany sbmShipping = cankiriBranch
                .setNextShippingCompany(
                        ankaraBranch.setNextShippingCompany(istanbulBranch).setNextShippingCompany(antalyaBranch));

        return sbmShipping;
    }
}