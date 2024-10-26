package searchArray;

public class LinearSearch {

    public static int linearSearch(int [] arr, int X){
        for(int i = 0; i < arr.length;i++){
            if(arr[i] == X){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int [] arr = {12,4,56,75,4};
        int X = 56;
        int result = linearSearch(arr,X);

        if(result != -1){
            System.out.println("Element fount at index: "+ result);
        }
        else {
            System.out.println("Element not fount at index: "+ result);
        }
    }
}
