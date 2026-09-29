import java.util.*;
import java.util.Collections;
public class inbuilt_SSort {
    public static void printarr(Integer arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String [] args){
        Integer arr[] = {5, 4, 2, 1, 3};
        Arrays.sort(arr, Collections.reverseOrder());
        printarr(arr);
    }
}
