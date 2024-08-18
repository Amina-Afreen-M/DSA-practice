import java.util.*;
class Majority_element {
public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    int n =sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    System.out.print(majorityElement(arr));
}
    

public static int majorityElement(int arr[]){
    int candidate=arr[0];
    int vote=1;
    int count=0;
    for (int i=1;i<arr.length;i++){
        if(arr[i]==candidate){
            vote++;
        }
        else{
            vote--;
        }
        if(vote==0){
            candidate=arr[i];
            vote=1;
        }
    }
    for(int val:arr){
        if(val==candidate){
            count++;
        }

    }
    if(count>arr.length/2){
        return candidate;
    }
    else return -1;




}
}
