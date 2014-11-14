package products;

import playable_characters.Playable_Character;
import playable_characters.Playable_Character.Direction;


public class AlternativeWall implements Element{

String symbol;
	
	public AlternativeWall()
	{
		this.symbol="|";
	}
	
	public AlternativeWall CreateWall()
	{
		return new AlternativeWall();
	}
	
	@Override
	public int Entrar(Playable_Character choosen,Room room,Direction direction) 
	{ 
		System.out.print("I can t enter a wall, even less if it s frozen...");
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
