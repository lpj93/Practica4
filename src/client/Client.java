package client;

import java.util.Scanner;

import playable_characters.*;
import products.*;
import creator.*;
import playable_characters.Playable_Character.Direction;

public class Client {

	public Client()
	{
		ScreenGame mygame = new Classic();
		//ScreenGame mygame = new AlternativeStory();
		Element myMap = mygame.create();
		Playable_Character mywarrior = new Warrior();
		Room room = (Room) ((Map) myMap).getmyRoomArray(((Map) myMap).getActualRoom());
		int initialRoom= myMap.Entrar(mywarrior,room,Direction.NORTH);
		int actualRoom=initialRoom;
		while(mywarrior.isAlive())
		{
			switch(Ask_movement())
			{
				
				case "w":
					mywarrior.Move(Direction.NORTH,mywarrior);
					actualRoom =room.getRoomRepElement(mywarrior.getX(),mywarrior.getY()).Entrar(mywarrior,room,Direction.NORTH);
					break;
				case "s":
					mywarrior.Move(Direction.SOUTH,mywarrior);
					actualRoom =room.getRoomRepElement(mywarrior.getX(),mywarrior.getY()).Entrar(mywarrior,room,Direction.SOUTH);
					break;
				case "d":
					mywarrior.Move(Direction.EAST,mywarrior);
					actualRoom =room.getRoomRepElement(mywarrior.getX(),mywarrior.getY()).Entrar(mywarrior,room,Direction.EAST);
					break;
				case "a":
					mywarrior.Move(Direction.WEST,mywarrior);
					actualRoom =room.getRoomRepElement(mywarrior.getX(),mywarrior.getY()).Entrar(mywarrior,room,Direction.WEST);
					break;
			}
			
			((Map) myMap).setActualRoom(actualRoom);
			room = (Room) ((Map) myMap).getmyRoomArray(((Map) myMap).getActualRoom());
			myMap.Pintar();
		}	
	}

	public String Ask_movement()
	{
		String direction = "";
			
			System.out.println ("Por favor introduzca un movimiento utilizando w,a,s,d por teclado:");
			Scanner ScannerIn = new Scanner (System.in); 
	   	direction = ScannerIn.nextLine (); 
		
		return direction;
	}
}
