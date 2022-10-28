package Code;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class aHalloween {
    public static void main(String[] args) throws InterruptedException{


        //create bots
        aLightBot sally1 = new aLightBot();
        //sally1 can only do light methods
        aMoveBot sally = new aMoveBot();
        //sally does everything else

        //setting up the names of bots to their statements 
        String insult = "Tot";
        String compliment = "Tater";
        Scanner scan = new Scanner(System.in);

        //asking the question
        System.out.print("Do you want to converse with Tater or Tot?");
        sally.question();

        //saving user input and changing vowels to uppercase 
        String input = scan.next();
        if (input.equalsIgnoreCase(insult)){
            input = input.substring(0,1) + input.substring(1,2).toUpperCase() + input.substring(2,3);
            System.out.println("You chose " + input + "!");
        }
        if (input.equalsIgnoreCase(compliment)){
            input = input.substring(0,1) + input.substring(1,2).toUpperCase() + input.substring(2, 3) + 
                    input.substring(3,4).toUpperCase() + input.substring(4,5);
            System.out.println("You chose " + input + "!");
        }

        //turning around giving insult/compliment
            if (input.equalsIgnoreCase(insult))
                sally.Tot();
                sally.insult();
            if (input.equalsIgnoreCase(compliment))
                sally.Tater();
                sally.compliment();
    }
        //while (f == false){
      //      sally.active();
       // }
        //if user is close enough, bot continues conversation 
    

    }
    
