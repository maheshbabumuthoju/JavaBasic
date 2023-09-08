package com.leetcode;
public class ValidParanthesis {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="([)]";
		int n=s.length();
        int count=0;
				if(n%2!=0)
				{
					System.out.println("false");
//					return false;
				}
        for(int i=0;i<n;i++){
					for(int j=i+1;j<n;j++)
					{
						int asc1=(int)s.charAt(i);
						int asc2=(int)s.charAt(j);
						if(asc1+1==asc2)
						{
							count=count+2;
							break;
						}
						if(asc1+2==asc2)
						{
							count=count+2;
							break;
						}
					}
					if(count==n)
					{
						break;
					}
				}
        
        if(count==n)
        {
        	System.out.println("true");
//            return true;
        }
//        return false;
			
			

	}

}
