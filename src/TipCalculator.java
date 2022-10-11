public class TipCalculator {

    // Instance variables
    private double totalBillBeforeTip, tipPercentage;
    private int numPeople;

    // Constructors
    public TipCalculator(double totalBillBeforeTip, double tipPercentage, int numPeople) {
        this.totalBillBeforeTip = totalBillBeforeTip;
        this.tipPercentage = tipPercentage;
        this.numPeople = numPeople;
    }

    public TipCalculator(double tipPercentage, int numPeople) {
        this.totalBillBeforeTip = 0;
        this.tipPercentage = tipPercentage;
        this.numPeople = numPeople;
    }

    // Getters
    public double getTotalBillBeforeTip() {
        return totalBillBeforeTip;
    }

    public double getTipPercentage() {
        return tipPercentage;
    }

    // Calculators
    public double tipAmount() {
        return totalBillBeforeTip * (tipPercentage / 100);
    }

    public double totalBill() {
        return totalBillBeforeTip + tipAmount();
    }

    // Per Person calculators
    public double perPersonCostBeforeTip() {
        return totalBillBeforeTip / numPeople;
    }

    public double perPersonTipAmount() {
        return tipAmount() / numPeople;
    }

    public double perPersonTotalCost() {
        return totalBill() / numPeople;
    }

    // Increment
    public void addMeal(double cost) {
        totalBillBeforeTip += cost;
    }

}
