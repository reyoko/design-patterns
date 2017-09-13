package pattern.abstractFactory.main;
import pattern.abstractFactory.client.HouseBuilder;
import pattern.abstractFactory.factory.AbstractHouseFactory;
import pattern.abstractFactory.factory.BigHouseFactory;
import pattern.abstractFactory.factory.SmallHouseFactory;

public class Main {

	public static void main(String[] args){
		HouseBuilder builder = new HouseBuilder();
		AbstractHouseFactory houseFactory = null;
		
		//creating a small house
		houseFactory = new SmallHouseFactory();
		builder.buildHouse(houseFactory);
		
		//creating a big house
		houseFactory = new BigHouseFactory();
		builder.buildHouse(houseFactory);
	}
}
