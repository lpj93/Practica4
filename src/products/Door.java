package products;

import playable_characters.Playable_Character;
import playable_characters.Playable_Character.Direction;


public class Door implements Element{

	String symbol;
	private Room firstRoom; 
	private Room secondRoom;
	private boolean isOpen; 
	
	public Door(Room firstRoom, Room secondRoom,boolean open)
	{
		this.symbol= "/";
		this.firstRoom=firstRoom;
		this.secondRoom=secondRoom;
		this.isOpen=open;
	}
	
	public Door CreateDoor(Room firstRoom, Room secondRoom,boolean open)
	{
		return new Door(firstRoom,secondRoom,open);
	}
	
	public final Room otherSideOf(Room room)
	{
		if(room.getRoomNumber()==this.firstRoom.getRoomNumber())
		{
			return this.secondRoom;
		}
		else
		{
			return this.firstRoom;
		}
	}
	
	@Override
	public int Entrar(Playable_Character choosen,Room room,Direction direction) {
		if(this.isOpen==true)
		{
			return otherSideOf(room).Entrar(choosen,otherSideOf(room),direction);  
		}
		else
		{
			System.out.print("Is closed");
			System.out.print("I can t enter this door...");
			switch(direction)
			{
				case NORTH:
					choosen.setX(choosen.getX()+1);
					break;
					
				case SOUTH:
					choosen.setX(choosen.getX()-1);
					break;
					
				case EAST:
					choosen.setY(choosen.getY()-1);
					break;
					
				case WEST:
					choosen.setY(choosen.getY()+1);
					break;
				default:
					break;
			}
			return room.getRoomNumber();
		}
		
	}

	@Override
	public void Pintar() { System.out.print(this.symbol);	}

}
