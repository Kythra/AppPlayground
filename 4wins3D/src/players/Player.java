package players;

import java.util.Scanner;

import game.*;

public class Player {
	final Stone color;
	
	public Player(){
		this.color = Stone.EMPTY;
	}
	
	public Player(Stone color){
		this.color = color;
	}
	
	public int[] getNextMove(board myboard, Scanner reader) {
		return null;
	}
}
