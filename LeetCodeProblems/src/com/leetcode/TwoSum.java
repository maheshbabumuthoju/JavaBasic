package com.leetcode;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int sum=0;
		int arr[]= {2,7,11,15};
		int x=7;
		int res[]=twoSum(arr, x);
		for(int i=0;i<=res.length;i++)
		{
			System.out.println(res[i]);
		}
	}
	public static int[] twoSum(int nums[],int target)
	
	{
	    int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{}; // No solution found
	}

}
