package practice;

import java.util.Scanner;

public class Stringsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter any string");
		Scanner s=new Scanner(System.in);
     String str=s.nextLine();
     String []arr=str.split(" "); 
     for(int i=0;i<arr.length;i++)
     {
    	 for(int j=i+1;j<arr.length;j++)
    	 {
    		 if(arr[i].length()>arr[j].length())
    		 {
    			 String t=arr[i];
    			 arr[i]=arr[j];
    			 arr[j]=t;
    		 }
    		
    	 }
     } 
     for(int i=0;i<arr.length;i++)
     {
    	 System.out.print(arr[i]+" ");
     }
	}

}
