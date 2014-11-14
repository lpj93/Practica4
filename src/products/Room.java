package products;

import java.util.ArrayList;

import playable_characters.*;
import playable_characters.Playable_Character.Direction;


public class Room implements Element {
	
	private int roomNumber;
	public static final int size = 10;
	private Element[][] roomRep;
	private ArrayList<Playable_Character> CharacterRep;


	public Room(int roomNum)
	{
		this.roomNumber = roomNum;
		this.roomRep = new Element[size][size];
		this.CharacterRep = new ArrayList<Playable_Character>();
	}
	
	public void addCharacter(Playable_Character character,int x,int y)
	{
		character.setX(x);
		character.setY(y);
		CharacterRep.add(character);
	}
	
	public int getRoomNumber() {
		return roomNumber;
	}

	/*public int getSize() {
		return size;
	}
	 */
	
	public Element[][] getRoomrep() {
		return roomRep;
	}
	
	public Element getRoomRepElement(int x,int y)
	{
		return roomRep[x][y];
	}
	
	public void setRoomRepElement(Element element,int x,int y) {
		getRoomrep()[x][y] = element;
	}
	
	public void setEastLimit(Element element)
	{
		for(int i =0;i<roomRep.length;i++)
		{
			setRoomRepElement(element,i,0);
		}
	}
	
	public void setWestLimit(Element element)
	{
		for(int i =0;i<roomRep.length;i++)
		{
			setRoomRepElement(element,i,roomRep.length-1);
		}
	}
	
	public void setNorthLimit(Element element)
	{
		for(int i =0;i<roomRep.length;i++)
		{
			setRoomRepElement(element,0,i);
		}
	}
	
	public void setSouthLimit(Element element)
	{
		for(int i =0;i<roomRep.length;i++)
		{
			setRoomRepElement(element,roomRep.length-1,i);
		}
	}
	
	public void setGround(Element element) {
		for(int i=1;i<roomRep.length-1;i++)
		{
			for(int j=1;j<roomRep.length-1;j++)
			{
				setRoomRepElement(element,i,j);
			}
		}
	}

	public void setPuntualElement(Element element,Direction dir)
	{
		switch(dir)
		{
			case NORTH:
				setRoomRepElement(element,0,roomRep.length/2);
				break;
				
			case EAST:
				setRoomRepElement(element,roomRep.length/2,0);
				break;
				
			case SOUTH:
				setRoomRepElement(element,roomRep.length-1,roomRep.length/2);
				break;
				
			case WEST:
				setRoomRepElement(element,roomRep.length/2,roomRep.length-1);
				break;
				
			default:	
				break;
		}
	}
	
	@Override
	public int Entrar(Playable_Character choosen,Room room,Direction direction) 
	{
		addCharacter(choosen,roomRep.length/2,roomRep.length/2);
		switch(direction)
		{
			case NORTH:
				choosen.setX(roomRep.length-2);
				break;
				
			case SOUTH:
				choosen.setX(1);					
				break;
				
			case EAST:
				choosen.setY(1);			
				break;
				
			case WEST:
				choosen.setY(roomRep.length-2);
				break;
				
			default:
				break;
	}
		return room.getRoomNumber();
	}

	@Override
	public void Pintar() 
	{
		for(int i=0;i<roomRep.length;i++)
		{
			for(int j=0;j<roomRep.length;j++)
			{
				if(CharacterRep.get(0).getX()==i&& CharacterRep.get(0).getY()==j)
				{
					CharacterRep.get(0).Pintar();
				}
				else
				{
					roomRep[i][j].Pintar();
				}
			}
			System.out.println();
		}

	}
	
}
