import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Number_SumAllDigitsUntilOneDigit {

    /*
    Sum all digits of a number until you have one digit number
    EX:45659=4+5+6+5+9=29=2+9=11=1+1=2
     */

    public static void main(String[] args) {

        int number = 45659;



        int sum = 0;
        do{
            List<Integer> digits = new ArrayList<>();
            while(number > 0){
                int digit = number % 10;
                number /= 10;
                digits.add(digit);
            }
            Collections.reverse(digits);

            for (Integer each : digits) {
                sum += each;
            }
            System.out.println(sum);
            number = sum;
            digits.clear();
        }while(sum > 9);



    }



}
