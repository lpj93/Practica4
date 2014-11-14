package products;

import java.util.ArrayList;

import playable_characters.Playable_Character;
import playable_characters.Playable_Character.Direction;


public class Map implements Element {

	ArrayList<Element> myRoomArray;
	int actualRoom;
	
	public Map()
	{
		myRoomArray = new ArrayList<Element>();
		this.actualRoom=0;
	}

	public void add(Element room) 
	{
		myRoomArray.add(room);
	}
	
	public Element getmyRoomArray(int i)
	{
		return myRoomArray.get(i);
	}
	
	public int getActualRoom() {
		return actualRoom;
	}
	
	public void setActualRoom(int actualRoom) {
		this.actualRoom = actualRoom;
	}

	@Override
	public int Entrar(Playable_Character choosen,Room room,Direction direction) 
	{
		((Room) myRoomArray.get(actualRoom)).addCharacter(choosen,4,6);
		System.out.print("Comienza tu aventura...");
		System.out.println();
		myRoomArray.get(actualRoom).Pintar();
		return room.getRoomNumber();
	}

	public void Pintar()
	{
		myRoomArray.get(actualRoom).Pintar();
	}
	
}
