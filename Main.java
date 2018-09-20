package pojo;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		
		Player play=new Player("viru",22,"m");
		
		System.out.println("name="+play.getName());
		System.out.println("age="+play.getAge());
		
				
		
		List<Player> PLAYERS = new ArrayList<>();
		
		PLAYERS.add(new Player("Ronaldo",20,"m"));
	
		
		PLAYERS.add(new Player("Messy",26,"m"));
		PLAYERS.add(new Player("Virus",22,"m"));
		PLAYERS.add(new Player("Omkar",22,"m"));
		
		Iterator<Player> my=PLAYERS.iterator();
		
		while(my.hasNext())
		{
			Player Team;
			Team=my.next();
			System.out.println("name"+Team.getName());
			
			
		}
		

	}

}
