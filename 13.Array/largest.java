public class largest {
    public static int largest_num(int arr[]){

        if (arr.length == 0){
            return -1;
        }

        int largest = arr[0];
        
        for(int i=1; i<arr.length; i++){
            if(largest < arr[i]){
                largest = arr[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int arr[] = {};
        int largest = largest_num(arr);
        System.out.println("The largest element in array is :- "+ largest);
        
    }
}
