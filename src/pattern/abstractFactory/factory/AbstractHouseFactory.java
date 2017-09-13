package pattern.abstractFactory.factory;

import pattern.abstractFactory.product.House;

/**
 * Abstract factory
 */
public interface AbstractHouseFactory {
	public House createHouse();
}
