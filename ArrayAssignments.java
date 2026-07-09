import java.util.*;

public class ArrayAssignments {

    // Question 1: Contains Duplicate
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (set.contains(num))
                return true;
            set.add(num);
        }

        return false;
    }

    // Question 2: Search in Rotated Sorted Array
    public static int search(int[] nums, int target) {
        int low = 0, high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target)
                return mid;

            if (nums[low] <= nums[mid]) {
                if (target >= nums[low] && target < nums[mid])
                    high = mid - 1;
                else
                    low = mid + 1;
            } else {
                if (target > nums[mid] && target <= nums[high])
                    low = mid + 1;
                else
                    high = mid - 1;
            }
        }

        return -1;
    }

    // Question 3: Best Time to Buy and Sell Stock
    public static int maxProfit(int[] prices) {
        int buy = Integer.MAX_VALUE;
        int profit = 0;

        for (int price : prices) {
            if (price < buy)
                buy = price;
            else if (price - buy > profit)
                profit = price - buy;
        }

        return profit;
    }

    // Question 4: Trapping Rain Water
    public static int trap(int[] height) {
        int n = height.length;

        if (n == 0)
            return 0;

        int[] leftMax = new int[n];
        int[] rightMax = new int[n];

        leftMax[0] = height[0];
        for (int i = 1; i < n; i++)
            leftMax[i] = Math.max(leftMax[i - 1], height[i]);

        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--)
            rightMax[i] = Math.max(rightMax[i + 1], height[i]);

        int water = 0;

        for (int i = 0; i < n; i++)
            water += Math.min(leftMax[i], rightMax[i]) - height[i];

        return water;
    }

    // Question 5: 3 Sum
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {

            if (i > 0 && nums[i] == nums[i - 1])
                continue;

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {

                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    while (left < right && nums[left] == nums[left + 1])
                        left++;

                    while (left < right && nums[right] == nums[right - 1])
                        right--;

                    left++;
                    right--;

                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return result;
    }

    // Main Method
    public static void main(String[] args) {

        // Q1
        int[] arr1 = {1, 2, 3, 1};
        System.out.println("Q1: " + containsDuplicate(arr1));

        // Q2
        int[] arr2 = {4, 5, 6, 7, 0, 1, 2};
        System.out.println("Q2: " + search(arr2, 0));

        // Q3
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println("Q3: " + maxProfit(prices));

        // Q4
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println("Q4: " + trap(height));

        // Q5
        int[] arr5 = {-1, 0, 1, 2, -1, -4};
        System.out.println("Q5: " + threeSum(arr5));
    }
}