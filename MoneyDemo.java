public class MoneyDemo {
    public static void main(String[] args) {
        double coffee = 0.10;          // a coffee costs ten cents
        double candy = 0.20;           // a candy costs twenty cents
        double total = coffee + candy; // should be 30 cents

        System.out.println("Total: " + total);
        System.out.println("Is total exactly 0.30? " + (total == 0.30));

        // It gets worse: add a dime ten times. Should be exactly $1.00, right?
        double dollar = 0;
        for (int i = 0; i < 10; i++) {
            dollar += 0.10;
        }
        System.out.println("Ten dimes: " + dollar);
        System.out.println("Is it exactly 1.00? " + (dollar == 1.00));
    }
}
