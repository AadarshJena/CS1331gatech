public class Iteration {

    public static void main(String[] args){

        double mendozaYards = 210;
        int remainingGames = 12;


        // while (remainingGames > 0) {

        //     System.out.println("GT has this many games left: " + remainingGames);
        //     remainingGames--;
        // }

        // for (int remainingGames = 11; remainingGames > 0; remainingGames--) {

        //     System.out.println("GT has this many games left: " + remainingGames);

        // }

        do {
            System.out.println("GT has this many games left: " + remainingGames);
            remainingGames--;

        }while (remainingGames > 0);



    }


    public String toUppercase(String old) {
        String s = "";

        for (int i = 0; i < old.length(); i++){

        

            char c = old.charAt(i);

            if(c >= 97 && c <= 122){
                char upper = (char)(c - 32);
                s += upper;

            }
            

        }
        return (s) ;




    }







}