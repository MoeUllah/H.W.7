
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class QueueEx {

	public static void main (String [] args) {
		
		Queue<Integer> queue= new PriorityQueue<Integer>();
		
		try(Scanner input=new Scanner(System.in)){
			System.out.println("Please enter a number representing the limit of the amount of numbers you wish to enter.");
			
			int limit=input.nextInt();
			System.out.println("Please enter " + limit + " numbers");
			
			
			
			for(int i=0;i<limit;i++) {
				
				queue.add(input.nextInt());
			}
		}
		System.out.println("---------------------------------");
		
		for(Integer number:queue) {
			System.out.println(number);
		}
		
		System.out.println("---------------------------------");
		
		Iterator<Integer> iterator=queue.iterator();
		
		
		while(!(queue.isEmpty())) {
			
			int numbers=queue.poll();
			System.out.println(numbers);
			
		}
		
		boolean empty=queue.isEmpty();
		
		System.out.println(empty);
		
	}
}
