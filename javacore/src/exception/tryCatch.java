package exception;

public class tryCatch {

	public static void main(String[] args) {
		int a = 10,b=0 ;
		try {
			int c=a/b;
			System.out.println(c);
		}catch(NullPointerException e)
		{
			System.out.println("Block 1");
		}
		catch(Exception e)
		{
			System.out.println("Division is not possible");
		}

	}

}
