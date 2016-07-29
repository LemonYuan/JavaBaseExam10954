package com.hand;



public class App {
   public static void main(String args[])
   {
	   int counter=0;
	   for (int i = 101; i <=200; i++) {
		   int index=0;
		for (int j=2;j<i;j++)
		{
			if(i%j==0)
			{
				index=1;
			}

		}
		if(index==0)
		{
			counter++;
		}
	}
	   System.out.print("101-200之间共有素数"+counter+"个，分别为：");
	   for (int y = 101; y <=200; y++) {
		   int index=0;
		for (int x=2;x<y;x++)
		{
			if(y%x==0)
			{
				index=1;
			}

		}
		if(index==0)
		{
			System.out.print(y+" , ");
		}
	}
   }
}
