
public class CharDigit {

	public static void main(String[] args) {

		String s="gj72@cwo6#48%f*e723",chars ="",digits="",spls ="";
		int charcount=0,digitcount=0,splchars=0;
		
		for(int i=0;i<s.length();i++)
		{
			if(Character.isAlphabetic(s.charAt(i)))
				{
					charcount++;
					chars=chars+s.charAt(i);
				}
			else if(Character.isDigit(s.charAt(i)))
				{
					digitcount++;
					digits=digits+s.charAt(i);
				}
			else
				{
					splchars++;
					spls=spls+s.charAt(i);
				}
		}
		System.out.println("count of Alphabets = "+charcount);
		System.out.println("count of digits = "+digitcount);
		System.out.println("count of special characters = "+splchars);
		System.out.println("Alphabets-Digits-Special Chars = "+chars+digits+spls);

	}

}
