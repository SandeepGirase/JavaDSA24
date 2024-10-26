package arrays;

import java.util.Scanner;

public class CountTargetElement {

    public static int findTargetElement(int array[], int targetElement){
        int count = 0;
        for (int i=0; i<array.length;i++){
            if(array[i] == targetElement)
                count++;
        }

        return count;
    }
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of array: ");
    int size = scanner.nextInt();

    // defining array and initialsing
    int arr[] = new int[size];
        System.out.println("Enter the array value one by one : ");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

//        input target element
        System.out.println("Enter the target element: ");
        int target = scanner.nextInt();

//        logic to find target element
        int count = findTargetElement(arr,target);
        System.out.println("Count of target element: "+count);
    }
}
