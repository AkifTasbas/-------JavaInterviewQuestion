import java.util.Arrays;

public class Array_SecondLargestNumber {



    //solution 1
    public static int secondLargestNumber(int[] arr){
        return Arrays.stream(arr).filter( p -> p != Arrays.stream(arr).max().getAsInt()).max().getAsInt();
    }

    //solution 2
    public static int secondLargestNumber2(int[] arr){
return 0;
    }


}
