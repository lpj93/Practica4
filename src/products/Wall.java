package products;

import playable_characters.*;
import playable_characters.Playable_Character.Direction;


public class Wall implements Element{

	String symbol;
	
	public Wall()
	{
		this.symbol="|";
	}
	
	public Wall CreateWall()
	{
		return new Wall();
	}
	
	@Override
	public int Entrar(Playable_Character choosen,Room room,Direction direction) 
	{ 
		System.out.print("I can t enter a wall...");
		System.out.println();
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
	
	public void Pintar(){ System.out.print(this.symbol);  }
	
	
}
