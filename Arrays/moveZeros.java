public class moveZeros {
        public static int[] moveZeros(int n, int []a) {
        // Write your code here.
        n= a.length;
        int temp;
        int i=-1;
    for(int j=0;j<n;j++){
        if(a[j]==0){
            i=j;
            break;
        }
        
    }
    if(i ==-1){
        return a;
    }
            for (int j=i+1;j<n;j++){
                if(a[j]!=0){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                    i++;
                }
                
            }
            return a;
        }
        public static void main(String[] args) {
        // Example array
        int[] array = {0, 1, 0, 3, 12};

        // Call the method to move zeros to the end
        int[] result = moveZeros(array.length, array);

        // Output the result
        System.out.print("Array after moving zeros: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
        }
