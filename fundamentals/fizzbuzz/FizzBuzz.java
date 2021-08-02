public class FizzBuzz{

    public String FizzBuzz(int num) {
        if(num % 5 == 0 && num % 3 == 0)
            return "FizzBuzz";
        if(num % 5 == 0)
            return "Fizz";
        if(num % 3 == 0)
            return "Buzz";
        return Integer.toString(num);
    }

    public String FizzBuzz(
        int num, 
        String multof3word,
        String multof5word,
        String multof15word
    ){
        if(num % 5 == 0 && num % 3 == 0)
            return multof15word;

        if(num % 5 == 0)
            return multof5word;

        if(num % 3 == 0)
            return multof3word;

    return Integer.toString(num);
    }
}