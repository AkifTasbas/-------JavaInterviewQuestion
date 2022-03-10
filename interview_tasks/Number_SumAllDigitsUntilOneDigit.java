import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Number_SumAllDigitsUntilOneDigit {

    /*
    Sum all digits of a number until you have one digit number
    EX:
        input: 45659
        output:
                29
                11
                2
        Explanation:
                4+5+6+5+9=29
                2+9=11
                1+1=2
     */

    public static void main(String[] args) {

        int number = 45659;
        while(true){
            int sum = 0;
            while (number > 0) {
                int digit = number % 10;
                number /= 10;
                sum += digit;
            }
            number = sum;
            System.out.println(sum);
            if(sum < 9){
                break;
            }
        }

        /*
        int number = 45659;
        do{
            int sum = 0;
            List<Integer> digits = new ArrayList<>();
            while (number > 0) {
                int digit = number % 10;
                number /= 10;
                digits.add(digit);
            }
            Collections.reverse(digits);
            for (Integer each : digits) {
                sum += each;
            }
            number = sum;
            System.out.println(sum);
        }while(sum > 9);
*/








    }



}
