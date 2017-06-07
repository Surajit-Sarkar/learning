package excpetionHandling;

public class ExcpetionHandling {
	
	public static int tryMe()
	{
		try{
			System.out.println("In Try block...");
			return 3;
			//throw new Exception();
		}catch(Exception e)
		{
			System.out.println("Inside Catch block...");
			return 0;
		}
		finally{
			System.out.println("Inside finally block...");
			//return 1;
		}
	}
	
	public static void main(String args[])
	{
		System.out.println(tryMe());
	}

}
