package Code;

import com.birdbraintechnologies.HummingbirdRobot;

public class aLightBot extends HummingbirdRobot {
    
    public void blink(int numBlinks) throws InterruptedException{
        for (int i = 0; i < numBlinks; i++){
            setLED(3, 255);
            setLED(4, 255);
            Thread.sleep(500);
            setLED(3, 0);
            setLED(4, 0);
            Thread.sleep(200);
        }
        }

    public void blink1 (int numBlinks, int r, int g, int b) throws InterruptedException{
        for (int i = 0; i < numBlinks; i++){
            setFullColorLED(1, r, g, b);
            setFullColorLED(2, r, g, b);
            Thread.sleep(500);
            setFullColorLED(1, 0, 0, 0);
            setFullColorLED(2, 0, 0, 0);
            Thread.sleep(200);
    }
    }

}
