public interface TelcoSubscription{
    public String accept(UsagePromo promo, double price);
    public String accept(UnliCallOffer offer, boolean unliCallText);
    public String getTelcoName();
    public double getPromoPrice();
    public int getDataAllowance();
    public boolean getUnliCallText();
}