package com.leetcode;

public class MaxConsecutiveOnes {
	public static int findMaxConsecutiveOnes(int[] nums) {
        int max=0;
        for(int i=0;i<=nums.length-1;i++)
        {
            int count=1;
            if(nums[i]==1){
                for(int j=i+1;j<=nums.length-1;j++)
            {
                	int a=nums[i];
                	int b=nums[j];
                if(a==b)
                {
                    count++;
                    continue;
                }
                break;
            }
              max=Math.max(count,max);
            }
        }
		return max;
    }

	public static void main(String[] args) {
		int arr[]= {1,1,0,1,1,1,1};
		int res=findMaxConsecutiveOnes(arr);
		System.out.println(res);

	}

}
