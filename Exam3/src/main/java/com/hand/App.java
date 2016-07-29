package com.hand;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
               try {
				Scanner input=new Scanner(System.in);
				   System.out.println("请输入日期：");
				   String date=input.next();
				  char c[]=date.toCharArray();
				  char year1=c[0];
				  char year2=c[1];
				  char year3=c[2];
				  char year4=c[3];
				  char months1=c[5];
				  char months2=c[6];
				  char days1=c[8];
				  char days2=c[9];
				  int y=getMonth(year1)*1000+getMonth(year2)*100+getMonth(year3)*10+getMonth(year4);
				  int m=getMonth(months1)*10+getMonth(months2);
				  int d=getMonth(days1)*10+getMonth(days2);
				  boolean b=isRoundYear(y);
				  int monthday=monthDays(m,b);
				  if((0<m&&m<=12)&&(0<d&&d<=monthday))
				  {
				  System.out.println(d);
				  int total=getTotalMonthDays(m,b)+d;
				  System.out.println("这是今年的第："+total+"天");
				  }
				  else
				  {
					  System.out.println("输入错误");
				  }
			} catch (Exception e) {
				System.out.println("输入错误");
			}
	}
	public static boolean isRoundYear(int i)
	{
		if((i%100==0)||(i%4==0))
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
   public static int getMonth(char str){
	   int m=0;
	if(str=='1')
	{
		m=1;
	}
	else if(str=='2')
	{
		m=2;
	}
	else if(str=='3')
	{
		m=3;
	}
	else if(str=='4')
	{
		m=4;
	}
	else if(str=='5')
	{
		m=5;
	}
	else if(str=='6')
	{
		m=6;
	}
	else if(str=='7')
	{
		m=7;
	}
	else if(str=='8')
	{
		m=8;
	}
	else if(str=='9')
	{
		m=9;
	}

	return m;
   }
   public static int getTotalMonthDays(int month,boolean b){
	 int se=28;
	   if(b)
	  {
		se=29;  
	  }
	   if(month==1)
	   {
		   return 0;
	   }
	   else if(month==2)
	   {
		   return 31;
	   }
	   else if(month==3)
	   {
		   return 31+se;
	   }
	   else if(month==4)
	   {
		   return 31+se+31;
	   }
	   else if(month==5)
	   {
		   return 31+se+31+30;
	   }
	   else if(month==6)
	   {
		   return 31+se+31+30+31;
	   }
	   else if(month==7)
	   {
		   return 31+se+31+30+31+30;
	   }
	   else if(month==8)
	   {
		   return 31+se+31+30+31+30+31;
	   }
	   else if(month==9)
	   {
		   return 31+se+31+30+31+30+31+31;
	   }
	   else if(month==10)
	   {
		   return 31+se+31+30+31+30+31+31+30;
	   }
	   else if(month==11)
	   {
		   return 31+se+31+30+31+30+31+31+30+31;
	   }   
	   else if(month==12)
	   {
		   return 31+se+31+30+31+30+31+31+30+31+30;
	   }
	return 0; 
   }
   public static int monthDays(int month,boolean b)
   {
	   int se=28;
	   if(b)
	  {
		se=29;  
	  }
	   if(month==1)
	   {
		   return 31;
	   }
	   else if(month==2)
	   {
		   return se;
	   }
	   else if(month==3)
	   {
		   return 31;
	   }
	   else if(month==4)
	   {
		   return 30;
	   }
	   else if(month==5)
	   {
		   return 31;
	   }
	   else if(month==6)
	   {
		   return 30;
	   }
	   else if(month==7)
	   {
		   return 31;
	   }
	   else if(month==8)
	   {
		   return 31;
	   }
	   else if(month==9)
	   {
		   return 30;
	   }
	   else if(month==10)
	   {
		   return 31;
	   }
	   else if(month==11)
	   {
		   return 30;
	   }   
	   else if(month==12)
	   {
		   return 31;
	   }
	return 0; 
   }
}
