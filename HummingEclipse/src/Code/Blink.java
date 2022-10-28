package Code;

import com.birdbraintechnologies.HummingbirdRobot;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Blink {
    public static void main (String[] args) throws InterruptedException, IOException{
        //Create a new PracticeBot object
        aLightBot nathan = new  aLightBot();
        final BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("");
        System.out.println("Press ENTER to quit.");
    
        while (true)
         {
         // check whether the user pressed a key
         if (in.ready())
            {
            break;
            }
            nathan.setServoPosition(1, 5);
            Thread.sleep(500);
            nathan.setServoPosition(1, 175);
            Thread.sleep(500);
         }

         nathan.speak("i love emily");
        Thread.sleep(200000000);         
         nathan.disconnect();

    

    }
}
