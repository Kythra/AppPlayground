package players;
import java.util.Scanner;

import game.*;


public interface KI{
	final Stone color = Stone.EMPTY;
	public int[] getNextMove(board myboard, Scanner reader);
}
