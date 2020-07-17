import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt(),array[]=new int[5];
		System.out.println("Enter the array: ");
		for(int i=0;i<size;i++) array[i]=sc.nextInt();
		System.out.println("Enter the number to be searched: ");
		int target=sc.nextInt();
		for(int i=0;i<size;i++) if(array[i]==target) 	System.out.println("The number "+target+" is found at "+i);
	}
}
