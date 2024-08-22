class missingNumberOptimised {
    public static int missingNumber(int[] nums) {
        int n=nums.length;
    int sum =0;
        int m;
        int s=0;
       
        for(int i=0;i<=n;i++){
            sum+=i;
            }
        for (int j=0;j<n;j++){
            s+=nums[j];
        }   
         m=sum-s;       
            
           
        
    
         return m;
    }
     public static void main(String[] args) {
        // Example input array (missing number is 2)
        int[] nums = {3, 0, 1};

        // Find the missing number
        int missingNum = missingNumberOptimised.missingNumber(nums);

        // Print the result
        System.out.println("The missing number is: " + missingNum);
    }
}