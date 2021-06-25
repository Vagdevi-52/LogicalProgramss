package logicalprogramss;

import java.util.Scanner;

public class ReverseNumber
{
	public static void main(String[] args)
	{
	  System.out.println("enter the number by your choice:");
      Scanner sc=new Scanner(System.in);
      int num=sc.nextInt();
      int rem=0,rev=0;
      while(num>0)
     {
    	 rem=num%10;
    	 rev=rem+rev*10;
    	 num=num/10;
     }
     System.out.println("reverse of the numberis :"+rev);
	}
}
