public class PrimeNum {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int n=31,mid=n/2;
		 boolean isPrime=true;		 
		 for(int i=2;i<=mid;i++)
		 {
			 if(n%i==0)
			 {
				 isPrime = false;
				 break;
			 }
		 }
		 if(isPrime)
			 System.out.println("Prime");
		 else
			 System.out.println("False");
	}
}
