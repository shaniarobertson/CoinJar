import java.text.DecimalFormat;

public class CoinJarDriver {
    public static void main(String[] args) {
        CoinJar jar = new CoinJar("New Coin Jar");
        DecimalFormat df = new DecimalFormat("##0.00");

        System.out.println("New Coin Jar");
        System.out.println("------------");

        jar.inputCoins();

        // Individual coin amounts
        System.out.println("Individual Coin Totals: ");
        System.out.println("Quarters: $" + df.format(jar.quarterVal()));
        System.out.println("Dimes: $" +  df.format(jar.dimeVal()));
        System.out.println("Nickles: $" +  df.format(jar.nickleVal()));
        System.out.println("Pennies: $" +  df.format(jar.pennyVal()));
        System.out.println();

        // Total monetary value of coins in coin jar
        System.out.println("Total Amount (in dollars): ");
        System.out.println("$" +  df.format((jar.quarterVal() + jar.dimeVal() + jar.nickleVal() + jar.pennyVal())));
    }
}
