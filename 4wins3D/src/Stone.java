import java.util.Random;


public enum Stone {
	BLACK, WHITE, EMPTY;
	
	public String toString(){
		switch(this){
		case BLACK: return "B";
		case WHITE: return "W";
		default: return "-";
		}
	}
	
	public Stone switchColor(){
		switch(this){
		case BLACK: return WHITE;
		case WHITE: return BLACK;
		default: return EMPTY;
		}
	}
	
	static Stone random(){
		Random random = new Random();
		if (random.nextBoolean()){
			return BLACK;
		}
		return WHITE;
	}
}
