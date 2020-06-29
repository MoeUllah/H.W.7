import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class HashMapex {

	public static void main (String [] args) {
		
		Map<Integer,String> hashMap= new HashMap<>();
		
		try(Scanner input=new Scanner(System.in)){
			
			System.out.println("Please enter a number for the limit of names you wish to enter.");
			int limit=input.nextInt();
			System.out.println("Please enter " + limit + " names.");
			
			int i=0;
			while(i<limit) {
				
				hashMap.put(i,input.next());
				i++;
			}
			
			Set<Map.Entry<Integer,String>> entrySet=hashMap.entrySet();
			Iterator<Entry<Integer, String>> iterator=entrySet.iterator();
			for(Map.Entry<Integer, String> entry:entrySet) {
				int j=entry.getKey() +1;
				System.out.println(j + " " + entry.getValue());
			}
			
			
		}
		
		
		
		
	}
}
