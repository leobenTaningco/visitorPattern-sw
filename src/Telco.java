public class Telco implements TelcoSubscription{
    private String telcoName;
    private double promoPrice;
    private int dataAllowance;
    private boolean unliCallText;

    public Telco(int dataAllowance, double promoPrice, String telcoName, boolean unliCallText)
    {
        this.telcoName = telcoName;
        this.promoPrice = promoPrice;
        this.dataAllowance = dataAllowance;
        this.unliCallText = unliCallText;
    }

    @Override
    public String accept(UsagePromo promo, double price){
        return promo.showAllowance(telcoName, price);
    }

    @Override
    public String accept(UnliCallOffer offer, boolean unliCallText) {
        return offer.showUnliCallsTextOffer(telcoName, unliCallText);
    }

    //getters
    @Override
    public String getTelcoName(){
        return telcoName;
    }

    @Override
    public double getPromoPrice(){
        return promoPrice;
    }

    @Override
    public int getDataAllowance(){
        return dataAllowance;
    }

    @Override
    public boolean getUnliCallText(){
        return unliCallText;
    }
}