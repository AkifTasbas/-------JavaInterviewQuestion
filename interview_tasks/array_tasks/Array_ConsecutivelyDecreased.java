package array_tasks;

public class Array_ConsecutivelyDecreased {

    /*
    There is a new product launched and its customer ratings are being recorded in an array. The ratings are being monitored and analyzed if there is any decrease in the ratings.
    Find the number of periods in which the rating is consecutively decreasing.
        Example - Ratings = [4,3,5,4,3]
        Periods (in other words sub arrays in which ratings are decreasing):
        One day periods = [4],[3],[5],[4],[3] (count of subarrays is 5)
        Two day periods = [4,3],[5,4],[4,3] (count of subarrays is 3)
        3 day periods = [5,4,3] (count of subarrays is 1)
        So, the output for this example will be 9 (5 + 3 + 1)
     */
    public static void main(String[] args) {

        int[] arr = {4,3,5,4,3};

        int count = 1, sub = 0;

        for (int i = 1; i < arr.length; i++ ){
            if(arr[i] < arr[i-1]){
                count += 1;
            }else{
                sub += count* (count+1)/2 ;
                count =1;
            }
        }

        int result = 0;
        for(int i = sub-1; i < arr.length; i++){
            result += arr[i];
        }

        System.out.println(result);

    }

}
