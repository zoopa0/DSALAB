public class Question4 {
    ///Problem: Write a function that takes an array of integers and returns the
    //maximum element in the array.
    //- Example: Input: [1, 2, 3, 4, 5], Output: 5

    public static void main(String[] args) {
        int arr[] = {2,4,5,6,8,9,7,1};
        int result = findingMax(arr);
        //Here I am printing the maximum number
        System.out.print("The maximum NUmber is: " + result);

    }

    public static int findingMax(int arr[]){
        if (arr.length == 0) {
            System.out.print("Array is empty");
        }

        int maxElement = arr[0];
        for (int num : arr) {
            if (num > maxElement) {
                maxElement = num;
            }
        }
        return maxElement;
    }

}





