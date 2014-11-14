package products;

import playable_characters.Playable_Character;
import playable_characters.Playable_Character.Direction;



public class AlternativeFloor implements Element {

	String symbol= "#";
	
	@Override
	public int Entrar(Playable_Character choosen,Room room,Direction direction) 
	{
		System.out.print("I have to be careful, this floor is dangerous.");
		System.out.println();
		return room.getRoomNumber();
	}

	@Override
	public void Pintar() {	System.out.print(this.symbol);}

}
