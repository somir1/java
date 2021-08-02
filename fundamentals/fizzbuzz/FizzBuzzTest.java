
public class FizzBuzzTest{

    public static void main(String[] args){
        FizzBuzz test = new FizzBuzz();

        System.out.println(test.FizzBuzz(9));

        System.out.println(test.FizzBuzz(10));

        System.out.println(test.FizzBuzz(15));

        System.out.println(test.FizzBuzz(55));
        
        System.out.println(test.FizzBuzz(16));
        
        System.out.println(test.FizzBuzz(2));


        // Will printout the numbers from 1 to 50 and it will check the conditions
        for (int i = 1; i <= 50; i++){
            System.out.println(test.FizzBuzz(i, "Cars", "Food", "Video Games"));
        }
    }
}