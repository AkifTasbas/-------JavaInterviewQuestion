import java.util.Arrays;

public class Array_SecondLargestNumber {




    public static int secondLargestNumber(int[] arr){
        return Arrays.stream(arr).filter( p -> p != Arrays.stream(arr).max().getAsInt()).max().getAsInt();
    }




}
