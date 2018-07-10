package application;

import pojo.Player;

public class FootballGame {

	public static void main(String[] args) {
		Player goalkeeper=new Player();
		Player striker = new Player("omkar",23);
		System.out.println("Striker: "+striker.getName() +striker.getAge());
		goalkeeper.setAge(22);
		System.out.println("--->"+ goalkeeper.getAge());

	}

}
