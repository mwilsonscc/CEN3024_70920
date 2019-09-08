package Wilson_Drone;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Author Name: Myra Wilson
 * Date: 2019 SEPT 01
 * Program Name: Wilson_Drone
 * Purpose: Simulation using button, drone movement in x,y,z, location
 * 
 * This class controls a drone.
 * The drone's location will be coordinates (x, y, z).
 * Every move will increase the specified coordinate by 1.
 * 
 */
public class Wilson_Drone {

	public static void main(String[] args) {
		int x = 0;
		int y = 0;
		int z = 0;
		int orientation = 0;
		String Orientation="South";
		
		int userInput = 0;
		
		Scanner menuChoice = new Scanner(System.in);
		
		do {
			try {
				System.out.println("Which direction would you like to move the drone?"
						+"\n1 - Move Up"
						+"\n2 - Move Down"
						+"\n3 - Move Forward"
						+"\n4 - Move Backward"
						+"\n5 - Turn Left"
						+"\n6 - Turn Right"
						+"\n7 - Display Position"
						+"\n8 - Exit Navigation"); //Display user menu

				userInput = menuChoice.nextInt(); //User's menu selection
				
				switch(userInput) {
				case 1:
					x++;
					System.out.println("You have moved up");
					break; //Move drone up
				case 2:
					x--;
					System.out.println("You have moved down");
					break; //Move drone down
				case 3:
					z++;
					System.out.println("You have moved forward");
					break; //Move drone forward
				case 4:
					z--;
					System.out.println("You have moved backward");
					break; //Move drone backward
				case 5:
					y--;
					orientation--;
					System.out.println("You have turned left");
					break; //Move and turn drone left
				case 6:
					y++;
					orientation++;
					System.out.println("You have turned right");
					break; //Move and turn drone right
				case 7:
					switch(orientation%4) {
					case 0:
						Orientation = "South";
						break;
					case 1:
						Orientation = "East";
						break;
					case 2:
						Orientation = "North";
						break;
					case 3:
						Orientation = "West";
						break;
					case -1:
						Orientation = "West";
						break;
					case -2:
						Orientation = "North";
						break;
					case -3:
						Orientation = "East";
						break;			
					} //Convert orientation value to text when displaying 				
					System.out.println("Your drone is located at position " + x + ", " + y + ", " + z + ", " + Orientation);
					break;
				case 8:
					switch(orientation%4) {
					case 0:
						Orientation = "South";
						break;
					case 1:
						Orientation = "East";
						break;
					case 2:
						Orientation = "North";
						break;
					case 3:
						Orientation = "West";
						break;
					case -1:
						Orientation = "West";
						break;
					case -2:
						Orientation = "North";
						break;
					case -3:
						Orientation = "East";
						break;			
					} //Convert orientation value to text when exiting 				
					System.out.println("Thank you for playing your drone is located at " + x + ", " + y + ", " + z + ", " + Orientation);
					break;				
				}//end of switch
				
			}
			catch (InputMismatchException ex){
				System.out.println("Please choose a number between 1 and 8 to proceed.");
				menuChoice.nextLine(); //Discard invalid input
			}
		} while(userInput !=8);		
		
	}// end of main


}


