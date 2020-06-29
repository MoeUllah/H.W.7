
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListEx {

	
	public static void main (String [] args) {
	
		List<Integer> arrayList= new ArrayList<Integer>();
		
		int i;
		for(i=0;i<100;i+=10) {
			
			arrayList.add(i);
		}
		
		
		arrayList.add(120);
		arrayList.add(55);
		arrayList.add(67);
		arrayList.add(8);
		arrayList.add(36);
		arrayList.add(206);
		arrayList.add(6);
		
		Iterator<Integer> iterator=arrayList.listIterator();
		
		while(iterator.hasNext()) {
			
			Integer	numbers=iterator.next();
			System.out.println(numbers);
			
		}
		
		System.out.println("---------------------------------");
			
		for(Integer number:arrayList) {
			System.out.println(number);
		}
	
	
		
		
	}	
		
		
		
		
		
		
		
}



