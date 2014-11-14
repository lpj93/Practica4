package creator;

import products.*;
import playable_characters.Playable_Character.Direction;



public abstract class ScreenGame {
	
	public final Map create() {
		
			 Map myMap = new Map();
			 Room h1 = new Room(0);
			 Room h2 = new Room(1);
			 myMap.add(h1);
			 myMap.add(h2);
			 Element theDoor = CreateDoor(h1,h2,true);
			 //Element theDoor = CreateDoor(h1,h2,false);

			 h1.setGround(CreateFloor());
			 h1.setNorthLimit(CreateWall());
			 h1.setEastLimit(CreateWall());
			 h1.setPuntualElement(theDoor,Direction.EAST);
			 h1.setSouthLimit(CreateWall());
			 h1.setWestLimit(CreateWall());	 
			 
			 h2.setGround(CreateFloor());
			 h2.setNorthLimit(CreateWall());
			 h2.setEastLimit(CreateWall());
			 h2.setSouthLimit(CreateWall());
			 h2.setWestLimit(CreateWall());
			 h2.setPuntualElement(theDoor,Direction.WEST);
			 
			  
			 return myMap;
			
	}
	
	public abstract Element CreateFloor();
	public abstract Element CreateWall();
	public abstract Element CreateDoor(Room h1, Room h2,boolean state);
	
}
