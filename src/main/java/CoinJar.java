import java.util.Scanner;

public class CoinJar {

    double quarters, dimes, nickles, pennies;
    String name;

    // CoinJar constructor
    public CoinJar (String coinJarName) {
        name = coinJarName;
    }

    // Get user input of amount of each type of coin
    public void inputCoins() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of Quarters: ");
        quarters = scan.nextDouble();
        System.out.println("Enter number of Dimes: ");
        dimes = scan.nextDouble();
        System.out.println("Enter number of Nickles: ");
        nickles = scan.nextDouble();
        System.out.println("Enter number of Pennies: ");
        pennies = scan.nextDouble();
    }

    // Calculate value of amount of each coin
    public double quarterVal() { return quarters * .25; }
    public double dimeVal() {
        return dimes * .10;
    }
    public double nickleVal() {
        return nickles * .05;
    }
    public double pennyVal() {
        return pennies * .01;
    }

}
