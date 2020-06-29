import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class LinkedListex {
	
	
	public static void main (String [] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter a number representing the limit of the amount of numbers you wish to enter.");
		
		int limit=input.nextInt();
		System.out.println("Please enter " + limit + " numbers");
		
		LinkedList<Integer> linkedList= new LinkedList<Integer>();
		
		for(int i=0;i<limit;i++) {
			
			linkedList.add(input.nextInt());
		}
		
		System.out.println("---------------------------------");
		
		for(Integer number:linkedList) {
			System.out.println(number);
		}
		
		System.out.println("---------------------------------");
		
		Iterator<Integer> iterator=linkedList.descendingIterator();
		
		try {while(iterator.hasNext()) {
			
			int numbers=linkedList.poll();
			System.out.println(numbers);
			}
		}catch(NullPointerException e) {}
		finally {
			input.close();
			System.out.println("Finally block is executed.");
		}
		
		while(!(linkedList.isEmpty())) {
			
			Integer	numbers=linkedList.remove();
			System.out.println(numbers);
			
		}
		
		
	}
}
	
	

