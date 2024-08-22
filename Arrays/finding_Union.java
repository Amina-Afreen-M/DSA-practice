import java.util.ArrayList;
import java.util.TreeSet;

class finding_Union {
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m) {
        // TreeSet to store the union of the two arrays (automatically removes duplicates and sorts the elements)
        TreeSet<Integer> set = new TreeSet<>();

        for (int i = 0; i < n; i++) {
            set.add(arr1[i]);
        }

        for (int i = 0; i < m; i++) {
            set.add(arr2[i]);
        }

        // Convert the set to an ArrayList n
        return new ArrayList<>(set);
    }



    public static void main(String[] args) {
        int[] arr1 = {1, 2, 4, 5, 6};
        int[] arr2 = {2, 3, 5, 7};

        int n = arr1.length;
        int m = arr2.length;

        ArrayList<Integer> union = finding_Union.findUnion(arr1, arr2, n, m);

        // Print the result
        System.out.println("Union of the two arrays: " + union);
    }
}

