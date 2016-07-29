package com.hand;



import java.util.Scanner;

public class App {
  public static void main(String args[])
  {
	  Scanner input=new Scanner(System.in);
	  System.out.println("请输入工资：");
	  int tax_salary=input.nextInt()-3500;
	  double taxrate;
      if(tax_salary<0)
      {
    	  taxrate=0;
      }
      else if(tax_salary<=1500)
      {
    	  taxrate=0.03;
      }
      else if(tax_salary<=4500)
      {
    	  taxrate=0.1;
      }
      else if(tax_salary<=9000)
      {
    	  taxrate=0.2;
      }
      else if(tax_salary<=35000)
      {
    	  taxrate=0.25;
      }
      else if(tax_salary<=55000)
      {
    	  taxrate=0.3;
      }
      else if(tax_salary<=80000)
      {
    	  taxrate=0.35;
      }
      else
      {
    	  taxrate=0.45;
      }
      System.out.println("所需要缴纳的税费为:"+tax_salary*taxrate);
  }
}
