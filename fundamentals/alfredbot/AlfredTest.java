import java.util.Date;

public class AlfredTest{

    public static void main(String[] args){
        AlfredQuotes bot = new AlfredQuotes(); 

        System.out.println(bot.basicGreeting());

        System.out.println(bot.guestGreeting("Samir", "day"));
        
        System.out.println(bot.dateAnnouncment());

        System.out.println(bot.answeringbeforeAlexis("Google"));
    }
}