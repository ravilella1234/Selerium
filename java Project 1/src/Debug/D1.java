package Debug;



import java.util.Scanner;

public class D1 
{
		
	public int arrayDemo()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Array Size : ");
		int aSize = sc.nextInt();
		
		int[] a = new int[aSize];
		int sum=0;
		System.out.println("Enter the array Elements : ");
		for(int i=0;i<a.length;i++)
		{
			a[i] = sc.nextInt();
			System.out.println("a["+i+"]="+a[i]);
			sum = sum+a[i];
		}
		System.out.println("Sum of Array Elements : " + sum);
		return sum;
	}

	public static void main(String[] args) 
	{
		D1 obj = new D1();
		int count = obj.arrayDemo();
		System.out.println("Count of Array Elements in outside is : " + count);

	}

}
