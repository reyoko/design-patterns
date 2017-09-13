package pattern.builder;

import pattern.builder.entity.House;

public class HouseBuilder {
	private Integer quantityOfDoors = 1;
	private Integer quantityOfWalls = 1;
	private Integer quantityOfWindows = 1;
	
	public HouseBuilder withDoors(final Integer quantityOfDoors){
		this.quantityOfDoors = quantityOfDoors;
		return this;
	}
	
	public  HouseBuilder withWalls(final Integer quantityOfWalls){
		this.quantityOfWalls = quantityOfWalls;
		return this;
	}
	
	public HouseBuilder withWindows(final Integer quantityOfWindows){
		this.quantityOfWindows = quantityOfWindows;
		return this;
	}
	
	public House build(){
		House house = new House();
		house.setQuantityOfDoors(this.quantityOfDoors);
		house.setQuantityOfWalls(this.quantityOfWalls);
		house.setQuantityOfWindows(this.quantityOfWindows);
		return house;
	}
}
