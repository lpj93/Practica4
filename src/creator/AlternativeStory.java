package creator;

import products.*;



public class AlternativeStory extends ScreenGame {
	
	
	public AlternativeStory(){}
	
	public Element CreateWall()
	{
		return new AlternativeWall();
	}
	
	public  Element CreateDoor(Room h1, Room h2,boolean state)
	{
		return new AlternativeDoor(h1,h2,state);
	}

	@Override
	public Element CreateFloor() {
		return new AlternativeFloor();
	}
	
}
