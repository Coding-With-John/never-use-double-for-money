import java.math.BigDecimal;
public class MoneyFix {
    public static void main(String[] args) {
        int coffeeCents = 10;
        int candyCents = 20;
        int totalCents = coffeeCents + candyCents;
        System.out.println("Total: " + totalCents + " cents (exactly)");
        BigDecimal coffee = new BigDecimal("0.10");
        BigDecimal candy = new BigDecimal("0.20");
        BigDecimal total = coffee.add(candy);
        System.out.println("BigDecimal total: " + total);
        BigDecimal sneaky = new BigDecimal(0.10);
        System.out.println("new BigDecimal(0.10) = " + sneaky);
    }
}
