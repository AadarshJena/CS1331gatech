package Assignments;
public class FuelTripPlanner {

    /*
    Hey, my name is Aadarsh Jena!
    I wish less people knew that I have a guilty pleasure of drinking anything that's carbonated. 
    I need to be healthier :/
    
    */


    public static void main (String[] args){

        int backRoadMiles = 25;
        int highwayMiles = 60;
        int hillyMiles = 10;
        int currentGasGallons = 20;
        int numberOfPeople = 5;

        double gallonsPerPerson = 0;


        gallonsPerPerson += (2*backRoadMiles);
        gallonsPerPerson += (1*highwayMiles);
        gallonsPerPerson += (5 * hillyMiles);

        gallonsPerPerson -= currentGasGallons;

        gallonsPerPerson /= numberOfPeople;

        System.out.printf("Each passenger is responsible for %.1f gallons of gas\n", gallonsPerPerson);




    }

}
