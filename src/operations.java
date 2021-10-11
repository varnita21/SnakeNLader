
public class operations {

	Players p1;
	Players p2;
	
	int count=0;
	Board b = new Board(3,3);
	public void defPlayers(String name, String c) {
		if(p1 == null)
			p1 = new Players(name, c);
		else
			p2 = new Players(name, c);

	}
	
	public void number(int num, String player) {
		if(player == "Varnita") {
			System.out.println("num "+p1.position);
			if(p1.position==-1 && num==6) {
				p1.position = 0;
				
			}else if(p1.position != -1) {
//				p1.position +=num;
				if(p1.position==8) {
					System.out.println(p1.name+" Won");
				}
				p1.position += checkPosition(p1.position);
			}else {
				System.out.println("Sorry next try "+p1.position);
			}
			
			count++;
		}
		else if(player == "abc") {
			if(p2.position==-1 && num==6) {
				p1.position = 0;
				System.out.println("here");
			}else if(p2.position != -1) {
//				p2.position +=num;
				if(p2.position==8) {
					System.out.println(p2.name+" Won");
				}
				p2.position += checkPosition(p2.position);
			}
			else {
				System.out.println("Sorry next try "+p2.position);
			}
			count++;
		}
		}

	private int checkPosition(int position) {
		// TODO Auto-generated method stub
		if(b.hm.containsKey(position)) {
			return b.hm.get(position);
		}
		return position;
	}
	
}
