import java.util.*;

public class 2_sum{

public static void main(String args[]){
    int N=5;
    int arr[]=new int[N]{10,2,3,4,5,7,8};
    int target= 8;
    int ans[]=new int[2];
    HashMap<Integer,Integer> map= new HashMap<>();
    for (int i=0;i<N;i++){
        int no=target -arr[i];
        if(map.containsKey(no)){
            ans[0]=map.get(no);
            ans[1]=i;

        }
        else{
            map.put(arr[i],i)
        }

    }
    System.out.println(ans[0]+" "+ans[1]);
}

    
}