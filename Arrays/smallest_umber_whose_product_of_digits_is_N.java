import java.util.*;
class smallest_umber_whose_product_of_digits_is_N {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        System.out.print(Solution(n));
    }
    public static int Solution(int n){
        String ans= "";
        for(int i=9;i>=2;i--){
            while(n%i==0){
                n=n/i;
                ans=i+ans;
                
            }
            
        }
        if(n!=1){
            return -1;
        }
        else{
            return Integer.parseInt(ans);
        }
        
        
        
    }
}