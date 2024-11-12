package board.control;

import java.util.Arrays;

public class WuerfelD3 extends Wuerfel<Integer> {
	Integer[] augen = {1,2,3};
	
	public WuerfelD3() {
		seiten.addAll(Arrays.asList(augen));
	}
 
}
