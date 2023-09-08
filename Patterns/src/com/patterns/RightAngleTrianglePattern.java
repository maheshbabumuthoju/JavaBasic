package com.patterns;
public class RightAngleTrianglePattern {
	public static void main(String[] args) {
//		*
//		**
//		***
//		****
//		*****
//		******
		char c=65;
		
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
				c++;
			}
			System.out.println();
			c=65;
		}
		System.out.println();
		
System.out.println("mirror of above pattern");


//	     *
//	    **
//	   ***
//	  ****
System.out.println("#1");
for(int i=1;i<=4;i++)
{
	for(int j=1;j<=4;j++)
	{
		if(j<=4-i)
		{
			System.out.print(" ");
		}
		else
		{
			System.out.print("*");
		}
	}
	System.out.println();
}
System.out.println("#2");
int n=4;
for(int i=4;i>=1;i--)
{
	for(int j=1;j<=n;j++)
	{
		if(j<i)
		{
			System.out.print(' ');
		}
		else
		{
			System.out.print('*');
		}
	}
	System.out.println();
}

System.out.println();
		
//		****
//		***
//		**
//		*
//		#1
System.out.println("#1");
		for (int i=0;i<4;i++)
		{
			for(int j=1;j<=4-i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
//#2
		System.out.println("#2");
		
		for (int i=4;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}


		System.out.println("mirror of above");

//		****
//		 ***
//		  **
//		   *
//	#1
		System.out.println("#1");
		for(int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                if(j < i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
		
//	#2
		System.out.println("#2");
		int rows = 4;
        for (int i = 0; i < rows; i++) {
            // Print spaces before each asterisk
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            // Print asterisks
            for (int j = 0; j < rows - i; j++) {
                System.out.print("*");
            }

            System.out.println(); // Move to the next line
        }
		

System.out.println();
System.out.println("pyramid");
		
//		     *
//		    ***
//		   *****
//		  *******
//		 *********
		
		int x=4;
		for( int i=1;i<=x;i++)
		{
			for( int j=1;j<=x+i-1;j++)
			{
				if(i+j<=x)
				{
					System.out.print("!");
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	
//HALLOW PATTERNS
//		RIGHT ANGLE TRIANGLE
		for(int i=1;i<=5;i++)
		{
			for (int j=1;j<=5;j++)
			{
				if(j==1 || j==i || i==5)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println("SQUARE");
//		SQUARE
		for(int i=1;i<=5;i++)
		{
			for (int j=1;j<=5;j++)
			{
				if(i==1 || j==1 || i==5 || j==5)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}

}
