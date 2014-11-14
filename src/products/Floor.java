package products;

import playable_characters.Playable_Character;
import playable_characters.Playable_Character.Direction;


public class Floor implements Element {

	String symbol= " ";
	
	@Override
	public int Entrar(Playable_Character choosen,Room room,Direction direction) 
	{
		return room.getRoomNumber();
	}

	@Override
	public void Pintar() {	System.out.print(this.symbol);}
	
}
