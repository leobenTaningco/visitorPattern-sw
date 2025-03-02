# Mobile Plan Visitor Design Pattern

Imagine you are looking for a new mobile plan for your smartphone. Three major telecommunication providers are offering enticing deals: Smart, Globe, and Ditto.

## Telecommunication Plans

- **Smart**: Offers a data allowance of 15 GB for ₱500 per month. However, they do not offer any free calls or texts, and you will be charged per use.
- **Globe**: Provides a data allowance of 10 GB for ₱450 per month. This plan comes with unlimited calls and texts to subscribers within their network. Calls and texts to other networks are charged extra.
- **Ditto**: Offers a data allowance of 8 GB for ₱400 per month. This plan includes unlimited calls and texts to all networks within the country.

## UML Class Diagram
![image](https://github.com/user-attachments/assets/6e703489-c827-4b1e-88a3-809196db7062)

## The main client program
public class TelcoPromo {
    public static void main(String[] args) {
        TelcoSubscription smart = new Telco(15, 500, TelcoProvider.Smart, false);
        TelcoSubscription globe = new Telco(10, 450, TelcoProvider.Globe, true);
        TelcoSubscription ditto = new Telco(8, 400, TelcoProvider.Ditto, true);

        TelcoPromoVisitor promo = new TelcoAllowance();
        TelcoPromoVisitor unli = new UnliCallTextPackage();

        System.out.println("Smart Data Usage Offer and price: " +
                promo.showAllowance(smart.getTelcoName().toString(), smart.getPromoPrice()));
        System.out.println("Globe Data Usage Offer and price: " +
                promo.showAllowance(globe.getTelcoName().toString(), globe.getPromoPrice()));
        System.out.println("Ditto Data Usage Offer and price: " +
                promo.showAllowance(ditto.getTelcoName().toString(), ditto.getPromoPrice()));

        System.out.println("\nSmart unlimited calls and text package: " +
                unli.showUnliCallsTextOffer(smart.getTelcoName().toString(), smart.getUnliCallText()));
        System.out.println("Globe unlimited calls and text package: " +
                unli.showUnliCallsTextOffer(globe.getTelcoName().toString(), globe.getUnliCallText()));
        System.out.println("Ditto unlimited calls and text package: " +
                unli.showUnliCallsTextOffer(ditto.getTelcoName().toString(), ditto.getUnliCallText()));
    }
}
