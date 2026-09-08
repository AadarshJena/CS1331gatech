public class Conditionals {


    public static void main(String[] args){

        int gtScore = 27;
        int coloScore = 17;

//      if/else statements below: They're pretty self-explanatory
// you can also add  'else if' in between.

        if (gtScore > coloScore){

            System.out.println("Go Jackets! Beto for Heisman");

        }else{

            System.out.println("The system is rigged, investigate the refs.");

        }


        //Ternary Conditional:

        int bribesToRef = gtScore > coloScore ? 0 : 5000;
//                                                   ^if the preceding condition is false
//                                              ^if the preceding condition is true


    String weather = "Sunny";

//Only works if one variable EXACTLY matches certain cases

    switch (weather) {
        case "Sunny":
            System.out.println("Wear Sunscreen");
        case "Rainy":
            System.out.println("Bring an umbrella");
        case "Tornado":
            System.out.println("Emergency; Stay inside!");

    }

/*
Switch cases are weird. Once a case is matched, it doesn't stop running. 
Instead, the program continues running every single code block under that. 

To avoid this, you need to add a break inside every case block.


*/

    }

}