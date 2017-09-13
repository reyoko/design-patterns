package pattern.builder.entity;

public class House {

	Integer quantityOfDoors;
	
	Integer quantityOfWalls;
	
	Integer quantityOfWindows;

	public House() {
	}

	public Integer getQuantityOfDoors() {
		return quantityOfDoors;
	}

	public void setQuantityOfDoors(Integer quantityOfDoors) {
		this.quantityOfDoors = quantityOfDoors;
	}

	public Integer getQuantityOfWalls() {
		return quantityOfWalls;
	}

	public void setQuantityOfWalls(Integer quantityOfWalls) {
		this.quantityOfWalls = quantityOfWalls;
	}

	public Integer getQuantityOfWindows() {
		return quantityOfWindows;
	}

	public void setQuantityOfWindows(Integer quantityOfWindows) {
		this.quantityOfWindows = quantityOfWindows;
	}

	@Override
	public String toString() {
		return "House [quantityOfDoors=" + quantityOfDoors + ", quantityOfWalls=" + quantityOfWalls
				+ ", quantityOfWindows=" + quantityOfWindows + "]";
	}
	
	
	
}
