import java.util.Arrays;
import java.util.ArrayList;

public class Basic{

    public static void main(String[] args) {
        
        printNum();
        oddNum();
        System.out.println(sum(2));
        int[] num = {5,6,8,7,9,1,2000};
        ittArray(num);
        getOdd(255);
    }

    public static void printNum(){
        for (int i = 1; i < 256; i++){
            System.out.println(i);
        }
    }

    public static void oddNum(){
        for (int i = 1; i < 256; i++){
            if (i % 2 != 0 ){
            System.out.println(i);
            }
        }
    }

    public static int sum (int num){
        int total = 0;
        for (int i = 1; i <= num; i++){
            total += i;
        }
        return total;
    }

    public static void ittArray(int[] inputArr){
        for (int value: inputArr){
        System.out.println(value);
        }
    }

    public static void findMax(int[] inputArr){
        int maxVal = inputArr[0];
        for (int value: inputArr){
            if (value > maxVal){
                maxVal = value;
            }
        }
        System.out.println(maxVal);
    }

    public static ArrayList<Integer> getOdd(int someNum) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i <= someNum; i++){
            if (i % 2 != 0){
                result.add(i);
            }
            
        }
        System.out.println(result);
        return result;
    }
}
