package pattern.abstractFactory.factory;

import pattern.abstractFactory.product.BigHouse;
import pattern.abstractFactory.product.House;

/**
 * Concrete Factory 2
 */
public class BigHouseFactory implements AbstractHouseFactory {

	public House createHouse(){
		BigHouse bigHouse = new BigHouse();
		bigHouse.printQuantityOfRooms();
		return bigHouse;
	}
	
}
