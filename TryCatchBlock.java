package ExceptionHandling;
class Division{
	int a = 50;
	int b = 0;
	int c;
	public void div() //throws ArithmeticException
	{
	/*	c=a/b;
		System.out.println(c);
		*/
		try {
		c=a/b;
		System.out.println(c);
		}
		catch (ArithmeticException e) {
			//System.out.println(e);
			System.out.println("We can't do division by zero");
		}
	}
}
public class TryCatchBlock  {
    public static void main(String[] args)// throws ArithmeticException 
    {
	Division d = new Division();
	d.div();
  }
}
