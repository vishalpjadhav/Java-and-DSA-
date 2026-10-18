
public class ast_Occurence {
    public static int last_Occurence(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        int isfound = last_Occurence(arr, key, i + 1);
        if (isfound == -1 && arr[i] == key) {
            return i;
        }

        return isfound;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 5, 6, 5, 4, 8, 5 };
        System.out.println(last_Occurence(arr, 5, 0));
    }
}
