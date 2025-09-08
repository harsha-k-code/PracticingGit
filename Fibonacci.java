
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=6,a=0,b=0,c=1;
		
		for(int i=0;i<n;i++)
		{
			a=b;
			b=c;
			c=a+b;
			System.out.println(a);

		}
	}

}
