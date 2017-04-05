package players;

import game.Stone;
import game.board;

import java.util.Random;
import java.util.Scanner;



public class randomKI extends Player implements KI{
	final Stone color;
	
	public randomKI(Stone color){
		super(color);
		this.color = color;
	}
	
	public int[] getNextMove(board myboard, Scanner reader) {
		// TODO Auto-generated method stub
		Random random = new Random();
		int x = random.nextInt(5);
		int y = random.nextInt(5);
		int[] array = {x,y};
		return array;
	}
	
}
