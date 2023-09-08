package com.leetcode;

public class FindNumberswithEvenNumberofDigits {
	public static int findNumbers(int[] nums) {
      
//		METHOD 1
//        int evenCount=0;
//        for(int i=0;i<=nums.length-1;i++){
//        	int count=0;
//           while(nums[i]>0)
//           {
//        	   int rem=nums[i]%10;
//        	   count++;
//        	   nums[i]=nums[i]/10; 
//           }
//           if(count%2==0)
//           {
//        	   evenCount++;
//           } 
//        }
//        return evenCount;
        
		
//		METHOD 2
//        int x=0;
//        for(int y:nums)
//        {
//        	if((y>9 && y<100) || (y>999 && y<10000) || (y>99999 && y<1000000))
//        	{
//        		x++;
//        	}
//        }
//        return x;
		
		
//		METHOD 3
		int c=0;
		for(int i=0;i<=nums.length-1;i++)
		{
			String s=String.valueOf(nums[i]);//to convert integer to string
			int n=s.length();
			if(n%2==0)
			{
				c++;
			}
		}
		return c;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[] = {1000,11,2,3};
		int res=findNumbers(num);
		System.out.println(res);

	}

}
