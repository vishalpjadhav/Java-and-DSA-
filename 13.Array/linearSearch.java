public class linearSearch {
    public static int linear_search(int arr[],int key){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,8,9,7};
        int index = linear_search(arr,9);
        if(index == -1){
            System.out.println("Not Found");
        }else {
            System.out.println("Found at Index :- "+index);
        }
    }   
}
