package pattern.abstractFactory.client;

import pattern.abstractFactory.factory.AbstractHouseFactory;
import pattern.abstractFactory.product.House;

/**
 * Client
 */
public class HouseBuilder {
	public void buildHouse(AbstractHouseFactory houseFactory){
		House house = houseFactory.createHouse();
		house.setOwner("John");
	}
}
