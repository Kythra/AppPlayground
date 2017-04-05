package game;
import java.util.Scanner;

import players.*;

/**
 * 
 */

/**
 * @author katja
 *
 */
public class game {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		newGame(reader);
		String answer = "";
		do{
			System.out.println("Do you want to play again? [y/n]");
			answer = reader.next();
			if (answer.equals("y")) {
				newGame(reader);
			}else if (answer.equals("n")){
				System.out.println("Thank you for playing.");
				reader.close();
				break;
			} else {
				System.out.println("Not a valid answer. Please enter y for yes and n for no.");
			}
		}while(true);
	}
	
	private static void newGame(Scanner reader){
	//	Scanner reader = new Scanner(System.in);
		board myboard = new board();
		Stone player = myboard.whosTurn();
		System.out.println("Player " + player + " starts.");
		
		String answer = "";
		System.out.println("Who is the first player? [human/randomKI]");
		
		Player player1 = new Player();
		Player player2 = new Player();
		do{
			answer = reader.next();
			if (answer.equals("h")) {
				player1 = new Human(player);
				System.out.println("First player is human.");
				break;
			}else if (answer.equals("r")){
				player1 = new randomKI(player);
				System.out.println("First player is the randomKI.");
				break;
			} else {
				System.out.println("Sorry, I'm a bit of a racist only humans[h] and KIs[r] allowed.");
			}
		}while(true);
		System.out.println("Who is the second player? [human/randomKI]");
		do{
			answer = reader.next();
			if (answer.equals("h")) {
				player2 = new Human(player);
				System.out.println("Second player is human.");
				break;
			}else if (answer.equals("r")){
				player2 = new randomKI(player);
				System.out.println("Second player is the randomKI.");
				break;
			} else {
			System.out.println("Sorry, I'm a bit of a racist only humans[h] and KIs[r] allowed.");
			}
		}while(true);
		int x = 0;
		int y = 0;
		int[] array;
		for (int i= 1; i< 100; i++){
			array = player1.getNextMove(myboard, reader);
			x = array[0];
			y = array[1];
			System.out.println("Player " + player.toString() + " puts his stone into (" + (x+1) + ", " + (y+1) + ")");
			if (myboard.setStone(x, y, player).equals(player)){
				System.out.println("Game ends.");
				break;
			}
			myboard.print();
			player = player.switchColor();

			array = player2.getNextMove(myboard, reader);
			x = array[0];
			y = array[1];
			System.out.println("Player " + player.toString() + " puts his stone into (" + (x+1) + ", " + (y+1) + ")");
			if (myboard.setStone(x, y, player).equals(player)){
				System.out.println("Game ends.");
				break;
			}
			myboard.print();
			player = player.switchColor();
		}
	}

}
