class missingNumberBrute {
    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int count;
        int m = 0;
       
        for (int i = 0; i <= n; i++) {
            count = 0;  // Initialize count for each i
            for (int j = 0; j < n; j++) {
                if (nums[j] == i) {
                    count = 1;
                    break;
                }
            }
            // If count is 0, it means i is missing in the array
            if (count == 0) {
                m = i;
                break; // Exit the loop early since we've found the missing number
            }
        }
       
        return m;
    }



    public static void main(String[] args) {
        // Example input array (missing number is 2)
        int[] nums = {3, 0, 1};

        // Find the missing number
        int missingNum = missingNumberBrute.missingNumber(nums);

        // Print the result
        System.out.println("The missing number is: " + missingNum);
    }
}