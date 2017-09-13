package pattern.abstractFactory.product;

/**
 * Concrete product 1
 */
public class SmallHouse implements House{

	@Override
	public void printQuantityOfRooms() {
		System.out.println("Small House - one bedroom, one bathroom and one living room");
	}

	@Override
	public void setOwner(String owner) {
		owner = owner + " - small house";
	}

}
