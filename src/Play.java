
public class Play {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		operations o = new operations();
		o.defPlayers("Varnita", "Red");
		o.defPlayers("abc", "Yellow");
		o.number(1,"Varnita");
		o.number(6, "abc");
		o.number(6, "Varnita");
		o.number(1, "abc");
		o.number(6, "Varnita");
		o.number(2, "abc");
		o.number(2, "Varnita");
		o.number(6, "abc");
		o.number(6, "Varnita");
		
	}
/*
 * 6 7 8
 * 5 4 3
 * 0 1 2 
 */
}
