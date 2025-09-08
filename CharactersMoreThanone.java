import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CharactersMoreThanone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s= "sreeharsha.k";
		char[] c= s.toCharArray();
		Map<Character,Integer> m = new HashMap<Character,Integer>();
		for(int i=0;i<c.length;i++)
		{ 
			if(m.containsKey(c[i]))
				m.put(c[i], m.get(c[i])+1);
			else
				m.put(c[i], 1);
		}
		Set<Entry<Character, Integer>> a = m.entrySet();
		Iterator<Entry<Character, Integer>> i= a.iterator();
		while(i.hasNext())
		{
			Map.Entry<Character,Integer> n =(Map.Entry<Character,Integer>)i.next();
			if(n.getValue()>1)
				System.out.println(n.getKey()); 
		}
	}
}
