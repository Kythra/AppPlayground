package players;

import game.*;

import java.util.Scanner;


public class Human extends Player{
	final Stone color;
	
	public Human(Stone color){
		super(color);
		this.color = color;
	}
	
	public int[] getNextMove(board myboard, Scanner reader) {
		// TODO Auto-generated method stub
		int x;
		int y;
		System.out.println("Enter row:");
		x = reader.nextInt()-1;
		System.out.println("Enter column:");
		y = reader.nextInt()-1;
		int[] array = {x,y};
		return array;
	}

}
