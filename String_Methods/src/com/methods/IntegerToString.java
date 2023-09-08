package com.methods;

class Solution {
    public int gcd(int x,int y)
    {
        if(y==0)
        {
            return y;
        }

        return gcd(x%y,y);
    }
    public int countBeautifulPairs(int[] nums) {
        int count=0;
        int nums1[]= {2,5,1,4};
        
        for(int i=0;i<=nums1.length-1;i++)
        {
            String s=Integer.toString(nums1[i]);
            int a=s.charAt(0)-'0';
           
            for(int j=i+1;j<=nums1.length-1;j++)
            {
                int b=nums1[j]%10;
                int x=Math.max(a,b);
                int y=Math.min(a,b);
                // int r=1;
                // while(r>0)
                // {
                //     r=x%y;
                //     if(r==0 && y==1)
                //     {
                //         count++;
                //     }
                //     x=y;
                //     y=r;
                // }
                if(gcd(x,y)==1)
                {
                    count++;
                }
            }
        }

        return count;
        
    }
    
    
}

