public class TipCalculator {

    private int numPeople;
    private int tipPercentage;
    double totalBillBeforeTip;

    public TipCalculator(int numPeople, int tipPercentage){
        this.numPeople = numPeople;
        this.tipPercentage = tipPercentage;
        totalBillBeforeTip = 0.0;
    }

    public double getTotalBillBeforeTip(){
        return totalBillBeforeTip;
    }

    public int getTipPercentage(){
        return tipPercentage;
    }
    public void addMeal(double cost){
        totalBillBeforeTip += cost;
    }

    public double tipAmount(){
        return Math.round(totalBillBeforeTip * (tipPercentage/100.0) * Math.pow(10,2)) / Math.pow(10,2);
    }

    public double perPersonTip(){
        return Math.round(tipAmount()/numPeople * Math.pow(10,2)) / Math.pow(10,2);
    }

    public double totalBill(){
        return tipAmount() + totalBillBeforeTip;
    }

    public double perPersonCostBeforeTip(){
        return Math.round(totalBillBeforeTip/numPeople * Math.pow(10,2)) / Math.pow(10,2);
    }

    public double perPersonTotalCost() {
        return Math.round(totalBill()/numPeople * Math.pow(10,2)) / Math.pow(10,2);
    }

}



