import java.util.ArrayList;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList <Players> playerlist = new ArrayList <Players>();
		Scanner keyboard = new Scanner(System.in);
		
		String name;
		String waitingTime;		
		String type;
		String holdingTime;
		boolean input=false;
		
		System.out.println(input);	
		System.out.println("Please Enter the Player name: ");								
		name = keyboard.nextLine();
		System.out.println("Player name: " + name);
		
		System.out.println("Please Enter the waiting time: ");						
		waitingTime = keyboard.nextLine();
		System.out.println("The waiting time: " + waitingTime);
		
		System.out.println("Please Enter the type(g/b): ");	// g for 勾玉, b for 體力							
		type = keyboard.nextLine();
		System.out.println("the Type: " + type);
		
		System.out.println("Please Enter the holding time: ");						
		holdingTime = keyboard.nextLine();
		System.out.println("The holding time: " + holdingTime);
		
		
		
		
				
		}
	}


