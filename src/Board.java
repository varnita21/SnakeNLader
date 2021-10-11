import java.util.HashMap;

public class Board {
	int[][] board;
	HashMap<Integer,Integer> hm = new HashMap<Integer, Integer>();
	Board(int n,int m){
		board= new int[n][m];
		fillTheBoard(n,m);
	}
	
	public void fillTheBoard(int n,int m) {
		this.hm.put(2, 6);
		this.hm.put(5, 3);
	}
}

/*
 * 0 1 2 3
 * 4 5 6 7
 * 8 9 10 11
 * 
 * 
 */
