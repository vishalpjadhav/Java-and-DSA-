import java.util.Arrays;
public class inbuilt_sort {
    public static void Printarr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void main (String [] args){
        int arr[] = {5,4,3,1,8,9};
        // Arrays.sort(arr);
        Arrays.sort(arr,0,3);
        Printarr(arr);

    }
}
