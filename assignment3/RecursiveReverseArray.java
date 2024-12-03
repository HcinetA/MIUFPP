import java.util.Arrays;

public class RecursiveReverseArray {

    public void reverseArray(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        
        // Recursive call
        reverseArray(arr, start + 1, end - 1);
    }

    public static void main(String[] args) {
        RecursiveReverseArray rra = new RecursiveReverseArray();
        int[] arr = {1, 3, 5, 7, 9, 13};
        
        rra.reverseArray(arr, 0, arr.length - 1);
        
        System.out.println(Arrays.toString(arr));
    }
}

