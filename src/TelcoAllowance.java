import java.util.*;

public class TelcoAllowance implements UsagePromo{
    private static Map<String, Integer> promoMap = new HashMap<>();

    static {
        promoMap.put("Smart", 15);
        promoMap.put("Globe", 10);
        promoMap.put("Ditto", 8);
    }

    @Override
    public String showAllowance(String telcoName, double promoPrice) {
        return promoMap.get(telcoName) + "GB " + promoPrice + "PHP";
    }
}