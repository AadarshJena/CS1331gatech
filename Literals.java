public class Literals {

    public static void main(String[] args){

        int age = 20;    //20 is a literal value because it's the actual value that's wrapped inside the variable
        //         ^Java compiler sees it as a literal value

        double detailedAge = age;
        //   ^ there's no problems here because you're not taking away data; You just added bits to the representation



        double temperature = 105.1;     //When compiler sees a decimal, it defaults to thinking it's a 'double' literal
            //  ^double can store more digits than a float
        float height = 35.1f;          //therefore, if it's a float, you have to specify it's a float by the 'f', since the compiler defaults to doubles


        String name = "Sai";       //  <- literals
        char firstLetter = 'S';    //  <- literals
       
        long money = 234_123_234_123_983L;

        int truncatedTemperature = (int) temperature;  //it's called casting, forcing temperature into int
                                    //^ always rounds down 105.9 -> 105 | 105.8 -> 105
    
    
    
    
    
    
    
    }



}