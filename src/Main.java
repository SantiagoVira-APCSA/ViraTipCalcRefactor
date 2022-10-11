import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get values from user
        System.out.print("How much is the bill? ");
        double totalBill = input.nextDouble();
        System.out.print("How much would you like to tip (in percentage, ex. 20)? ");
        double tipPercentage = input.nextDouble();
        System.out.print("How many people are there? ");
        int numPeople = input.nextInt();

        TipCalculator calc = new TipCalculator(totalBill, tipPercentage, numPeople);

        // Format output variables
        String tipPerPersonFormatted = String.format("%.2f", calc.perPersonTipAmount());
        String billPerPersonFormatted = String.format("%.2f", calc.perPersonCostBeforeTip());
        String totalPerPersonFormatted = String.format("%.2f", calc.perPersonTotalCost());

        // Output values to user
        System.out.println("Each person will pay $" + billPerPersonFormatted +
                " for the bill and will tip $" +
                tipPerPersonFormatted + " for a total of $" + totalPerPersonFormatted + " per person.");
    }
}