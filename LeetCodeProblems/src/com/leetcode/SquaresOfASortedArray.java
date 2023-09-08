package com.leetcode;

public class SquaresOfASortedArray {
	public static int[] sortedSquares(int[] nums) {
		
		int arr[]=new  int [nums.length];//creating empty array with existing array
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=nums[i]*nums[i];
		}
		int n=arr.length;
//		bubble sort
		boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap the elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            // If no two elements were swapped in the inner loop, the array is already sorted
            if (!swapped) {
                break;
            }
      
        }
        return arr;
	}

	public static void main(String[] args) {
		
		int ar[]= {-5,-3,-2,-1};
		int res[]=sortedSquares(ar);
		for(int i=0;i<=res.length-1;i++)
		{
			System.out.println(res[i]);
		}
		

	}

}
