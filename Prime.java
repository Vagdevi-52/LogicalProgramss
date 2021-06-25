package logicalprogramss;

import java.util.Scanner;

public class Prime 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
        System.out.println("enter any number");      
	    int n=sc.nextInt();
	    int flag=1;
	   for(int i=2; i<=n/2; i++)
    	{
		if(n%i==0)
		{
			flag=0;
			break;
		}
		else
		{
			flag=1;
			continue;
		}
    	}
	if(flag==1)
	{
		System.out.println(n +"is a prime number");
	}
		else
		{
			System.out.println(n +"is not a prime number");
		}
	}
}