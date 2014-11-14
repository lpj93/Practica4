package creator;

import products.*;


public class Classic extends ScreenGame{

	
	public Classic(){}
	
	public Element CreateWall()
	{
		return new Wall();
	}
	
	public  Element CreateDoor(Room h1, Room h2,boolean state)
	{
		return new Door(h1,h2,state);
	}

	@Override
	public Element CreateFloor() {
		return new Floor();
	}
}
