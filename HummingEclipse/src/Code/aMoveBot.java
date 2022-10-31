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
                            "if you were a pokemon you would be a magikarp",  
                            "if you were a my little pony character, you would be twilight sparkle",
                            "you look like you go home and scroll through reddit memes",
                            "you are the human equivalent of a participation award",
                            "it's impossible to underestimate you",
                            "You may not be the dumbest person alive, but you better hope that he doesn't die.",
                            "I would agree with you but then we would both be wrong.",
                            "Everyone who ever loved you was wrong.",
                            "There's a tree creating the oxygen you're wasting. Go find it in the woods and apologize.",
                            "why should i insult you when i could just describe you",
                            "I'd try to insult you, but I can't top what nature has already done.",
                            "you look ew",
                            "if you were an animal you would be an ugly pig.",
                            "you are not slay.",
                            "you are not a gaslight gatekeep girlboss"
                            };
        int index = (int)(Math.random()*19);
        System.out.println(insult[index]);
        speak (insult [index]);
        Thread.sleep(4000);
         z = 1;
    }


    //compliments
    public void compliment() throws InterruptedException{
        String[] compliment = { 
                            "your extreme mental and physical appeal makes me want to live long and prosper with you", 
                            "talking to you is the best part of my day", 
                            "you have a beautiful brain. it makes me smile", 
                            "you have impeccable manners", 
                            "I ought to complain to Spotify for you not being named this week's hottest single.", 
                            "When I look in your eyes, I see a very kind soul.", 
                            "If you were a vegetable, you'd be a cute-cumber.",
                            "i know its corny, but you are amazing!",
                            "you are so slay",
                            "your smile is proof that the best things in life are free",
                            "your outfit is so slay",
                            "you are a gaslight gatekeep girlboss",
                            "i know it is cheesy, but you are so great!",
                            "you are such a manipulate mansplain malewife",
                            "i really appreciate your presence in my life",
                            "the way that you're standing is so cute",
                            "every time i see you, you raise my spirit and energy",
                            "i am glad that you are here right now",
                            "if you were a my little pony character you would be pinkie pie",
                            "if you were a fruit you would be one of those pretty, freshly picked apples"};
        int index1 = (int)(Math.random()*19);
        System.out.println(compliment[index1]);
        speak (compliment [index1]);
        Thread.sleep(5000);
        z = 2;
    }


    //question
    public void question() throws InterruptedException{
        speak("Do you want to converse with Tater or Tot?");
        Thread.sleep(5000);
    }

    //saying who you chose 
    public void chose() throws InterruptedException{
        speak("You chose Tater!");
        Thread.sleep(2000);
    }

    public void chose1() throws InterruptedException{
        speak("You chose Tot!");
        Thread.sleep(2000);
    }

    //port 1 turns around
    public void Tater() throws InterruptedException{
        int pos = 5;
        setServoPosition(RT, pos);
        Thread.sleep(1000);

        
    }

    //port 2 turns around
    public void Tot() throws InterruptedException{
        int pos = 5;
        setServoPosition(LEFT, pos);
        Thread.sleep(1000);

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
        int dis = getSensorValue(3);
        System.out.println(dis);
        //check distance...continues if close enuf
        if (dis > 90){
            if(z == 1){
                insult();
                setLED(3, 255);
                setLED(4, 255);
                Thread.sleep(500);
                setLED(3, 0);
                setLED(4, 0);
            }
            else{
                compliment();
                setFullColorLED(1, 0, 0, 255);
                setFullColorLED(2, 0, 0, 255);
                Thread.sleep(500);
                setFullColorLED(1, 0, 0, 0);
                setFullColorLED(2, 0, 0, 0);
            }
        }
        //stops if user is not close enuf.
        else {
            speak("User is too far! Goodbye!!");
            Thread.sleep(3000);
            Taterbye();
            Totbye();
            disconnect();
        }
            
    }

    }
