package pattern.builder.main;

import pattern.builder.HouseBuilder;
import pattern.builder.entity.House;

public class Main {

	public static void main(String[] args){
		
		House defaultHouse = new HouseBuilder().build();
		System.out.println(defaultHouse);
		
		House house = new HouseBuilder().withDoors(10).withWalls(10).withWindows(10).build();
		System.out.println(house.toString());
	}
}
