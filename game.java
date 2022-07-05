import java.util.Scanner;

public class game{
    public static void main(String[] args) {

        //Defining the variables
        int secretNo = 5;
        int totalScore = 0;


        //Creating an object of the input
        Scanner input = new Scanner(System.in);

        //Entering the number of rounds you would want to play
        System.out.println("How many rounds would you love to play: ");
        int noOfRounds = input.nextInt();

        //Looping through the number of rounds
        for(int i=1; i<=noOfRounds; i++){
            //Entering a lucky number
            System.out.println("Enter your Luck number for round "+i+": ");

            //inputing the lucky number
            int luckyNo = input.nextInt();

            //finding the remainder
            int remainder = luckyNo%secretNo;

            //Checking whether the remainder is 0, even or Odd
            if(remainder==0){
                System.out.println("Round "+i+" result: DRAW!");
                totalScore+=1;
            }
            else if(remainder>0){
                if(remainder%2==0){
                    System.out.println("Round "+i+" result: YOU WON!!!");
                    totalScore+=3;
                }
                else{
                    System.out.println("Round "+i+" result: YOU LOST");
                    totalScore-=3;
                }
            }

            
            


        }
        //displaying the final game results
        System.out.println("FINAL RESULTS!!");
        System.out.println("Total Score= "+totalScore);
        if(totalScore>=0){
            System.out.println("RESULT: CONGRATULATIONS, YOU WON THE GAME!!!!!!");

        }
        else{
            System.out.println("RESULT: SORRY, YOU LOST THE GAME, TRY NEXT TIME.");
        }

    }
}