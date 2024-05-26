//////2. Problem: Given an array of integers, return indices of the two numbers
//such that they add up to a specific target. You may assume that each input
//would have exactly one solution.
//- Example:
//- Input: nums = [2, 7, 11, 15], target = 9
//- Output: [0, 1]
//- Explanation: Because nums[0] + nums[1] = 2 + 7 = 9

public class Question2 {
    public static int[] twoSum(int[] nums, int target) {
        // Iterate through the array with two nested loops
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                // Check if the sum of nums[i] and nums[j] equals the target
                if (nums[i] + nums[j] == target) {
                    // If found, return the indices
                    return new int[] { i, j };
                }
            }
        }

        // If no solution is found, return an empty array (or you can throw an exception)
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        // Call the twoSum method and store the result
        int[] result = twoSum(nums, target);

        // Print the result
        System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
    }
}