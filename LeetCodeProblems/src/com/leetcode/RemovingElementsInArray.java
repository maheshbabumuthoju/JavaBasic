package com.leetcode;

public class RemovingElementsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int nums[]= {3,2,2,3},val=2;
//		int count=0;
//		 for(int i=0;i<=nums.length-1;i++)
//	        {
//	            if(nums[i]==val)
//	            {
//	                nums[i]=nums[i-1];
//	                count++;
//	            }
//	        }
//		 for(int i=0;i<=nums.length-1-count;i++) {
//			 System.out.println(nums[i]);
//		 }
		
		int nums[]= {3,2,2,3},val=2;
		int count=0;
		 for(int i=0;i<=nums.length-1;i++)
	        {
	            if(nums[i]==val)
	            {
	                nums[i]=0;
	                count++;
	            }
	        }
		 for(int i=0;i<=nums.length-1;i++) {
			 if(nums[i]!=0)
			 {
				 System.out.println(nums[i]);
			 }
		 }
	}
}
