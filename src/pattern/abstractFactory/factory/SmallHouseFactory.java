package pattern.abstractFactory.factory;

import pattern.abstractFactory.product.House;
import pattern.abstractFactory.product.SmallHouse;

/**
 * Concrete Factory 1
 */
public class SmallHouseFactory implements AbstractHouseFactory {

	public House createHouse(){
		SmallHouse smallHouse = new SmallHouse();
		smallHouse.printQuantityOfRooms();
		return smallHouse;
	}
	
}
