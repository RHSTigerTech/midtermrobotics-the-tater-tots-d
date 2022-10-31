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

        //set back to original position
        sally.Taterbye();
        sally.Totbye();

        //asking the question
        System.out.print("Do you want to converse with Tater or Tot?");
        sally.question();

        //saving user input and changing vowels to uppercase 
        String input = scan.next();
        if (input.equalsIgnoreCase(insult)){
            input = input.substring(0,1) + input.substring(1,2).toUpperCase() + input.substring(2,3);
            System.out.println("You chose " + input + "!");
            sally.chose1();
        }
        if (input.equalsIgnoreCase(compliment)){
            input = input.substring(0,1) + input.substring(1,2).toUpperCase() + input.substring(2, 3) + 
                    input.substring(3,4).toUpperCase() + input.substring(4,5);
            System.out.println("You chose " + input + "!");
            sally.chose();
        }

        //turning around giving insult/compliment
        if (input.equalsIgnoreCase(insult)){
            sally.Tot();
            sally1.blink(1);
            sally.insult();
            sally1.blink(2);
        }
        if (input.equalsIgnoreCase(compliment)){
            sally.Tater();
            sally1.blink1(1, 0, 0, 255);
            sally.compliment();
            sally1.blink1(2,0,0,255);
        }
    
       //if user is close enough, bot continues conversation 
       boolean f = true;
       while (f){
            sally.active();
        }
    

    }
}
    
