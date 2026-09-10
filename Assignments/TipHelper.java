package Assignments;


public class TipHelper {
    /*
    Hey, my name's Aadarsh Jena
    One thing I wish people knew about me is that I really love to sing
    I also love to play basketball!
    I'm very passionate and detail-oriented about the things I do!
    
    */

    public static void main(String[] args){

        double tipPercentage = 0.15;
        double mealTotal = 20.179;
        int numberItemsOrdered = 3;

        String customerName = "Jacob";

        double totalTip = (tipPercentage * mealTotal);

        double tipTrunc = ((int)(totalTip *100)) / 100.0;

        double totalAmountPaid = mealTotal + tipTrunc;

        double totalTrunc = ((int)(totalAmountPaid * 100)) / 100.0;

        System.out.println(customerName + " ordered " + numberItemsOrdered + " meal items");
        System.out.println("The total tip was $"+ tipTrunc);
        System.out.println("They owe a total of $" + totalTrunc);

        
    }

}
