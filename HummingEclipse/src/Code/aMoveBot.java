package Code;
import javax.lang.model.util.ElementScanner14;

import com.birdbraintechnologies.HummingbirdRobot;

public class aMoveBot extends HummingbirdRobot {
    public static final int LEFT = 1, MID = 2, RT = 3;

    int z = 0;

    //insults
    public void insult() throws InterruptedException{
        String[] insult = {"your feet stink", 
                            "you are poopy", 
                            "you are a blockhead", 
                            "you are a goofy goober", 
                            "if you were a fruit you would be a 5 day old rotten tomato", 
                            "if you wre a pokemon you would be a magikarp",  
                            "if you were a my little pony character, you would be twilight sparkle",
                            "you look like you go home and scroll through reddit memes",
                            "you are the human equivalent of a participation award",
                            "it's impossible to underestimate you",
                            "You may not be the dumbest person alive, but you better hope that he doesn't die.",
                            "I would agree with you but then we would both be wrong.",
                            "Everyone who ever loved you was wrong.",
                            "There's a tree creating the oxygen you're wasting. Go find it in the woods and apologize.",
                            "You're not useless. You can be used as a bad example.",
                            "I'd try to insult you, but I can't top what nature has already done.",
                            };
        int index = (int)(Math.random()*15);
        System.out.println(insult[index]);
        speak (insult [index]);
        Thread.sleep(5000);
         z = 1;
    }


    //compliments
    public void compliment() throws InterruptedException{
        String[] compliment = {"second to emily hwang, you are mr. crockett's favorite student", 
                            "your extreme mental and physical appeal makes me want to live long and prosper with you", 
                            "talking to you is the best part of my day", 
                            "you have a beautiful brain. it makes me smile", 
                            "you have impeccable manners", 
                            "I ought to complain to Spotify for you not being named this week's hottest single.", 
                            "When I look in your eyes, I see a very kind soul.", 
                            "If you were a vegetable, you'd be a cute-cumber.",
                            "I didn't know what I wanted in a guy until I saw you"};
        int index = (int)(Math.random()*8);
        System.out.println(compliment[index]);
        speak (compliment [index]);
        Thread.sleep(5000);
        z = 2;
    }


    //question
    public void question() throws InterruptedException{
        speak("Do you want to converse with Tater or Tot?");
        Thread.sleep(5000);
    }

    //port 1 turns around
    public void Tater() throws InterruptedException{
        int pos = 5;
        setServoPosition(RT, pos);
        Thread.sleep(500);

        
    }

    //port 2 turns around
    public void Tot() throws InterruptedException{
        int pos = 5;
        setServoPosition(LEFT, pos);
        Thread.sleep(500);

    }

    //port 1 turns back around
    public void Taterbye() throws InterruptedException{
        int pos = 175;
        setServoPosition(RT, pos);
        Thread.sleep(1000);
    }

    //port 2 turns back around
    public void Totbye() throws InterruptedException{
        int pos = 175;
        setServoPosition(LEFT, pos);
        Thread.sleep(1000);
    }



    //sense distance of user
    public void active() throws InterruptedException{
        int dis = getSensorValue(RT);
        System.out.println(dis);
        if (dis < 30){
            if(z == 1)
                compliment();
            else
                insult();
            }
        else {
            speak("Goodbye!!");
            Thread.sleep(2000);
        if(z==1) {
            Taterbye();
            disconnect();
        }
        else
            Totbye();
            disconnect();
        }
            
    }


}