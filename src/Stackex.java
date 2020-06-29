import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Stackex {

	
	public static void main (String [] args) {
	
		Stack<Integer> stack= new Stack<Integer>();
		
		try(Scanner input=new Scanner(System.in)){
			System.out.println("Please enter a number representing the limit of the amount of numbers you wish to enter.");
			
			int limit=input.nextInt();
			System.out.println("Please enter " + limit + " numbers");
			
			
			
			for(int i=0;i<limit;i++) {
				
				stack.push(input.nextInt());
			}
		
		}
		System.out.println("---------------------------------");
		
		for(Integer number:stack) {
			System.out.println(number);
		}
		
		System.out.println("---------------------------------");
		
		Iterator<Integer> iterator=stack.listIterator();
		
		
		while(iterator.hasNext()) {
			
			int numbers=stack.pop();
			System.out.println(numbers);
			
		}
		
		boolean empty=stack.isEmpty();
		
		System.out.println(empty);
		
	
	
	
	}
}
