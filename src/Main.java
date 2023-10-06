import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        String nameItem;
        List<String> itemName = new ArrayList<>();

        System.out.println("Welcome to the tip calculator!");

        System.out.print("How many people are in your group: ");
        int people = scan.nextInt();
        scan.nextLine();

        System.out.print("What percentage do you want to tip (as an integer): ");
        int percent = scan.nextInt();
        scan.nextLine();

        TipCalculator calculator = new TipCalculator(people, percent);

        double end = 0;
        while (end != -1){

            System.out.print("Enter a cost in dollars and cents, e.g. 12.50 (-1 to end): ");
            end = scan.nextDouble();
            scan.nextLine();

            if (end!= -1){
                System.out.print("Enter the item: ");
                calculator.addMeal(end);
                nameItem = scan.nextLine();
                itemName.add(nameItem);}
        }

        System.out.println("--------------------------------");
        System.out.println("Total bill before tip: $" + calculator.getTotalBillBeforeTip());
        System.out.println("Total percentage: " + percent + "%");
        System.out.println("Total tip: $" + calculator.tipAmount());
        System.out.println("Total bill with tip: $" + calculator.totalBill());
        System.out.println("Per person cost before tip: $" + calculator.perPersonCostBeforeTip());
        System.out.println("Tip per person: $" + calculator.perPersonTip());
        System.out.println("Total cost per person: $" + calculator.perPersonTotalCost());
        System.out.println("--------------------------------");

        System.out.println("Items ordered:");

        for (int i = 0; i < itemName.size(); i++){
            System.out.println(itemName.get(i));
        }
    }
}
