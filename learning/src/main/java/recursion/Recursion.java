package recursion;

public class Recursion {
	static int sum=0;
	static int count = 0;
	public static void add(int num1,int num2)
	{
		sum = num1+num2;
		while(sum<300)
		{
			System.out.println("Called Add method for - "+(++count)+" time and the sum is - "+sum);
			add(sum,10);
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add(10,20);
		System.out.println("Total is " + sum);
	}

}
