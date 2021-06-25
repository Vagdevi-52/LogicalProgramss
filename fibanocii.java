package logicalprogramss;

import java.util.Scanner;
public class fibanocii
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter a number:"); 
	   int n1=0,n2=1,n3,i;
	  System.out.print(n1+" "+n2);    
	  int nextnumber = scanner.nextInt();  
	 for(i=2;i<nextnumber;++i)   
	 {    
	  n3=n1+n2;    
	  System.out.println(" "+n3);    
	  n1=n2;    
	  n2=n3;    
	 }
	}

}
