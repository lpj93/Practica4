package products;

import playable_characters.Playable_Character;
import playable_characters.Playable_Character.Direction;


public interface Element {

	int Entrar(Playable_Character choosen,Room room,Direction direction);
	
	void Pintar();
	
}
