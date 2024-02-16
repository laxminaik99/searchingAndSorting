package com.bridgelabz15;

public class binary {
	public static int binary(int[] arr, int x)
    {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (x == arr[mid]) {
                return mid;
            }
            else if (x > arr[mid]) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return -1;
    }
	public static void main(String[] args) {
        int[] arr = {2, 3, 4, 10, 40};
        int x = 10;
        
        int result = binary(arr, x);
        
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index " + result);
    }


}
