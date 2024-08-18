public class check_Sorted {
    public static int isSorted(int n, int []a) {
        int res=0;
        for (int i=1;i<n;i++){
            if(a[i]>=a[i-1]){
                res=1;
            }
            else {
                res=0;
                
                }

        }
        return res;
    }
    public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5}; // Sorted array
    int result = Solution.isSorted(arr.length, arr);
    System.out.println(result); // Should print 1 (true)

    int[] arr2 = {1, 3, 2, 4, 5}; // Not sorted array
    int result2 = Solution.isSorted(arr2.length, arr2);
    System.out.println(result2); // Should print 0 (false)
}
}