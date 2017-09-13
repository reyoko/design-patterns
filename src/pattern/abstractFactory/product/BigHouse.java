package pattern.abstractFactory.product;

/**
 * Concrete product 2
 */
public class BigHouse implements House{

	@Override
	public void printQuantityOfRooms() {
		System.out.println("Big House - three bedroom, three bathroom and two living room");
	}

	@Override
	public void setOwner(String owner) {
		owner = owner + " - big house";
	}

}
