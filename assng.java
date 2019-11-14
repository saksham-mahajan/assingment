/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;

/**
 *
 * @author Saksham mahajan
 */


public class sum 
{
public static void main(String arg[])
    {
	Scanner in=new Scanner(System.in);
        System.out.println("enter the size of array");
	int a=in.nextInt();
	int arr[]=new int[a];
        System.out.println("enter the elements of array");
	for(int i=0;i<a;i++)
	{
		arr[i]=in.nextInt();
	}
	int b=in.nextInt();
	int sum=0;
	int windowsize=0;
	for(int i=0;i<a;i++)
	{
		sum=sum+arr[i];
	     if(sum<=b)
		{
			windowsize++;
		}
	      if(sum>b)
		{
			sum=sum-arr[i-windowsize];
		}
	      if(sum==b)
		{
			System.out.println((i-windowsize+1)+" "+i);
		}
               if(b==arr[i])
		{
			System.out.println(i+" "+i);
			sum=0;
			windowsize=0;
		}
	}
    }
}
  
    

   
