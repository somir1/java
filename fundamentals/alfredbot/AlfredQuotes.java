import java.util.Date;

public class AlfredQuotes{

    public String basicGreeting(){
        return "hello boss, great to see you! How can I be of service today?";
    }

    public String guestGreeting(String name, String dayPeriod){
        return String.format("Good %s, How is your day going %s.", dayPeriod, name);
    }

    public String dateAnnouncment(){
        return String.format("It is currently %s", new Date());
    }

    public String answeringbeforeAlexis(String callname){
        if(callname.indexOf("Alexis") > -1){
            return "Why are you calling her, I am right here aren't I?";
        }
        if(callname.indexOf("Alfred") > -1){
            return "Yes sir, How can I be of serivice";
        }
        return "I quit";
    }
}